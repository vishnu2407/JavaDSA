package Factory_Method.Simple_Factory;

public class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("Concrete Product A operation");
    }
}