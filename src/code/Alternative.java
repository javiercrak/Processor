package code;

public @interface Alternative {
	String featureName() default "";
	boolean mandatory() default false;
}
