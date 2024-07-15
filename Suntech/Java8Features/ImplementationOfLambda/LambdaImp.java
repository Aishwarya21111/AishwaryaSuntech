package Suntech.Java8Features.ImplementationOfLambda;

public class LambdaImp  {
    public static void main(String[] args) {
        Employee emp = () -> "Hi there I am the new Employee Aishwarya";
        System.out.println(emp.getName());
        Employee sd =() -> "Software Developer";
        System.out.println(sd.getName());
        Employee editor =() -> "Editor";
        System.out.println(editor.getName());

    }

    
}
