package Lab;

public class Microscope extends LabEquipment {

    public Microscope(String manufacturer,String model,int year,int magnification)
    {
        super(manufacturer,model,year);
        setMagnification(magnification);;
    }

    public Microscope(Microscope mp)
    {
        super(mp);
        setMagnification(mp.magnification);
    }

    private int magnification;

    static final int MIN_MAG = 1;

    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if(magnification < MIN_MAG)
        {
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance()
    {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public LabEquipment clone()
    {
        return new Microscope(this);
    }

}
