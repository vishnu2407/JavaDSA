package PackageInheritance;

public interface ClassB
{
    default void Human(String name, String action){
        System.out.println(name + " is " + action);
    }

    void Human();

    // default void Human();
}
