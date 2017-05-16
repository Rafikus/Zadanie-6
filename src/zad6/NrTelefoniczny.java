package zad6;

/**
 * Created by Rafikus on 04.04.2017.
 */
public class NrTelefoniczny implements Comparable<NrTelefoniczny>{
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
    public int compareTo(NrTelefoniczny other) {
        String thisValue = String.valueOf(this.nrKierunkowy) + String.valueOf(this.nrTelefonu);
        String otherValue = String.valueOf(other.nrKierunkowy) + String.valueOf(other.nrTelefonu);

        if (Float.parseFloat(thisValue) > Float.parseFloat(otherValue)){
            return 1;
        }
        else if(Float.parseFloat(thisValue) == Float.parseFloat(otherValue))
        {
            return 0;
        }
            return -1;
    }
}
