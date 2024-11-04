package DSA_JAVA_Concepts.Recursion;

public class Tower0f_Hanoi {
    //`n` is the number of disks
    public static void towerofHanoi(int n, String Source, String Helper, String Destination){
        towerofHanoi(n-1, Source, Destination, Helper);
    }

    public static void main(String[] args) {
        int n = 3;
    }
}
