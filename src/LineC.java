import java.util.Scanner;

public class LineC {
public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value for line_1");
	System.out.println("X1 is");
	int x1 = sc.nextInt();
	
	System.out.println("Y1 is");
	int y1 = sc.nextInt();
			
	System.out.println("Enter value for line_2");
	System.out.println("X2 is");
	int x2 = sc.nextInt();
	
	System.out.println("Y2 is");
	int y2 = sc.nextInt();
	
	
	double length = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
	
	System.out.println("Length of line is "+length);
	}
}
