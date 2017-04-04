package zad6;

import java.util.Comparator;

/**
 * Created by Rafikus on 04.04.2017.
 */
public class NrTelefoniczny implements Comparable{
    private int nrKierunkowy, nrTelefonu;

    public NrTelefoniczny(int nrKierunkowy, int nrTelefonu)
    {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    public int getNrKierunkowy()
    {
        return nrKierunkowy;
    }

    public int getNrTelefonu()
    {
        return nrTelefonu;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
