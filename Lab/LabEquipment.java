package Lab;

public abstract class LabEquipment {
    private String manufacturer;
    private String model;
    private int year;

    final static int MIN_YEAR = 1950;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public LabEquipment(LabEquipment obj)
    {
        setManufacturer(obj.manufacturer);
        setModel(obj.model);
        setYear(obj.year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if(manufacturer == null || manufacturer == "")
        {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if(model == null || model == "")
        {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year < MIN_YEAR)
        {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }

    public abstract String performMaintenance();

    public abstract LabEquipment clone();

}
