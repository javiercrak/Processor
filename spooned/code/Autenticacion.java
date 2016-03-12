package code;


@code.Feature(featureName = "Autenticacion")
public class Autenticacion {
    int i;
    
    java.lang.String s;
    
    java.lang.Object o;
    
    public Autenticacion() {
    }
    
    @code.OptionFeature(featureName = "Facebook", mandatory = false)
    private void facebook() {
        (this.i)++;
    }
    
    @code.OptionFeature(featureName = "Twitter", mandatory = false)
    private void twitter() {
        (this.i)++;
    }
    
}

