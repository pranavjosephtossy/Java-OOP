import commercial.*;
import residential.*;
import office.*;
import industrial.*;
import dataenum.*;


public class mainprj 
{ 
    public static void main(String[] args) 
    {
        
        //commercial
        lowDensityCommercial ldc1= new lowDensityCommercial(10, operatingHours.nine_to_six, energyRating.C);
        highDensityCommercial hdc1= new highDensityCommercial(30, operatingHours.twentyfour_seven, energyRating.B);
        //industrial
        warehouseIndustrial wi1=new warehouseIndustrial(16, safetyRating.B, energyRating.B);
        manufacturingIndustrial mi1=new manufacturingIndustrial(34, safetyRating.C, energyRating.E);
        randdIndustrial randd1=new randdIndustrial(20, safetyRating.A, energyRating.A);
        //office
        lowDesnsityOffice ldo1=new lowDesnsityOffice(10, energyRating.C);
        midDensityOffice mdo1=new midDensityOffice(54, energyRating.C);
        highDensityOffice hdo1=new highDensityOffice(156, energyRating.B);
        //residential
        singleFamilyResidential sfr1=new singleFamilyResidential(true, energyRating.B);
        rowHomeResidential rhr1=new rowHomeResidential(2,true, energyRating.A);
        lowRentResidential lrr1=new lowRentResidential(20,false, energyRating.D);
        mediumDensityResidential mdr1=new mediumDensityResidential(37,true, energyRating.C);
        highDensityResidential hdr1=new highDensityResidential(120,false, energyRating.B);
        

         
        //create and display properties of at least two instance objects of each of
        //low density residential
        System.out.println(ldo1);
        System.out.println(ldo1.getZoningClass());
        System.out.println(ldo1.getZoningType());
        System.out.println();
        //manufacturing industrial
        System.out.println(mi1);
        System.out.println(mi1.getZoningClass());
        System.out.println(mi1.getZoningType());
        System.out.println();

        System.out.println(rhr1.toString());
        
        try {
            suburbzoning sub1= new suburbzoning();
            sub1.print();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error= "+e.getMessage());
        }
         
        try {
            outerCityZoning ocz1= new outerCityZoning();
            ocz1.print();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error= "+e.getMessage());
        }
        
        innerCityZoning icz1=new innerCityZoning();
        icz1.print();
        System.out.println();

        //static
        //one is made by default when "populating"
        System.out.println("No of single family houses made: "+ singleFamilyResidential.noSingleFamilyResidential);

        System.out.println();
        //abstract method
        System.out.println("Potential tax income= "+mi1.getTax());
        System.out.println();
        //final method
        System.out.println("Subsidies for commercial zoning");
        System.out.println("Low density = "+ldc1.subsidies());
        System.out.println("High density ="+hdc1.subsidies());
        System.out.println();
        System.out.println("Subsidies for office zoning");
        System.out.println("Low density = "+ldo1.getSubsidies());
        System.out.println("Medium density ="+mdo1.getSubsidies());
        System.out.println("High density ="+hdo1.getSubsidies());
        System.out.println();
        //interface
        System.out.println("Noise levels in outer city zoning:"+"\n"+
        "\t"+rhr1.getZoningClass()+"= "+rhr1.noiseLevel()+"\n"+
        "\t"+lrr1.getZoningClass()+"= "+lrr1.noiseLevel()+"\n"+
        "\t"+ldc1.getZoningClass()+"= "+ldc1.noiseLevel()+"\n"+
        "\t"+wi1.getZoningClass()+"= "+wi1.noiseLevel()+"\n");
        
    }
}
 