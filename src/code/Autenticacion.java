package code;

@Feature(featureName="Autenticacion")
public class Autenticacion {

	int i;
	String s;
	Object o;
	
	public Autenticacion(){}

	@OptionFeature(featureName="Facebook",mandatory=false)
	private void facebook(){
		this.i++;
	}
	
	@OptionFeature(featureName="Twitter",mandatory=false)
	private void twitter(){
		this.i++;
	}
}
