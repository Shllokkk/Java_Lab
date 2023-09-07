import java.util.*;

class Complex{
    int a,b,c,d;
    Complex(Scanner sc){
        System.out.println("Enter coefficients for Complex number 1:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter coefficients for Complex number 2:");
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println("Complex number1: "+a+" + i("+b+")");
        System.out.println("Complex number1: "+c+" + i("+d+")");
    }
}

public class Mod2Problem6 {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        Complex obj=new Complex(temp);

        if((obj.b+obj.d)>0)
            System.out.println("Sum= "+(obj.a+obj.c)+" + i"+(obj.b+obj.d));
        else
            System.out.println("Sum= "+(obj.a+obj.c)+" - i"+(-1*(obj.b+obj.d)));

        if((obj.b-obj.d)>0)
            System.out.println("Difference= "+(obj.a-obj.c)+" + i"+(obj.b-obj.d));
        else
            System.out.println("Difference= "+(obj.a-obj.c)+" - i"+(-1*(obj.b-obj.d)));

        if((obj.a*obj.d+obj.b*obj.c)>0)
            System.out.println("Product= "+(obj.a*obj.c-obj.b*obj.d)+" + i"+(obj.a*obj.d+obj.b*obj.c));
        else
            System.out.println("Product= "+(obj.a*obj.c-obj.b*obj.d)+" - i"+(-1*(obj.a*obj.d+obj.b*obj.c)));   
    }
}
