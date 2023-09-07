import java.util.*;

class Racer{
	int speed;
	Racer(Scanner sc, int i){
		System.out.print("Enter Speed  of Biker "+(i+1)+": ");
		speed=sc.nextInt();
	}
}
class Mod1Problem2{
	public static void main(String[] args){
		Scanner temp=new Scanner(System.in);
		int sum=0;
		Racer[] r=new Racer[5];
		for(int i=0;i<r.length;i++){
			r[i]=new Racer(temp,i);
			sum+=+r[i].speed;
		}
		System.out.println("The average speed is: "+sum/5);
		for(int i=0;i<r.length;i++){
			if(r[i].speed>=sum/5){
				System.out.println("Biker "+(i+1)+" has qualified!");
			}
		}
	}
}
