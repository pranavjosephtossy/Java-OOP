package residential;
import dataenum.*;
public class singleFamilyResidential extends residentialSuperClass
{
 public static int noSingleFamilyResidential=0; 
   
 public singleFamilyResidential(boolean gardenSpace, energyRating energyRating)   
 {
    this.noFamilies=1;
    this.gardenSpace=gardenSpace;
    this.energyRating=energyRating;

    this.zoningType="singleFamilyResidential";
    this.zoningClass="residential";
    noSingleFamilyResidential++;
 }
 public String getZoningType() 
    {
        return this.zoningType;
    }
 
@Override
public String toString() 
{
    return "families= "+this.noFamilies+
    "\ngarden= "+this.gardenSpace+
    "\nenergy= "+this.energyRating;
}
 
}
