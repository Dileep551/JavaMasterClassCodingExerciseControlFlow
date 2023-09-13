public class InterestCalculate {


    public static void main(String[] args) {

        calculateInterest(100);

    }
    public static void calculateInterest(int amount){

        for(double interest = 7.5; interest <= 10; interest+=0.25){

            System.out.println(amount * (interest / 100));
        }

    }
}
