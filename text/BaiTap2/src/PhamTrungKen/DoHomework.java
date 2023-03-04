package PhamTrungKen;

import java.util.Scanner;

public class DoHomework {
public static void main(String[] args) {
	int a ;
	System.out.println("e moi co giao nhap 1 so nguyen bat ki : ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	
if(a%2==0) {
	System.out.println(a + " la so chan");
}else {
	System.out.println(a + " la so le");
}
System.out.println("cam on co giao da check a !");

}
}