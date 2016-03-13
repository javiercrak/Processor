package code;

public @interface AlternativeNoExcludent {

	String featureName() default "";
	boolean mandatory() default false;
}
