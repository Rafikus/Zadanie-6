package zad6;

/**
 * Created by Rafikus on 04.04.2017.
 */
public class Firma extends Wpis {
    String nazwa, adres;
    NrTelefoniczny nrTelefonu;

    Firma(String Nazwa, String Adres, int nrKierunkowy, int nrTelefonu)
    {
        this.nazwa = Nazwa;
        this.adres = Adres;
        this.nrTelefonu = new NrTelefoniczny(nrKierunkowy, nrTelefonu);
    }

    @Override
    void Opis() {
        System.out.println("Nazwa: " + nazwa + System.lineSeparator()
                + " Adres: " + adres + System.lineSeparator()
                + " Numer Telefonu: +" + nrTelefonu.getNrKierunkowy() + nrTelefonu.getNrTelefonu());
    }

    public NrTelefoniczny getNrTel() {
        return nrTelefonu;
    }

}
