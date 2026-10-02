package industrial;
import dataenum.*;
public abstract class industrialSuperClass 
{
    protected int noEmployees;
    protected safetyRating safetyRating;
    protected energyRating energyRating;
    protected String zoningType;
    protected String zoningClass;
    public float tax=10;

    public industrialSuperClass(int noEmployees, safetyRating safetyRating, energyRating energyRating)
    {
        
        this.noEmployees=noEmployees;
        this.safetyRating=safetyRating;
        this.energyRating=energyRating;
    }
    
    public abstract float getTax();
    @Override
    public String toString() 
    {
        return "industrialSuperClass [noEmployees, safetyRating, energyRating, zoningType, zoningClass ]";
    }

    
    
}
