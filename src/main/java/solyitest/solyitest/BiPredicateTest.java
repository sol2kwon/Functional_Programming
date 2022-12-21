package solyitest.solyitest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicateTest = x -> x > 0; //양수인지 확인하는 로직
        System.out.println(predicateTest.test(-10));

        List<Integer> inputs = Arrays.asList(10,-4,3,-1,0);
        System.out.println("Positive number:"+filter(inputs,predicateTest)); // 양수인 값들을 출력 [10,3]
        System.out.println("Non-positive number:"+filter(inputs,predicateTest.negate())); // 조건에 반대인 값을 출력, 즉 양수가 아닌 값들을 출력 [-4,-1,0]
        System.out.println("Non-negative number:"+filter(inputs,predicateTest.or( x-> x==0))); //or 조건, 즉 양수이거나 0인 값들을 출력 [10,3,0]
        System.out.println("Positive even number:"+filter(inputs,predicateTest.and( x-> x % 2 ==0))); //and 조건, 즉 양수이면서 짝수인 값들을 출력 [10]
    }
    public static <T> List <T> filter (List<T>inputs,Predicate<T> condition){
        List<T> output = new ArrayList<>(); // out 담을 list 생성
        //inputs 값들을 하나씩 확인하여 true일때 add하여 새로운 list로 반환한다.
        for (T input : inputs){
            if (condition.test(input)){
                output.add(input);
            }
        }
        return output;

    }
}
