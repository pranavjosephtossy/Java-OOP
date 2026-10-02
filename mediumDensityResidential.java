package residential;
import dataenum.*;
import city.innerCity;
public class mediumDensityResidential extends residentialSuperClass implements innerCity
{
    public mediumDensityResidential(int noFamilies, boolean gardenSpace, energyRating energyRating)   
 {
    this.noFamilies=noFamilies;
    this.gardenSpace=gardenSpace;
    this.energyRating=energyRating;

    this.zoningType="mediumDensityResidential";
    this.zoningClass="residential";
 }
 public String getZoningType()
    {
        return this.zoningType;
    } 

@Override
public String toString() {
    return "families= "+this.noFamilies+
    "\ngarden= "+this.gardenSpace+
    "\nenergy= "+this.energyRating;
}
    
}
