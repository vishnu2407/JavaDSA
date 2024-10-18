package Core_Java_Concepts.OOPS.Factory_Method.Static_Factory;

import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductA;
import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductB;
import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class StaticFactory {
    public static Product createProductA() {
        return new ConcreteProductA();
    }

    public static Product createProductB() {
        return new ConcreteProductB();
    }
}

// Same Product and ConcreteProduct classes as in the Simple Factory Method example

