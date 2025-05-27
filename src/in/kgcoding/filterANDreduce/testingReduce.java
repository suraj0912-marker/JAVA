package in.kgcoding.filterANDreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class testingReduce {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 3, 4, 2, 5, 6, 3);
        int newSum = number.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.printf("\n sum using reduce is %d", newSum);
// reducing technique
        int sumNum2 = number.stream().reduce(0, (a, b) -> a + b);
        System.out.printf("\n sum using reduce is %d", sumNum2);

        int max=number.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.printf("\n Max using reduce is %d", max);
    }

}
