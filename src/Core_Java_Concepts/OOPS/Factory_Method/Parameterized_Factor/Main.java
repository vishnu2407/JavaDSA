package Core_Java_Concepts.OOPS.Factory_Method.Parameterized_Factor;

import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class Main {
    public static void main(String[] args) {
        Product productA = ParameterizedFactory.createProduct("A");
        productA.operation();

        Product productB = ParameterizedFactory.createProduct("B");
        productB.operation();
    }
}
