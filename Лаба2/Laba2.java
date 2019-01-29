import java.util.Scanner;

public class Lab1
{
	public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		Point3d A[]=new Point3d[3];
		for(int i=0;i<3;i++)
			{
			A[i]=new Point3d();
			System.out.println("enter X:");
			A[i].InX(input.nextDouble());
			System.out.println("enter Y:");
			A[i].InY(input.nextDouble());
			System.out.println("enter Z:");
			A[i].InZ(input.nextDouble());
			System.out.println(A[i].OutX()+" "+A[i].OutY()+" "+A[i].OutZ());
			}	
		if ( !(A[0].equal(A[1]))&&!(A[1].equal(A[2]))&&!(A[2].equal(A[0])) )
			{
			System.out.println("The computed area: " + computeArea(A));
			}
		else
			{
			System.out.println("Error some points are equal!");
			}
		}
	
	public static double computeArea(Point3d A[])
		{
		double a=A[0].distanceTo(A[1]);
		double b=A[1].distanceTo(A[2]);
		double c=A[2].distanceTo(A[0]);
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
		}

}