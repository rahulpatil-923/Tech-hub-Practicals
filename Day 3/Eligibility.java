/* Q3. write a program to determine eligibilty for admission to a progessional course based on the following criteria.
	Marks in Math >= 65 and Marks in Phy>=65 and Marks in Chem>=50 and 
	Total in all three subjects >= 190 or
	Total in maths and Physics >= 140.
*/

import java.util.*;
public class EligibiltyCheck
{
	public static void main(String x[])	
	{
		// take marks as input from user.
		Scanner in = new Scanner(System.in);
		int math, phy, chem, totalSubject, mathAndPhy;
		String result;
		System.out.print("Enter a marks of math : ");
		math = in.nextInt():
		System.out.print("Eneter a markes of physics : ");
		phy = in.nextInt();
		System.out.print("Enter a marks of Chemestry : ");
		chem = in.nextInt():
	
		// impliment logic
		total = math + phy + chem;
		mathAndPhy = math + phy;
		result = (total >= 190 && mathAndPhy >=140) ? "eligible" : "not eligible";

		// Display the result
		System.out.printf("Candidate is %s for admission")


	}
}