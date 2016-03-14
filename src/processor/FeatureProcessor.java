package processor;

import java.lang.annotation.Annotation;

import annotation.Feature;
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
			and.setMandatory((Boolean)annotation.getElementValue("mandatory"));
			parent.getAndOrAltOrOr().add(and);
		}else if(annotation.getAnnotationType().getSimpleName().equals("OptionFeature")){
			Parent parent = new Parent();
			for (CtAnnotation<? extends Annotation> anotacionParent : annotation.getParent().getParent().getAnnotations()) {
				System.out.println("Anotación del padre: "+anotacionParent.getAnnotationType().getSimpleName());
				if(anotacionParent.getAnnotationType().getSimpleName().equals("Feature") || 
						anotacionParent.getAnnotationType().getSimpleName().equals("Alternative") ||
						anotacionParent.getAnnotationType().getSimpleName().equals("AlternativeNoExcludent")){
					//Si es una feature entonces debemos de buscarlo como padre de nuestra hojita
					for (Object featuresHija : FeatureContainer.getInstance().getStruct().getAnd().getAndOrAltOrOr()) {
						NamedElement and = (NamedElement) featuresHija;
						if(anotacionParent.getElementValue("featureName").toString().equals(and.getName())){
							parent = (Parent) featuresHija;
							break;
						}
					}
				}
			}
			ObjectFactory factory = new ObjectFactory();
			generated.Feature feature = factory.createFeature();
			feature.setName(annotation.getElementValue("featureName").toString());
			feature.setMandatory((Boolean)annotation.getElementValue("mandatory"));
			parent.getAndOrAltOrOr().add(feature);
		}else if(annotation.getAnnotationType().getSimpleName().equals("Alternative")){
			Parent parent= FeatureContainer.getInstance().getStruct().getAnd();
			ObjectFactory factory = new ObjectFactory();
			generated.Alt and = factory.createAlt();
			and.setName(annotation.getElementValue("featureName").toString());
			and.setMandatory((Boolean)annotation.getElementValue("mandatory"));
			parent.getAndOrAltOrOr().add(and);
		}else if(annotation.getAnnotationType().getSimpleName().equals("AlternativeNoExcludent")){
			Parent parent= FeatureContainer.getInstance().getStruct().getAnd();
			ObjectFactory factory = new ObjectFactory();
			generated.Or and = factory.createOr();
			and.setName(annotation.getElementValue("featureName").toString());
			and.setMandatory((Boolean)annotation.getElementValue("mandatory"));
			parent.getAndOrAltOrOr().add(and);
		}

	}	


}
