package Core_Java_Concepts.OOPS.Factory_Method.Parameterized_Factor;

import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductA;
import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.ConcreteProductB;
import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class ParameterizedFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}

// Same Product and ConcreteProduct classes as in the Simple Factory Method example

