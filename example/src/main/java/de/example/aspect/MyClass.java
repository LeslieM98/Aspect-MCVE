package de.example.aspect;

@SomeAnnotation
public class MyClass
{
    public MyClass(){
        System.out.println("Test");
    }

    public static void main(String[] args)
    {
        MyClass a = new MyClass();
        System.out.println(a.equals(a));
    }
}
