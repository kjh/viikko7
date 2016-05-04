package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    @Override
    protected String toisenPelaajanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }
}