import city.innerCity;
import dataenum.energyRating;
import dataenum.operatingHours;
import residential.mediumDensityResidential;
import residential.highDensityResidential;
import commercial.highDensityCommercial;
import industrial.randdIndustrial;
import office.highDensityOffice;
import office.midDensityOffice;

public final class innerCityZoning 
{
    innerCity[] ic1;
    public innerCityZoning()
    {
        ic1=new innerCity[4];
        ic1[0]= new highDensityResidential(200, false, energyRating.A);
        ic1[1]= new highDensityOffice(120, energyRating.D);
        ic1[2]= new highDensityCommercial(24,operatingHours.twentyfour_seven,energyRating.B);
        ic1[3]=new mediumDensityResidential(37,false,energyRating.B);
        System.out.println("Building variation:\n"+ic1[0].getZoningType()+"\n"+ic1[1].getZoningType()+"\n"+ic1[2].getZoningType()+"\n"+ic1[3].getZoningType());
    }
    public void print()
    {
        for (int i=0;i<2;i++)
        {
            System.out.println("Zoning number "+(+1)+"["+ic1[i].getZoningType()+"]");
            System.out.println(ic1[i]);
        }
    }
    
}
