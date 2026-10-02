package office;
import city.innerCity;
import dataenum.*;
public class highDensityOffice extends officeSuperClass implements innerCity
{
    public highDensityOffice(int noEmployees, energyRating energyRating)
    {
        this.noEmployees=noEmployees;
        this.energyRating=energyRating;
        this.zoningType="highDensityOffice";
        this.zoningClass="Office";
    }
    public String getZoningType()
    {
        return this.zoningType;
    }
    public final String getSubsidies()
    {
        tax=10000;
        return "Tax is = "+tax;
    }
    @Override
    public String toString() 
    {        
        return "employees: "+this.noEmployees+"\nenergy: "+this.energyRating;
    }
    
    
}
