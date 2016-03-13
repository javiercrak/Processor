package code;


public @interface AlternativeNoExcludent {
    java.lang.String featureName() default "";
    
    boolean mandatory() default false;
    
}

