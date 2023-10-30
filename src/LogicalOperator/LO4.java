package LogicalOperator;

public class LO4 {
    public static void main(String[] args) {
        // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
        // then press Enter. You can now see whitespace characters in your code.
        //Using Logical NOT  Operator
        boolean male = false;
        int age = 30;
        if( male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");

        else
        if( age < 20 )
            System.out.println("Girl");
        else
            System.out.println("Woman");

    }
}
