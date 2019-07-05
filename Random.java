import java.util.Random;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(roll());




    }
    public static int roll (){
        Random love = new Random();
        int munber = love.nextInt(10)+1;
        return munber ;
    }
}
