package Core_Java_Concepts.OOPS.Factory_Method.Generic_Factory;

import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductA;
import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductB;
import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenericFactory<ConcreteProductA> factoryA = new GenericFactory<>();
        Product productA = factoryA.createProduct(ConcreteProductA.class);
        productA.operation();

        GenericFactory<ConcreteProductB> factoryB = new GenericFactory<>();
        Product productB = factoryB.createProduct(ConcreteProductB.class);
        productB.operation();
    }
}
