package ohtu.kivipaperisakset;

public class KPSTehdas {
    
    public static KPSPeli uusiPeli(String valinta) {
        if (valinta.equals("a")) {
            return new KPSPelaajaVsPelaaja(new KonsoliIO(), new Tuomari());
        } else if (valinta.equals("b")) {
            return new KPSTekoaly(new KonsoliIO(), new Tuomari());
        } else if (valinta.equals("c")) {
            return new KPSParempiTekoaly(new KonsoliIO(), new Tuomari(), 20);
        } 
        
        return null;
    }
}
