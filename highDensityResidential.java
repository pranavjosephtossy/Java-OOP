package residential;
import city.innerCity;
import dataenum.*;

public class highDensityResidential extends residentialSuperClass implements innerCity
{
    public highDensityResidential(int noFamilies, boolean gardenSpace, energyRating energyRating)   
 {
    this.noFamilies=noFamilies;
    this.gardenSpace=gardenSpace;
    this.energyRating=energyRating;

    this.zoningType="highDensityResidential";
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
