package de.example.aspect;

import de.example.aspect.MyAspect.MyInterface;

@SomeAnnotation
public class MyClass {
  public MyClass() {
    System.out.println("Test");
  }

  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    MyInterface myInterface = (MyInterface) myClass;
    System.out.println(myClass.equals(myClass));
    System.out.println(myInterface.equals(myInterface));
    System.out.println(myInterface.hello());
  }
}
