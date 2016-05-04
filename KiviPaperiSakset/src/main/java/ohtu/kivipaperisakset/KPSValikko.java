package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSValikko {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void aloita() {
        do {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
        } while(KPSTehdas.uusiPeli(scanner.nextLine()));
    }
}
