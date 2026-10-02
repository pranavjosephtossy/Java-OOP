import residential.rowHomeResidential;
import residential.lowRentResidential;
import industrial.warehouseIndustrial;

import java.util.Scanner;

import city.outerCity;
import commercial.lowDensityCommercial;
import dataenum.energyRating;
import dataenum.operatingHours;
import dataenum.safetyRating;

public class outerCityZoning
{
    Scanner in=new Scanner(System.in);
    outerCity[] oc1;
    int c,max;
    char c1,c2,c3,c4;
    boolean rowHomeExit=false, lowRentExit=false,lowDensityCommercialExit=false,warehouseExit=false;
    public outerCityZoning() throws Exception
    {
    oc1=new outerCity[2];
    System.out.println("Create Outer City zonings :");
    System.out.println("1 for sample, 2 to set your own");
    c=in.nextInt();
    System.out.println();
    if (c==2)
    {
        System.out.println("Enter custom zoning:");
        System.out.println("How many building");
        max= in.nextInt();
        System.out.println();
        oc1=new outerCity[max];
        int counter=0;
        
       
        System.out.println("Do you want to have Row Homes");
        System.out.println("Yes or No");
        char c1=in.next().charAt(0);
        c1= Character.toUpperCase(c1);
        if (c1=='Y')
        {
            oc1[counter]= new rowHomeResidential(3, false, energyRating.C) ;
            counter++;  
        }
        if(counter<max)
        {
            System.out.println("Do you want to have Low Rent");
            System.out.println("Yes or No");
            char c2=in.next().charAt(0);
            c2= Character.toUpperCase(c2);
            if (c2=='Y')
            {
                oc1[counter]= new lowRentResidential(27,true,energyRating.D);
                counter++;
            }
        }
        if(counter<max)
        {
            System.out.println("Do you want to have Low Density Commercial");
            System.out.println("Yes or No");
            char c3=in.next().charAt(0);
            c3= Character.toUpperCase(c3);
            if (c3=='Y')
            {
                oc1[counter]= new lowDensityCommercial(7, operatingHours.nine_to_six, energyRating.C);
                counter++;
            }
        }
        if(counter<max)
        {
            System.out.println("Do you want to have Warehouse");
            System.out.println("Yes or No");
            char c4=in.next().charAt(0);
            c4= Character.toUpperCase(c4);
            if (c4=='Y')
            {
                oc1[counter]= new warehouseIndustrial(19, safetyRating.C, energyRating.E);
                counter++;
            }
        }
    }           
    else if(c==1)
    {
        System.out.println("SAMPLE");
        oc1[0]= new rowHomeResidential(3, false, energyRating.C) ;
        oc1 [1]= new lowDensityCommercial(10, operatingHours.nine_to_six, energyRating.D);
        System.out.println("Variations of zoning types:"+"\n"+
        "\t"+oc1[0].getZoningType()+
        "\t"+oc1[0].getZoningType());
        System.out.println();
    }
    else
    {
        throw new Exception("Entered the wrong choice. You were supposed to enter\n1 for sample\n2 for custom");
    }
    
    
    }
    public void print()
    {
        if (c==1)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println("Printing all zoning in Outer City");
                System.out.println("Zoning number "+(j+1) +"["+oc1[j].getZoningType()+"]");
                System.out.println(oc1[j]);
            }
        }
        else
        {
            System.out.println("Printing all zoning in Outer City");
            System.out.println("Total number of buildings= "+ max);
            for (int j=0;j<max;j++)
            {
                System.out.println("Zoning number "+(j+1) +"["+oc1[j].getZoningType()+"]");
                System.out.println(oc1[j]);
                System.out.println();
            }
        }
        
    }
}
