package Lab;

public class Centrifuge extends LabEquipment {
    private int maxRPM;

    public Centrifuge(String manufacturer,String model,int year,int maxRPM)
    {
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }

    public Centrifuge(Centrifuge cf)
    {
        super(cf);
        setMaxRPM(cf.maxRPM);
    }

    static final int minRPM = 500;
    
    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM < minRPM)
        {
            throw new IllegalArgumentException("Max RPM must be greatet than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance()
    {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    @Override
    public LabEquipment clone()
    {
        return new Centrifuge(this);
    }
}
