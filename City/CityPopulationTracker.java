package City;

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker()
    {
        cityPopulations = new HashMap<>();
    }

    public City getCity(String name)
    {
        return new City(cityPopulations.get(name));
    }

    public void setCity(City obj)
    {
        cityPopulations.put(obj.getName(), new City(obj));
    }

    public void addCity(City obj)
    {
        cityPopulations.put(obj.getName(), new City(obj));
    }
}
