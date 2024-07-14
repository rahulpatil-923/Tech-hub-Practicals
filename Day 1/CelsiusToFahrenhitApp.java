// Q4. write a java program to enter temperature in celsius and convert it into fahrenheit.

public class CelsiusToFahrenhitApp
{

	public static void main(String x[]){
	int celsius = Integer.parseInt(x[0]);
	int fahrenheit = (celsius*9/5)+32;

	System.out.printf("Temperature in celsius is  : %d \nTmeperature in fahrenheit : %d ", celsius, fahrenheit);
}
}