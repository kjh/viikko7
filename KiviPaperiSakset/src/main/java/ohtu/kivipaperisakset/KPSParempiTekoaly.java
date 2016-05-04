package ohtu.kivipaperisakset;

public class KPSParempiTekoaly extends KPSPeli {
    
    TekoalyParannettu tekoaly;
    
    public KPSParempiTekoaly() {
        this.tekoaly = new TekoalyParannettu(20);
    }

    @Override
    protected String toisenPelaajanSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}
