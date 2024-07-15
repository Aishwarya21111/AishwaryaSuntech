package Suntech.Java8Features.Anomymous;

public class Anonymous {
    public static void main(String[] args) {
        
    
    EmployeeA eA = new EmployeeA() {
        public int getSalary(){
            return 1000;
        }
        public String getDesignation(){
            return "Software Engineer";
        }
    };
    System.out.println(eA.getDesignation());
    
}}
