import java.util.Random;
import java.util.Scanner;
public class Main {
    static int randomNum;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(mySqrt(8));
    }
    public static double mySqrt(int number) {
        double temp;
        double sqrt = number;
        do {
            temp = sqrt ;
            sqrt = (temp + (number / temp ))/2 ;
        } while ((temp - sqrt) != 0);
        return sqrt;
    }
}
