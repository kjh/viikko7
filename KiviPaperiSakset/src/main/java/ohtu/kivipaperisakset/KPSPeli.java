package ohtu.kivipaperisakset;

public abstract class KPSPeli {
    protected IO io;
    private Kirjuri kirjuri;
    
    public KPSPeli(IO io, Kirjuri kirjuri) {
        this.io = io;
        this.kirjuri = kirjuri;
    }
    
    public void pelaa() {
        String ekanSiirto;
        String tokanSiirto;
        
        do {
            io.print("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            io.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = io.read();
            tokanSiirto = tokanVuoro();
            kirjuri.kirjaaSiirto(ekanSiirto, tokanSiirto);
            io.print(kirjuri);
        } while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto));

        io.print("Kiitos!");
        io.print(kirjuri);
    }
    
    protected abstract String tokanVuoro();
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
