package Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Test0118 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		for(int i=0;i<n;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a<=5) {
				list.add(new Car(a,b));
			}
			else {
				list.add(new Bus(a,b));
			}
		}
		for(int i=0;i<n;i++) {
			list.get(i).show();
		}
	}
}

class Vehicle{
	int num;
	int weight;
	
	Vehicle(int num,int weight){
		this.num=num;
		this.weight=weight;
	}
	
	int sum(int num,int weight) {
		return num*weight;
	}
	
	void show() {
		System.out.println("该车辆载重为"+sum(num, weight));
	}
}

class Car extends Vehicle{
	Car(int num, int weight) {
		super(num, weight);
	}
}

class Bus extends Vehicle{
	Bus(int num, int weight) {
		super(num, weight);
	}
}