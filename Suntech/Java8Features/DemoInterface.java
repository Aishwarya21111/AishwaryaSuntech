package Suntech.Java8Features;

interface Parent{
    default void sayHello(){
        System.out.println("Parent says Hello ");
    }
}
class Child implements Parent{
    public void sayHello(){
        System.out.println("Child says Hello");
    }

}



public class DemoInterface {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();
        p.sayHello();
        c.sayHello();
    }
    
}
