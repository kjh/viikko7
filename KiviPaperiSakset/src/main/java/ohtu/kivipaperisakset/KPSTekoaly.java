package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPSPeli {
    private Tekoaly tekoaly;
    
    public KPSTekoaly(IO io, Kirjuri kirjuri) {
        super(io, kirjuri);
        this.tekoaly = new Tekoaly();
    }

    @Override
    protected String tokanVuoro() {
        String tokanSiirto = tekoaly.annaSiirto();
        io.print("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}