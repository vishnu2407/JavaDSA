package Core_Java_Concepts.OOPS.Factory_Method.Static_Factory;

import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class Main {
    public static void main(String[] args) {
        Product productA = StaticFactory.createProductA();
        productA.operation();

        Product productB = StaticFactory.createProductB();
        productB.operation();
    }
}
