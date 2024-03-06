import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yılı girin:");
        int yil = scanner.nextInt();

        // Artık yıl hesaplama
        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 != 0 || yil % 400 == 0) {
                artikYil = true;
            }
        }

        // Sonucu ekrana yazdırma
        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
