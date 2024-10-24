package Core_Java_Concepts.OOPS.Factory_Method.Generic_Factory;


import Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory.Product;

public class GenericFactory<T extends Product> {
    public T createProduct(Class<T> type) throws IllegalAccessException, InstantiationException {
        return type.newInstance();
    }
}

// Same Product and ConcreteProduct classes as in the Simple Factory Method example

