package ohtu.kivipaperisakset;

public class KPSParempiTekoaly extends KPSPeli {
    
    private TekoalyParannettu tekoaly;
    
    public KPSParempiTekoaly(IO io, Kirjuri kirjuri, int muistinKoko) {
        super(io, kirjuri);
        
        this.tekoaly = new TekoalyParannettu(muistinKoko);
    }

    @Override
    protected String tokanVuoro() {
        String tokanSiirto = tekoaly.annaSiirto();
        io.print("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}
