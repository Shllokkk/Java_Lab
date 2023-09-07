import java.util.*;

class Number{
    int num;
    long fac=1;

    Number(Scanner sc){
        System.out.print("Enter a number: ");
        num=sc.nextInt();
    }
    void factorial(){
        if(num>60)
            System.out.println("Factorial value out of bounds!");
        else{
        for(int i=num;i>=1;i--)
            fac*=i;
        System.out.println("The factorial is: "+fac);
        }
    }
    void armstrong(){
        int digits=0,sum=0,rem;
        int temp=num;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp=num;
        while (temp>0){
            rem=temp%10;
            temp=temp/10;
            sum+=Math.pow(rem,digits);
        }
        if(sum==num)
            System.out.println("The number is an Armstrong number");
        else
            System.out.println("The number is not an Armstrong number");
    }
    void palindrome(){
        int sum=0,rem;
        int temp=num;
        while (temp>0){
            rem=temp%10;
            temp=temp/10;
            sum=sum*10+rem;
        }
        if(sum==num)
            System.out.println("The number is a Palindrome number");
        else
            System.out.println("The number is not a Palindrome number");
    }
    void prime(){
        boolean counter=false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                counter=true;
                break;
            }
        }
        if(counter)
            System.out.println("The number is a not Prime number");
        else
            System.out.println("The number is a Prime number");
    }   
    void fibonacci(){
        System.out.print("Fibonacci series: 0 1 ");
        int n1=0,n2=1,n3;
        for(int i=0;i<num-2;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
    }
}
public class Mod1Problem5 {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        Number obj=new Number(temp);
        while(true){
            System.out.println("\n1. Calculate Factorial");
            System.out.println("2. Test whether Armstrong");
            System.out.println("3. Test whether Palindrome");
            System.out.println("4. Test whether Prime");
            System.out.println("5. Calculate Fibonacci series");
            System.out.print("Select: ");
            int choice=temp.nextInt();

            switch (choice) {
                case 1:
                    obj.factorial();
                    break;
                case 2:
                    obj.armstrong();
                    break;
                case 3:
                    obj.palindrome();
                    break;
                case 4:
                    obj.prime();
                    break;
                case 5:
                    obj.fibonacci();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            System.out.print("\nDo You want to exit(1/0): ");
            temp.nextLine();
            int loopexit=temp.nextInt();
        
            if (loopexit==0)
                continue;
            else
                break;
        }
    }
}
