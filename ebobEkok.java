import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz :");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz :");
        int n2 = input.nextInt();
        int i = 1, ebob = 1, ekok = 1;

        if (n1 < n2) {
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
            System.out.println(ebob);
        } else {
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
            System.out.println(ebob);
        }
        System.out.println("-------------------");

        while (i <= (n1 * n2)) {
            i++;

            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }

        }
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK :" + ekok);

    }

}



