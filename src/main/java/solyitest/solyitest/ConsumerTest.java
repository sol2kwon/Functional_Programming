package solyitest.solyitest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumerTest = (String str)-> System.out.println(str);
        consumerTest.accept("hi");

        List<Integer> integerInputs = Arrays.asList(4,2,3);
        Consumer<Integer> integerProcessor = x-> System.out.println("Processing Integer"+x);
//        process(integerInputs,integerProcessor);

        Consumer<Double> doubleProcessor = x-> System.out.println("Processing Double"+x);
        List<Double> doubleInputs = Arrays.asList(5.2,6.9,9.6);
        process(doubleInputs,doubleProcessor);
    }
    //제네릭 타입으로 했을때 다양한 타입을 받을 수 있다.
    public static <T> void process(List<T> inputs, Consumer<T> processor){
        for (T input : inputs){
            processor.accept(input);
        }
    }
    //public static void process(List<Integer> inputs, Consumer<Integer> processor){
    //    for (Integer input : inputs){
    //        processor.accept(input);
    //    }
    //}

}
