package Magazine;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary()
    {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index)
    {
        return new Magazine(this.magazines.get(index));
    }

    public void setMagazine(Magazine mag,int index)
    {
        this.magazines.set(index, new Magazine(mag));
    }

    public void addMagazine(Magazine mag)
    {
        this.magazines.add(new Magazine(mag));
    }


}
