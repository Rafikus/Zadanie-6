package zad6;

/**
 * Created by Rafikus on 04.04.2017.
 */
public class Osoba extends Wpis {
    String imie, nazwisko, adres;
    NrTelefoniczny nrTelefonu;

    public Osoba(String imie, String nazwisko, String adres, int nrKierunkowy, int nrTelefonu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nrTelefonu = new NrTelefoniczny(nrKierunkowy, nrTelefonu);
    }
    @Override
    void Opis() {
        System.out.println("Imię: " + imie + System.lineSeparator()
                + " Nazwisko: " + nazwisko + System.lineSeparator()
                + " Adres: " + adres + System.lineSeparator()
                + " Numer Telefonu: +" + nrTelefonu.getNrKierunkowy() + nrTelefonu.getNrTelefonu());
    }

    @Override
    NrTelefoniczny getNrTel() {
        return this.nrTelefonu;
    }

}
