package office;
import dataenum.*;
public abstract class officeSuperClass 
{
    protected int noEmployees;
    protected energyRating energyRating;
    protected String zoningType;
    protected String zoningClass;
    public float tax;
    public int getNoEmployees() {
        return noEmployees;
    }
    public void setNoEmployees(int noEmployees) {
        this.noEmployees = noEmployees;
    }
    public energyRating getEnergyRating() {
        return energyRating;
    }
    public void setEnergyRating(energyRating energyRating) {
        this.energyRating = energyRating;
    }
    public String getZoningType() {
        return zoningType;
    }
    public void setZoningType(String zoningType) {
        this.zoningType = zoningType;
    }
    public String getZoningClass() {
        return zoningClass;
    }
    public void setZoningClass(String zoningClass) {
        this.zoningClass = zoningClass;
    }
    
    @Override
    public String toString() {
        return "officeSuperClass [noEmployees, energyRating, zoningType, zoningClass]";
    }
    
}
