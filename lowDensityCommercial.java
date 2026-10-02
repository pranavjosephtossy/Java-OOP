package commercial;
import dataenum.*;
import city.*;

public final class lowDensityCommercial extends commercialSuperClass implements outerCity
{
    

    public lowDensityCommercial(int noEmployees, operatingHours operatingHours, energyRating energyRating)
    {
        this.zoningType="lowDensityCommercial";
        this.zoningClass="Commercial";
        this.noEmployees=noEmployees;
        this.operatingHours=operatingHours;
        this.energyRating=energyRating;
    }

    public int getNoEmployees() {
        return noEmployees;
    }
    public void setNoEmployees(int noEmployees) {
        this.noEmployees = noEmployees;
    }
    public operatingHours getOperatingHours() {
        return operatingHours;
    }
    public void setOperatingHours(operatingHours operatingHours) {
        this.operatingHours = operatingHours;
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
        "\noperating: "+ this.operatingHours+
        "\nenergy: "+this.energyRating;
    }

    public String noiseLevel() {
        return "Medium";
    }

   
}
