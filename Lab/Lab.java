package Lab;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labEquipments;
    
    public Lab()
    {
        labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index)
    {
        return (this.labEquipments.get(index)).clone();
    }

    public void setLabEquipment(LabEquipment obj,int index)
    {
        labEquipments.set(index, obj.clone());
    }

    public void addLabEquipment(LabEquipment obj)
    {
        labEquipments.add(obj.clone());
    }
}

