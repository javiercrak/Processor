package processor;

import java.lang.annotation.Annotation;

import annotation.Feature;
import generated.And;
import generated.NamedElement;
import generated.ObjectFactory;
import generated.Parent;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtAnnotation;

public class FeatureProcessor extends AbstractProcessor<CtAnnotation<Feature>> {
	
	@Override
	public void init() {
		System.out.println("Iniciando procesamiento de clases y metodos con anotaciones");
		super.init();
	}
	
	
	public void process(CtAnnotation<Feature> annotation) {
		
		System.out.println("Se ha encontrado la anotación: -- "+annotation.getAnnotationType().getSimpleName() + " -- En la clase: -- "+annotation.getParent().getSignature()+" --");
		if(annotation.getAnnotationType().getSimpleName().equals("Feature")){
			Parent parent= FeatureContainer.getInstance().getStruct().getAnd();
			ObjectFactory factory = new ObjectFactory();
			generated.And and = factory.createAnd();
			and.setName(annotation.getElementValue("featureName").toString());
			parent.getAndOrAltOrOr().add(and);
		}else if(annotation.getAnnotationType().getSimpleName().equals("OptionFeature")){
			Parent parent = new Parent();
			for (CtAnnotation<? extends Annotation> anotacionParent : annotation.getParent().getParent().getAnnotations()) {
				System.out.println("Anotación del padre: "+anotacionParent.getAnnotationType().getSimpleName());
				if(anotacionParent.getAnnotationType().getSimpleName().equals("Feature")){
					//Si es una feature entonces debemos de buscarlo como padre de nuestra hojita
					for (Object featuresHija : FeatureContainer.getInstance().getStruct().getAnd().getAndOrAltOrOr()) {
						NamedElement and = (NamedElement) featuresHija;
						if(anotacionParent.getElementValue("featureName").toString().equals(and.getName())){
							System.out.println("Se ha encontrado en el arbol el feature padre: "+and.getName());
							parent = (And) featuresHija;
							break;
						}
					}
				}
			}
			ObjectFactory factory = new ObjectFactory();
			generated.Feature feature = factory.createFeature();
			feature.setName(annotation.getElementValue("featureName").toString());
			parent.getAndOrAltOrOr().add(feature);
		}

	}	


}
