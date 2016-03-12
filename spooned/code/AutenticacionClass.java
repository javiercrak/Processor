package code;


@code.Feature(featureName = "Autenticacion")
public class AutenticacionClass {
    int i;
    
    java.lang.String s;
    
    java.lang.Object o;
    
    public AutenticacionClass() {
    }
    
    @code.Feature(featureName = "Facebook")
    private void facebook() {
        (this.i)++;
    }
    
    @code.Feature(featureName = "Twitter")
    private void twitter() {
        (this.i)++;
    }
    
}

