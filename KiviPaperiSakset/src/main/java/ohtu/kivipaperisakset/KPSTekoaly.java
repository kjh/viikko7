package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPSPeli {
    Tekoaly tekoaly;
    
    public KPSTekoaly() {
        this.tekoaly = new Tekoaly();
    }

    @Override
    protected String toisenPelaajanSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}