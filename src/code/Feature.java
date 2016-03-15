package code;

public @interface Feature {

	String featureName() default "";
	boolean mandatory() default false;
}
