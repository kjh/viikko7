package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    public KPSPelaajaVsPelaaja(IO io, Kirjuri kirjuri) {
        super(io, kirjuri);
    }
    
    @Override
    protected String tokanVuoro() {
        io.print("Toisen pelaajan siirto: ");
        return io.read();
    }
}