import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayinizi Giriniz : ");
        a = scan.nextInt();
        System.out.print("2. Sayinizi Giriniz : ");
        b = scan.nextInt();
        System.out.print("3. Sayinizi Giriniz : ");
        c = scan.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.print("a<b<c ");
            } else {
                System.out.print("a<c<b");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print("b < a < c");

            } else {
                System.out.print("b < c < a");
            }


        } else {
            if (a < b) {
                System.out.print("c < a < b");
            } else {
                System.out.print("c<b<a");
            }


        }


    }

}

