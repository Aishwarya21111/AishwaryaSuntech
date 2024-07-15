package Suntech.Java8Features;
import java.util.function.Predicate;



public class Predicate1 {
    public static void main(String[] args) {
        Predicate <Integer> SalaryGreaterThanTenLac = x -> x > 1000;
        System.out.println(SalaryGreaterThanTenLac.test(200));
        System.out.println(SalaryGreaterThanTenLac.test(10000));

        Predicate <Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(23));

        //string
        Predicate <String> startsWithLetterV = x->x.toLowerCase().charAt(0)== 'v';
        Predicate <String> endsWithLetterJ = x-> x.toLowerCase().charAt(x.length()-1)=='j';
        //and
        Predicate <String> and = startsWithLetterV.and(endsWithLetterJ);
        System.out.println(and.test("Vashj"));
        //or
        Predicate <String> or = startsWithLetterV.and(endsWithLetterJ);
        System.out.println(or.test("Vansh"));
        //negate
        System.out.println(startsWithLetterV.negate().test("vansh"));
        //isEqual
        Predicate <Object> predicate = Predicate.isEqual("Vipul");
        System.out.println(predicate.test("Vipul"));

        



    }
    
}
