package in.kgcoding.filterANDreduce;

import java.util.List;
import java.util.function.Consumer;

public class testingFilterReducing {
    public static void main(String[] args) {
        List<String> fruits= List.of("apple","banana","mango");
        System.out.println(fruits.size());
        for (String fruit : fruits) {
            System.out.println(fruits);

        }
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruits) {
                System.out.println(fruits);

            }
        });
    }
}
