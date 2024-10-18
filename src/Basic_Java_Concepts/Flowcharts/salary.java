package Basic_Java_Concepts.Flowcharts;

public class salary {
    public static void main(String[] args) {
        // Your code for the main method goes here, if needed
        int salary = 50000;

        //System.out.println(salary);
        //Bonus is added to the actual salary
        if (salary > 10000) {
            salary += 2000; //salary = salary + 2000
            System.out.println(salary +" : "+ "2000 Bonus is added to the actual salary");
        }
        else if (salary > 20000){
            salary += 5000; //salary = salary + 5000
            System.out.println(salary +" : "+ "5000 Bonus is added to the actual salary");
        }
        else {
            salary += 1000; //salary = salary + 1000
            System.out.println(salary +" : "+ "1000 Bonus is added to the actual salary");
        }
    }
}