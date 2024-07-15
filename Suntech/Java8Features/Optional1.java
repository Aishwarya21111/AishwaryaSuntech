package Suntech.Java8Features;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional <String> name = getName(2);
        // if(name.isPresent()){
        //     System.out.println(name.get());
        // }
       System.out.println( name.orElse("not present"));

        
    }
    static Optional <String> getName(int id ){
        // String name = null;

        // return Optional.ofNullable(name);
        // return Optional.of("shweta");
        return Optional.empty();

    }
}
