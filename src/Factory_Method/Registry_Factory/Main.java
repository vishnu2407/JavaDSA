package Factory_Method.Registry_Factory;

import Factory_Method.Simple_Factory.ConcreteProductA;
import Factory_Method.Simple_Factory.ConcreteProductB;
import Factory_Method.Simple_Factory.Product;

public class Main {
    public static <Object_1, Object_2> void main(String[] args) {
        Object_1 ConcreteProductA;
        RegistryFactory.registerProduct("A", Factory_Method.Simple_Factory.ConcreteProductA::new);
        Object_2 ConcreteProductB;
        RegistryFactory.registerProduct("B", Factory_Method.Simple_Factory.ConcreteProductB::new);

        Product productA = RegistryFactory.createProduct("A");
        productA.operation();

        Product productB = RegistryFactory.createProduct("B");
        productB.operation();
    }
}
