package de.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareMixin;

@Aspect
public class AspectJ
{
    // This seems to make problems with aspect libraries
    //@DeclareParents(value = "@de.example.aspect.SomeAnnotation *", defaultImpl = IAspectDefaultImpl.class)
    //private IAspect implementedInterface;

    // Better use this alternative instead, see also
    // https://www.eclipse.org/aspectj/doc/released/adk15notebook/ataspectj-itds.html
    @DeclareMixin("@de.example.aspect.SomeAnnotation *")
    public static IAspect createIAspectImplementation() {
        return new IAspectDefaultImpl();
    }
}
