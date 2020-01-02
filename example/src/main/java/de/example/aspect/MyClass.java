package de.example.aspect;

@SomeAnnotation
public class MyClass
{
    public MyClass(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        System.out.println(
          ((IAspect) new MyClass()).hello()
        );
    }
}
