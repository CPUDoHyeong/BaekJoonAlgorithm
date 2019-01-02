package chap07;

import java.util.*;

public class Q11654 {

	public static void main(String[] args) {
		/**
		 * Q11654
		 * 
		 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
		 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		 * 
		 * ex)
		 * A
		 * 65
		 *
		 * 해결방법
		 * 입력제한을 하고 출력하면된다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean loop = true;
		
		while(loop) {
			input = sc.next();
			if(input.length() != 1) {
				System.out.println("소문자, 대문자, 숫자 0-9중 하나만 입력하세요.");
				continue;
			}
			
			if(input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
				System.out.println((int)input.charAt(0));
				loop = false;
			} else if(input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
				System.out.println((int)input.charAt(0));
				loop = false;
			} else if(input.charAt(0) >= '0' && input.charAt(0) <= '9') {
				System.out.println((int)input.charAt(0));
				loop = false;
			} else {
				System.out.println("소문자, 대문자, 숫자 0-9중 하나만 입력하세요.");
				continue;
			}
		}
		
		sc.close();
	}

}
