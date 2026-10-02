package residential;
import dataenum.*;
import city.*;

public class lowRentResidential extends residentialSuperClass implements outerCity
{
    public lowRentResidential(int noFamilies, boolean gardenSpace, energyRating energyRating)   
 {
    this.noFamilies=noFamilies;
    this.gardenSpace=gardenSpace;
    this.energyRating=energyRating;

    this.zoningType="lowRentResidential";
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

public String noiseLevel() {
    return "Medium";
}
    
}
