package day14_Exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		boolean flag = true;
		System.out.println("인증 프로그램 입니다.");
		
		do {
			Scanner sc = new Scanner(System.in);
			int a;
			
			System.out.print("주민등록번호 앞자리 입력 : ");
			
			try {
				a = sc.nextInt();
				if(a<900101 && a>220101) {
					System.out.println("가입 가능");
					flag = false;
				}
				else if(a<100000 || a>999999) {
					throw new Exception("길이가 틀렸습니다.");
				}
				else if(a>900101) {
					throw new Exception("가입 불가");
				}
				
				
			}catch(InputMismatchException ie) {
				System.err.println("숫자를 입력 하세요!!!");
				continue;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
		}while(flag);
		
		
	}
}
