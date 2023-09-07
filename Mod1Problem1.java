import java.util.*;

class Salary{
	int empno;
	int basic;
	String empname;
	Salary(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Employee no: ");
		empno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name: ");
		empname=sc.nextLine();
		System.out.print("Enter Basic salary: ");
		basic=sc.nextInt();
	}
	void calculate(){
		double gsal=(this.basic+0.7*this.basic+0.3*this.basic+240);
		System.out.println("Gross Salary: "+ gsal);
        System.out.println("Net Salary: "+ (gsal-0.1*this.basic-100));
	}
}
class Mod1Problem1{
	public static void main(String[] args){
		Salary e1=new Salary();
		e1.calculate();
	}
}