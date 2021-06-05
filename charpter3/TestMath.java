

public class TestMath
{
    public static void main(String[] args)
    {
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);

        System.out.print("4%2=");
        System.out.println(Math.floorMod(4,2));
        System.out.print("-4%2=");
        System.out.println(Math.floorMod(-4,2));
        System.out.print("4%3=");
        System.out.println(Math.floorMod(4,3));
        System.out.print("-4%3=");
        System.out.println(Math.floorMod(-4,3));
    }
}
