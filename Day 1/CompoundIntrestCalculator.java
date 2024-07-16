
import java.util.*;
public calss CompoundIntrestCalculator{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Principal Amount : ");
	int principal = sc.nextInt();
	System.out.print("Enter a Rate of Interest : ");
	int rate = sc.nextInt();
	System.out.print("Enter a Time Period in monts : ");
	int time = sc.nextInt();

	double CompoundIntrest = p*Math.pow(1.0+r/100.0,t)-p;
	System.out.printf("Compound Intrest : %d.2lf\n", CompoundIntrest);
}
}
