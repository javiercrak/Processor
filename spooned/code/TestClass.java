package code;


@code.Feature(featureName = "TestClass1")
public class TestClass {
    int i;
    
    java.lang.String s;
    
    java.lang.Object o;
    
    @code.OptionFeature(featureName = "TestClass2")
    public TestClass() {
    }
    
    @code.OptionFeature(featureName = "TestClass3")
    private void foo() {
        (this.i)++;
    }
    
}

