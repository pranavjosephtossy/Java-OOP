import java.util.Scanner;

import dataenum.energyRating;
import residential.singleFamilyResidential;

public class suburbzoning 
{
    singleFamilyResidential[] array;
        char garden;
        char energy;
        int noResidential;
    public suburbzoning() throws Exception
    {
        Scanner in=new Scanner(System.in);
        System.out.println("How many units do you want in this suburb");
        noResidential= in.nextInt();
        if (noResidential<0)
        { 
            throw new Exception("Wrong number entered. Number of Single Families cannot be a negative number");
        }
        array= new singleFamilyResidential[noResidential];
        for(int i=0;i<noResidential;i++)
        {
            System.out.println("enter yes or no for gardenSpace");
            garden=in.next().charAt(0);
            garden=Character.toUpperCase(garden);
            System.out.println("A to E for energy rating");
            energy=in.next().charAt(0);
            energy= Character.toUpperCase(energy);
            array[i]=  new singleFamilyResidential(getGarden(garden), getEnergy(energy));
        }
    }
    public boolean getGarden(char garden)
    {
        if (garden=='Y') 
        {
            return true;   
        }
        else
        {
            return false;
        }
    }
    public energyRating getEnergy(char energy)
    {
        if(energy=='A')
        {
            return energyRating.A;
        }
        else if(energy=='B')
        {
            return energyRating.B;
        }
        else if(energy=='C')
        {
            return energyRating.C;
        }
        else if(energy=='D')
        {
            return energyRating.D;
        }
        else 
        {
            return energyRating.E;
        }
    }
   // @Override
    public void print() 
    {
        for(int j=0;j<noResidential;j++)
        {

            System.out.println();
            System.out.println("Printing "+array[j].getZoningType()+" in this suburb");
            System.out.println("Number "+(j+1)+"\n"+array[j]);
            System.out.println();
        }
        
    }

    
     
}
