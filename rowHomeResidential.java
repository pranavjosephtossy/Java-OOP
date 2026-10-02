package residential;
import dataenum.*;
import city.*;

public class rowHomeResidential extends residentialSuperClass implements outerCity
{
    public rowHomeResidential(int noFamilies, boolean gardenSpace, energyRating energyRating)   
    {
        this.noFamilies=noFamilies;
        this.gardenSpace=gardenSpace;
        this.energyRating=energyRating;

        this.zoningType="rowHomeResidential";
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
        return "Minimal";
    }
    }
