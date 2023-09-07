import java.util.*;

class Customer{
    String name,address;
    double contact,bal,with;

    Customer(Scanner sc){
        System.out.print("Enter Customer name: ");
        name=sc.nextLine();
        System.out.print("Enter Contact no: ");
        contact=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Address: ");
        address=sc.nextLine();
        createAccount();
    }
    void createAccount(){
        System.out.println("Account created!");
        System.out.println("Acc no: 12ARX230052");
    }
    void deposit(Scanner sc){
        System.err.print("Enter amount to be deposited in Account: ");
        bal+=sc.nextInt();
        System.err.println("Amount deposited in Acc no(12ARX230052): "+bal);
    }
    void withdraw(Scanner sc){
        System.err.print("Enter amount to be withdrawn from Account: ");
        with=sc.nextInt();
        if(with>bal)
        System.err.println("Insufficient Balance");

        else{
            System.err.println("Amount withdrawn from Acc no(12ARX230052): "+with);
            bal-=with;
        }
    }
    void computeInterest(){
        System.out.println("Standard Interest rate: 4% p.a");
        System.out.println("Annual interest for Acc no(12ARX230052): "+0.04*bal);
    }
    void displayBalance(){
        System.out.println("Balance for Acc no(12ARX230052): "+bal);
    }
}
public class Mod1Problem4{
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        Customer obj=new Customer(temp);

        while(true){
            System.out.println("\n1. Deposit into Account");
            System.out.println("2. Withdraw from Account");
            System.out.println("3. Compute Annual interest for Account");
            System.out.println("4. Check Balance of Account");
            System.out.print("Select: ");
            int choice=temp.nextInt();

            switch (choice) {
                case 1:
                    obj.deposit(temp);
                    break;
                case 2:
                    obj.withdraw(temp);
                    break;
                case 3:
                    obj.computeInterest();
                    break;
                case 4:
                    obj.displayBalance();
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