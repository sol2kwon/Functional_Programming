package solyitest.solyitest;


public class TriFunctionTest {
    public static void main(String[] args) {
    TriFunction<Integer,Integer,Integer,Integer> addThreeNumbers =(x,y,z)->x+y+z;
    int result = addThreeNumbers.apply(1,3,5);
        System.out.println(result);
    }
}
