package zad6;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Rafikus on 04.04.2017.
 */
public class main {

    public static void main(String[] args)
    {
        TreeMap<NrTelefoniczny, Osoba> tmap = new TreeMap<NrTelefoniczny, Osoba>();

      /*Adding elements to TreeMap*/

      tmap.put(new NrTelefoniczny(48, 505988838), new Osoba("Rafał", "Kusy", "Motylowa", 48, 505988838));


      /* Display content using Iterator*/
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue());
        }
    }

}
