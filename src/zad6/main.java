package zad6;

import java.util.*;

/**
 * Created by Rafikus on 04.04.2017.
 */

public class main {

    public static void main(String[] args)
    {
        Wpis array[] = new Wpis[6];

        array[0] = new Osoba("Janusz", "Kowalski", "Łódź", 41, 505988838);
        array[1] = new Osoba("Marian", "Marian", "Warszawa", 42, 522422122);
        array[2] = new Osoba("Marzena", "Polka", "Kraków", 43, 525423122);

        array[3] = new Firma("Polplex", "Radom", 32, 525113342);
        array[4] = new Firma("Norway", "Warszawa", 12, 455711265);
        array[5] = new Firma("Starter", "Łódź", 42, 789444532);

        TreeMap<NrTelefoniczny, Wpis> tmap = new TreeMap<>();

        for (Wpis wpis:array) {
            tmap.put(wpis.getNrTel(), wpis);
        }


        for (Map.Entry<NrTelefoniczny, Wpis> entry : tmap.entrySet()) {
            Wpis wpis = entry.getValue();
            wpis.Opis();
        }
    }

}
