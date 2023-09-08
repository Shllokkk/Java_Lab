import java.util.Scanner;

public class Mod2Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("\n1. Calculate GCD and LCM:");
            System.out.println("2. Print N Fibonacci terms");
            System.out.println("3. Reverse a number");
            System.out.println("4. Calculate 1+2+...+n");
            System.out.print("Select: ");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers: ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("Gcd: "+gcdLcm(a,b)+"  Lcm: "+((a*b)/gcdLcm(a,b)));
                    break;
                case 2:
                    System.out.println("Enter number of terms: ");
                    int c=sc.nextInt();
                    System.out.println("Fibonacci series: ");
                    for(int i=0;i<c;i++){
                        System.out.print(fibo(i)+" ");
                    }
                    break;
                case 3:
                    System.out.println("Enter number to reverse: ");
                    int d=sc.nextInt();
                    System.out.println("Reverse: ");
                    reverse(d);
                    break;
                case 4:
                    System.out.println("Enter number upto which sum: ");
                    int e=sc.nextInt();
                    System.out.println("Sum: "+seriesSum(e));
                    break;
                default:
                System.out.println("Invalid option!");
                    break;
            }
            System.out.print("\nDo You want to exit(1/0): ");
            sc.nextLine();
            int loopexit=sc.nextInt();
            
            if (loopexit==0)
                continue;
            else
                break;
        }
        sc.close();
    }
    static int gcdLcm(int n1,int n2){
        if(n2!=0)
            return gcdLcm(n2,n1%n2);
        else
            return n1;
    }
    static int fibo(int n){
        if(n==0)
            return 1;
        else if(n==1||n==2)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    static void reverse(int num){
        if(num<10)
            System.out.print(num);
        else{
            System.out.print(num%10);
            reverse(num/10);
        }
    }
    static int seriesSum(int num){
        if(num==0)
            return 0;
        else
            return num+seriesSum(num-1);
    }
}
