package Week11.com.coderscampus.lesson4;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericsApplication {
    
    @Test
    public void generics_examples(){
        List<String> list = new ArrayList<>();

        list.add("First string value");
        list.add("Second string value");
        list.add("E");

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void more_generics_examples(){
        MyPair<Integer, String> myPair = new MyPair<>(1, "one");
        myPair.getKey();
        myPair.getValue();
    }

    @Test
    public void specifiing_generic_types_at_method_level (){
        String val = Transformer.join(1, 2.0);
        System.out.println(val);
    }

    @Test
    public void wildcard_in_generics(){
        List<Integer> list = new ArrayList<>();
        Transformer.join(list);
    }

}
