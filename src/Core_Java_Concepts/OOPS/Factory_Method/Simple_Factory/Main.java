package Core_Java_Concepts.OOPS.Factory_Method.Simple_Factory;

public class Main {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.operation();

        Product productB = SimpleFactory.createProduct("B");
        productB.operation();
    }
}