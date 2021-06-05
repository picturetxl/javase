

public class Constants2
{
    final static double CM_PER_INCH = 2.54;// must add static 
    
    public static void main(String[] args)
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
            + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH );
    }
}         
