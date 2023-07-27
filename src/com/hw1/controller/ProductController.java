package com.hw1.controller;

import java.util.Scanner;

import com.hw1.model.vo.Product;

public class ProductController {

	private Scanner sc = new Scanner(System.in);
	
	private Product[] pro = new Product[10];
	
	private int count;
	
	public void mainMenu() {
		// 메뉴 출력 -> do~while 문으로 반복 실행 처리함
		int input;
		
		do { 
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("ㆍ제품 정보 추가 = 1");
			System.out.println("ㆍ제품 전체 조회 = 2");
			System.out.println("ㆍ프로그램 종료 = 3");
			System.out.print("번호 입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch (input) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 3 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("번호를 확인하세요.");
			
			}
			
		} while ( input !=3 );
		
	}
	
	public void productInput() {
		if (count >= pro.length) {
			System.out.println("제품 저장소가 가득 찼습니다.");
			return;
		}
		
		System.out.println("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.println("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.println("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
		count++;
		System.out.println("제품이 성공적으로 추가되었습니다.");
	}
	
	public void productPrint() {
		if (count == 0) {
			System.out.println("제품이 없습니다.");
			return;
		}
		
		System.out.println("===== 제품 목록 =====");
		for (int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
			
		}
	}
	
	
	
}
