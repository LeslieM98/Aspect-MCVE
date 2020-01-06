package de.example.aspect;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = { TYPE })
@Retention(RUNTIME)
public @interface SomeAnnotation {}
