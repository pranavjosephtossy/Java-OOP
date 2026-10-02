package industrial;
import city.innerCity;
import dataenum.*;
public class randdIndustrial extends industrialSuperClass implements innerCity
{
    public randdIndustrial(int noEmployees, safetyRating safetyRating, energyRating energyRating)
    {
        super(noEmployees, safetyRating, energyRating);
        this.zoningType="randdIndustrial";
        this.zoningClass="Industrial";
    }

    public int getNoEmployees() {
        return noEmployees;
    }
    public void setNoEmployees(int noEmployees) {
        this.noEmployees = noEmployees;
    }
    public safetyRating getSafetyRating() {
        return safetyRating;
    }
    public void setSafetyRating(safetyRating safetyRating) {
        this.safetyRating = safetyRating;
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
    public String toString() 
    {
        return "no employees: "+this.noEmployees+
        "\nsafety: "+ this.safetyRating+
        "\nenergy: "+this.energyRating;
    }
    public float getTax() {
        tax= 8*this.noEmployees;
        return tax;
    }
    
}
