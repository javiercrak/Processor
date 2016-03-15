package code;


public @interface Alternative {
    java.lang.String featureName() default "";
    
    boolean mandatory() default false;
    
}

