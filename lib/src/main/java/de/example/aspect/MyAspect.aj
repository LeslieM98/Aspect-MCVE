package de.example.aspect;

public aspect MyAspect {
  declare parents : @SomeAnnotation * implements MyInterface;

  public interface MyInterface {}

  public String MyInterface.hello() {
    return "hello";
  }

  public boolean MyInterface.equals(Object obj) {
    return false;
  }
}
