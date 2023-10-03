package PackageInheritance;

public class ClassC extends ClassA implements ClassB {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.Animal("Dog", "Run");
        obj.Animal("Lion", "Eat");
        obj.Animal("Cat", "Sleep");
        obj.Animal("Fish", "Swim");
        obj.Human("John", "Run");
        obj.Human("Alice", "Eat");
        obj.Human("Bob", "Sleep");
        obj.Human("Eve", "Work");
        obj.Human("Charlie", "Play");
        obj.Human("Samantha", "Swim");
        obj.Human("Michael", "Dance");
        obj.Human("Emma", "Sing");
        obj.Human("David", "Talk");
    }

    @Override
    public void Human(String name) {
        System.out.println(name + " is a Human");
    }

    @Override
    public void Animal(String name) {
        System.out.println(name + " is an Animal");
    }

    @Override
    public void Human() {
        //System.out.println("Human");
    }
}