package Factory_Method.Static_Factory;

import Factory_Method.Simple_Factory.Product;

public class Main {
    public static void main(String[] args) {
        Product productA = StaticFactory.createProductA();
        productA.operation();

        Product productB = StaticFactory.createProductB();
        productB.operation();
    }
}
