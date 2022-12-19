package solyitest.solyitest;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunctionTest = (x,y) -> x+y;
        int result = biFunctionTest.apply(5,5);
        System.out.println(result);
    }
}
