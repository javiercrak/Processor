package processor;

import generated.And;
import generated.FeatureModel;
import generated.ObjectFactory;
import generated.Struct;

public class FeatureContainer {

	private static FeatureModel fm;
	
	private FeatureContainer(){}
	
	public static FeatureModel getInstance(){
		if(fm==null){
			ObjectFactory factory = new ObjectFactory();
			fm = factory.createFeatureModel();
			Struct struct = factory.createStruct();
			
			And root = factory.createAnd();
			root.setName("Biblioteca");

//			generated.Feature feature = factory.createFeature();
//			feature.setName("Lolasoo");
//			
//			Parent parent = root;
//			parent.getAndOrAltOrOr().add(feature);
			
			struct.setAnd(root);
			
			fm.setStruct(struct);
		}
		return fm;
	}
	
}
