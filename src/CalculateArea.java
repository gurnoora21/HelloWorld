import java.util.Scanner;

public class CalculateArea {

	private static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius = 0; 
		float area; 
        scn = new Scanner(System.in);
        System.out.print("Enter the Raidus of the circle:");
        radius = scn.nextFloat(); 
        area = calcArea(radius);
        System.out.print("Area of the circle is:" + area);
        
	}

	private static float calcArea(float radius) {
		// TODO Auto-generated method stub
		return (float) (Math.PI * radius  * radius) ;
	}

}
