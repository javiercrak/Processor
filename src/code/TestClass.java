package code;

//@Feature(featureName="TestClass1")
public class TestClass {

	int i;
	String s;
	Object o;
	
	//@OptionFeature(featureName="TestClass2")
	public TestClass(){}
	
	//@OptionFeature(featureName="TestClass3")
	private void foo(){
		this.i++;
	}
}
