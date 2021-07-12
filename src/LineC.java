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

System.out.println("Enter value for line_1");
System.out.println("a1 is");
int a1 = sc.nextInt();

System.out.println("b1 is");
int b1 = sc.nextInt();
		
System.out.println("Enter value for line_2");
System.out.println("a2 is");
int a2 = sc.nextInt();

System.out.println("b2 is");
int b2 = sc.nextInt();


double length2 = Math.sqrt((a2-a1) * (a2-a1) + (b2-b1) * (b2-b1));

System.out.println("Length of line_2 is "+length2);

if(length == length2)
{
	System.out.println("line are equal");
}
else
{
	System.out.println("lines are not equal");
}
	Integer input = (int) length;

	Integer input1 = (int) length2;
int result= Double.compare(length,length2);
	System.out.println("result");
if (result==0) {
	System.out.println("Equals");
}	
else if (result>0)	{
	 System.out.println("line1 is Greater");
}
else {
	 System.out.println("line2 is Greater");
}
	}
	}
