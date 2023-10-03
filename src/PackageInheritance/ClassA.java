package PackageInheritance;
import java.lang.*;

public abstract class ClassA {
    public void Animal(String name, String action) {
        System.out.println(name + " is " + action);
    }

    public abstract void Human(String name);

    public abstract void Animal(String name);
}