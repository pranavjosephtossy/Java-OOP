package office;
import dataenum.*;
import city.innerCity;

public class midDensityOffice extends officeSuperClass implements innerCity
{
    public midDensityOffice(int noEmployees, energyRating energyRating)
    {
        this.noEmployees=noEmployees;
        this.energyRating=energyRating;
        this.zoningType="midDensityOffice";
        this.zoningClass="Office";
    }
    public String getZoningType()
    {
        return this.zoningType;
    }
    public final String getSubsidies()
    {
        tax=8000;
        return "Tax is = "+tax;
    }
    @Override
    public String toString() 
    {        
        return "employees: "+this.noEmployees+"\nenergy: "+this.energyRating;
    }
    
    
}
