import java.util.*;

class Racer{
	int speed;
	Racer(int i){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Speed  of Biker "+(i+1)+": ");
		speed=sc.nextInt();
	}
}

class Problem2{
	public static void main(String[] args){
		int sum=0;
		Racer[] r=new Racer[5];
		for(int i=0;i<r.length;i++){
			r[i]=new Racer(i);
			sum+=+r[i].speed;
		}

		System.out.println("The average speed is: "+sum/5);

		for(int i=0;i<r.length;i++){
			if(r[i].speed>=sum/5){
				System.out.println("Biker "+i+" has qualified!");
			}
		}
	}
}
