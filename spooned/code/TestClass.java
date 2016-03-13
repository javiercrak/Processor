package code;


@code.Feature(featureName = "TestClass1")
public class TestClass {
    @code.OptionFeature(featureName = "TestClass2", mandatory = false)
    public TestClass() {
    }
    
    @code.OptionFeature(featureName = "TestClass3", mandatory = true)
    private void foo() {
    }
    
}

