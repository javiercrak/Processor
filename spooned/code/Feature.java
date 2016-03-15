package code;


public @interface Feature {
    java.lang.String featureName() default "";
    
    boolean mandatory() default false;
    
}

