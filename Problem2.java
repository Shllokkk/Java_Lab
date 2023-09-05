import java.util.*;

class Racer{
	int speed;
	Racer(int i){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Speed  of Biker"+i+": ");
		speed=sc.nextInt();
	}
}

class Problem2{
	public static void main(String[] args){
		int sum;
		Racer[] r=new Racer[5];
		for(int i=0;i<r.length;i++){
			r[i]=new Racer(i);
			sum+=r[i].speed;
		}
		
	}
}
