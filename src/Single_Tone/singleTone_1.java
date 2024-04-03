package Single_Tone;

public class singleTone_1 {

    private static singleTone_1 instance = new singleTone_1();
    private singleTone_1(){}
    public static singleTone_1 getInstance(){
        return instance;
    }


        public static void main(String[] args) {
            singleTone_1 s1 = singleTone_1.getInstance();
            System.out.println("SingleTone hashcode: " + " " + s1.hashCode());
            singleTone_1 s2 = singleTone_1.getInstance();
            System.out.println("SingleTone hashcode: " + " " + s2.hashCode());

            if (s2.equals(s1)){
                System.out.println("s1 and s2 are same");
            }
            else {
                System.out.println("s1 and s2 are not same");
            }
        }
    }


