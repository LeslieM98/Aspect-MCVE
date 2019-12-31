package de.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspectJ
{

    @DeclareParents(value = "@de.example.aspect.SomeAnnotation *", defaultImpl = IAspectDefaultImpl.class)
    private IAspect implementedInterface;
}
