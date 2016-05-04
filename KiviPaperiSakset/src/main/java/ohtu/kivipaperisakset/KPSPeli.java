package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli implements Peli {
     static final Scanner scanner = new Scanner(System.in);
    
    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        String ekanSiirto;
        String tokanSiirto;
        
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        
        do {
            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();
         
            tokanSiirto = toisenPelaajanSiirto();
            
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
            
        } while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto));

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    protected abstract String toisenPelaajanSiirto();
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
