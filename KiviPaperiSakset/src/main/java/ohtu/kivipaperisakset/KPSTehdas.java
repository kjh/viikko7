package ohtu.kivipaperisakset;

public class KPSTehdas {
    
    public static boolean uusiPeli(String valinta) {
        if (valinta.equals("a")) {
            (new KPSPelaajaVsPelaaja()).pelaa();
            return true;
        } else if (valinta.equals("b")) {
            (new KPSTekoaly()).pelaa();
            return true;
        } else if (valinta.equals("c")) {
            (new KPSParempiTekoaly()).pelaa();
            return true;
        }
        
        return false;
    }
}
