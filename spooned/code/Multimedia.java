package code;


@code.AlternativeNoExcludent(featureName = "Multimedia", mandatory = true)
public class Multimedia {
    public Multimedia() {
    }
    
    @code.OptionFeature(featureName = "Reproducir Video")
    private void reproducirVideo() {
    }
    
    @code.OptionFeature(featureName = "Grabar Video")
    private void grabarVideo() {
    }
    
    @code.OptionFeature(featureName = "Ver fotos")
    private void verFotos() {
    }
    
    @code.OptionFeature(featureName = "Tomar fotos")
    private void tomarFotos() {
    }
    
}

