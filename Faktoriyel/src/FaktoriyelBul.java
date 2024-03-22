import java.util.Scanner;

public class FaktoriyelBul {
    public static void main(String[] args) {
        int number, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyelini istediğiniz sayıyı giriniz: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++)
            result *= i;

        System.out.println(number + " sayısının faktöriyeli = " + result);
    }
}
