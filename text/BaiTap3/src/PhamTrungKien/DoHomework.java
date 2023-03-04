package PhamTrungKien;

import java.util.Scanner;

public class DoHomework {
	public static void main(String[] args) {
		int ten, namSinh;
		System.out.println("em moi co giao nhap nam sinh: ");
		Scanner sc = new Scanner(System.in);
		namSinh = sc.nextInt();

		float tuoi = 2023 - namSinh;
		if (tuoi < 16) {
			System.out.println("ban pham trung kien o do tuoi vi thanh nien");
		} else if (tuoi >= 16 && tuoi < 18) {
			System.out.println("ban pham trung kien o do tuoi truong thanh");
		} else {
			System.out.println("ban pham trung kien da gia");
		}
		System.out.println("em cam on co giao da check a !");
	}
}
