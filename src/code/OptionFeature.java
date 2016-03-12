package code;

public @interface OptionFeature {

	String featureName() default "";
	boolean mandatory() default false;
}
