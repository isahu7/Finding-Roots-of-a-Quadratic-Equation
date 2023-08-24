import java.util.Scanner;

public class school
{
    private static int valueA;
    private static int valueB;
    private static int valueC;
    
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Type in a value for a:");
        valueA = sc.nextInt();
        
        System.out.println(" Type in a value for b:");
        valueB = sc.nextInt();
        
        System.out.println(" Type in a value for c:");
        valueC = sc.nextInt();
        
        if(valueA==0 || valueB==0 || valueC==0){
            System.out.print("Cant do zeros!");
            main();
        }
        else{
            calcBSquared();
            calcAC4();
            calcDisc();
            calcRoot1();
            calcRoot2();
            
            if (calcDisc() < 0) {
                System.out.println("Discriminant is negative. No solutions.");
                main();
            }
            System.out.println("The value of b square is " + calcBSquared());
            System.out.println("The value of 4*a*c is " + calcAC4());
            System.out.println("The value of the discriminant is " + calcDisc());
            System.out.println("The value of root1 is " + calcRoot1());
            System.out.println("The value of root2 is " + calcRoot2());
            
            main();
        }
        
        
    }
    
    public static double calcDisc()
    {
        return calcBSquared() - calcAC4();
    }
    
    public static double calcBSquared()
    {
        return valueB * valueB;
    }
    
    public static double calcAC4()
    {
        return 4*valueA*valueC;
    }
    
    public static double calcRoot1()
    {
        double sqrt = Math.sqrt(calcDisc());
        double numerator = (-1*valueB) + sqrt;
        double denominator = 2*valueA;
        double root2 = numerator/denominator;
        
        return root2;
    }
    
    public static double calcRoot2()
    {
        double sqrt = Math.sqrt(calcDisc());
        double numerator = (-1*valueB) - sqrt;
        double denominator = 2*valueA;
        double root1 = numerator/denominator;
        
        return root1;
    }
}
