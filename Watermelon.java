import java.util.Scanner;
public class Watermelon{
  public static void main(String args[]){
           Scanner scan = new Scanner(System.in);
          	
	System.out.print("반지름을 입력하세요: ");
	int watermelon =scan.nextInt();
	
	int radius = 3;
	double perimeter = 3.14;
	System.out.print("수박의 넓이는: ");
	double extent = radius*3.0*perimeter;
 	
 	System.out.print(extent);
 }
}