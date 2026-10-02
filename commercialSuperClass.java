package commercial;
import dataenum.*;

public abstract class commercialSuperClass 
{ 
    protected int noEmployees;
    protected operatingHours operatingHours;
    protected energyRating energyRating;
    protected String zoningType;
    protected String zoningClass;
    public double sub;
    
    @Override
    public String toString() 
    {
        return "commercialSuperClass [noEmployees, operatingHours, energyRating]";
    }
    public final double subsidies()
    {
        sub=10000;
        return sub;
    }
    
    

    
    
}