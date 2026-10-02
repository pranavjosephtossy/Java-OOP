package office;
import dataenum.*;
public class lowDesnsityOffice extends officeSuperClass
{
    public lowDesnsityOffice(int noEmployees, energyRating energyRating)
    {
        this.noEmployees=noEmployees;
        this.energyRating=energyRating;
        this.zoningType="lowDesnsityOffice";
        this.zoningClass="Office";
    }
    public String getZoningType()
    {
        return this.zoningType;
    }
    public final String getSubsidies()
    {
        tax=5000;
        return "Tax is = "+tax;
    }
    @Override
    public String toString() 
    {        
        return "employees: "+this.noEmployees+"\nenergy: "+this.energyRating;
    }
    
    
}
