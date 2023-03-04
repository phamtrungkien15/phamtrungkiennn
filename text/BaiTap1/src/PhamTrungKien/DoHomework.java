package PhamTrungKien;

import java.util.Scanner;

public class DoHomework {
public static void main(String[] args) {
	float a ,b ;
	System.out.println("em moi co giao nhap lan luot cac gia trị a va b = ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextFloat();
	b = sc.nextFloat();
	
	 // Câu a
	float tong = a + b;
	System.out.println("tong cua 2 so do = " + tong);
	
	float hieu = a - b;
	System.out.println("hieu cua 2 so do = " + hieu);
	
    float tich = a*b;
	System.out.println("tich cua 2 so do = " + tich);
	
	float thuong = a/b;
	System.out.println("thuong cua 2 so do = " + thuong);
	
	float chialaydu = a%b;
	System.out.println("chia lay du cua 2 so đo = " + chialaydu);
	
	
	//Câu b
	System.out.println(a+ " == " +b+ ":" + (a==b));
	System.out.println(a+ " != " +b+ ":" + (a!=b));
	System.out.println(a+ " < "  +b+ ":" + (a<b));
	System.out.println(a+ " <= " +b+ ":" + (a<=b));		
	System.out.println(a+ " > "  +b+ ":" + (a>b));
	System.out.println(a+ " >= " +b+ ":" + (a>=b));
	
	System.out.println("em cam on co giao da xem a !");
}
}
