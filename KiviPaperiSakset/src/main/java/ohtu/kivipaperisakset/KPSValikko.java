package ohtu.kivipaperisakset;

public class KPSValikko {
    private static final IO io = new KonsoliIO();
    
    public static void aloita() {
        KPSPeli peli;
        boolean lopeta = false;
        
        do {
            io.print("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            
            peli = KPSTehdas.uusiPeli(io.read());
            
            if (peli != null)
                peli.pelaa();
            else
                lopeta = true;
            
        } while(!lopeta);
    }
}
