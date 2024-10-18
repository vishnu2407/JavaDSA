package Core_Java_Concepts.OOPS.Factory_Method.Registry_Factory;

import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class Main {
    public static <Object_1, Object_2> void main(String[] args) {
        Object_1 ConcreteProductA;
        RegistryFactory.registerProduct("A", Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductA::new);
        Object_2 ConcreteProductB;
        RegistryFactory.registerProduct("B", Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductB::new);

        Product productA = RegistryFactory.createProduct("A");
        productA.operation();

        Product productB = RegistryFactory.createProduct("B");
        productB.operation();
    }
}
