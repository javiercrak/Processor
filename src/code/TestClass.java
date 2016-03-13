package code;

@Feature(featureName="TestClass1")
public class TestClass {

	@OptionFeature(featureName="TestClass2", mandatory = false)
	public TestClass(){}
	
	@OptionFeature(featureName="TestClass3", mandatory = true)
	private void foo(){}
}
