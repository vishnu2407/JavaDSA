package Flowcharts;

public class salary {
    public static void main(String[] args) {
        // Your code for the main method goes here, if needed
        int salary = 10000;

        //System.out.println(salary);
        //Bonus is added to the actual salary
        if (salary >=    10000) {
            salary = salary + 2000;
            System.out.println(salary +" : "+ "2000 Bonus is added to the actual salary");
        } else {
            salary = salary + 1000;
            System.out.println(salary +" : "+ "1000 Bonus is added to the actual salary");
        }
    }
}