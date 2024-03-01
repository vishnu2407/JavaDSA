package Factory_Method.Generic_Factory;

import Factory_Method.Simple_Factory.ConcreteProductA;
import Factory_Method.Simple_Factory.ConcreteProductB;
import Factory_Method.Simple_Factory.Product;

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
