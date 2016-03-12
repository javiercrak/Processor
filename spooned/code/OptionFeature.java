package code;


public @interface OptionFeature {
    java.lang.String featureName() default "";
    
    boolean mandatory() default false;
    
}

