import java.util.Scanner;

public class KombinasyonBul {
    public static void main(String[] args) {
        /*
        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        int number1, number2, kombinasyon, result1 = 1, result2 = 1, resultDif = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenizin eleman sayısını giriniz: ");
        number1 = input.nextInt();

        System.out.print("Oluşturulacak grupların kaç elemanlı olmasını istediğinizi giriniz: ");
        number2 = input.nextInt();

        for (int i = 1; i <= number1; i++)
            result1 *= i;

        for (int i = 1; i <= number2; i++)
            result2 *= i;

        for (int i = 1; i <= (number1 - number2); i++)
            resultDif *= i;

        kombinasyon = result1 / (result2 * resultDif);
        System.out.println(number1 + " elemanlı kümenizin " + number2 + " elemanlı farklı gruplarının sayısı = " + kombinasyon);
    }
}
