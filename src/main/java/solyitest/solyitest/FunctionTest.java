package solyitest.solyitest;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> functionTest = x -> x+10;
        int result = functionTest.apply(5);
        System.out.println(result);
    }
}
