package residential;
import dataenum.*;
public abstract class residentialSuperClass 
{
    protected int noFamilies;
    protected boolean gardenSpace;
    protected energyRating energyRating;
    public String zoningType; 
    public String zoningClass;


    public int getNoFamilies() {
        return noFamilies;
    }
    public void setNoFamilies(int noFamilies) {
        this.noFamilies = noFamilies;
    }
    public boolean isGardenSpace() {
        return gardenSpace;
    }
    public void setGardenSpace(boolean gardenSpace) {
        this.gardenSpace = gardenSpace;
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
        return "residentialSuperClass [noFamilies,gardenSpace,energyRating]";
    }

    
    
}
