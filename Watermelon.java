import java.util.Scanner;
public class Watermelon{
  public static void main(String args[]){
           Scanner scan = new Scanner(System.in);
          	
	System.out.print("�������� �Է��ϼ���: ");
	int watermelon =scan.nextInt();
	
	int radius = 3;
	double perimeter = 3.14;
	System.out.print("������ ���̴�: ");
	double extent = radius*3.0*perimeter;
 	
 	System.out.print(extent);
 }
}