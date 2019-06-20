import java.util.Scanner;

public class Main {


    public static int footprint_to_inches(int inch)
    {
        inch = inch*12;
        return inch;
    }

    public static int runoff_water_calculation(int x, int y, int rainfall)
    {
        int dimension = x*y*rainfall;
        return dimension;
    }

    public static int amount_of_water(int roof_dimension)
    {
        int amount = roof_dimension/231;
        return amount;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x;
        int y;
        int rainfall;
        int roof_dimension;
        int gallons;

        System.out.println("How much water runs off a roof in a rain storm?");

        System.out.println("What is the first dimension of the roof?");
        x = in.nextInt();

        System.out.println("What is the second dimension of the roof?");
        y = in.nextInt();

        System.out.println("How many inches of rainfall?");
        rainfall = in.nextInt();

        System.out.println("The Current Dimensions in feet are: "+ x +" x "+ y);

        x = footprint_to_inches(x);
        y = footprint_to_inches(y);

        System.out.println("The Converted Dimensions in inches are: "+ x +" x "+ y);
        System.out.println("The amount of rainfall in inches is: "+ rainfall +" cubic inches of water.");

        roof_dimension = runoff_water_calculation(x,y,rainfall);

        System.out.println("The roof dimension is: "+ roof_dimension);

        gallons = amount_of_water(roof_dimension);
        System.out.println("The amount of water in gallons is: "+ gallons);
    }
}
