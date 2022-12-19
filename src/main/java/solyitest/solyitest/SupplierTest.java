package solyitest.solyitest;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
//        Supplier<String> supplierTest =()-> "hello,Supplier";

        Supplier<Double> supplierRandomTest = () -> Math.random();
        printDouble(supplierRandomTest,2);

    }
    public static void printDouble (Supplier<Double>randomSupplier,int count){
        for (int i = 0; i<count; i ++){
            System.out.println(randomSupplier.get());
        }
    }
}
