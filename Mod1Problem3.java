import java.util.*;

class Equation{
    int a,b,c;
    Equation(Scanner sc){
        System.out.println("Enter the Coefficients (a,b,c): ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double desc=b*b-4*a*c;
        if(desc<0)
            System.out.println("The Equation has no real roots.");

        else if(desc==0){
            double root1=(-b)/(2*a);
            System.out.println("The Identical roots are "+root1);
        }
        else{
            double root1=((-b)+Math.sqrt(desc))/(2*a);
            double root2=((-b)-Math.sqrt(desc))/(2*a);
            System.out.println("The distinct roots are "+root1+" "+root2);
        }
    } 
}
public class Mod1Problem3{
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        new Equation(temp);
    }
}