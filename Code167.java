package JustRunJava;
//대문자 > 소문자, 소문자 > 대문자 변환
//아스키 코드 소문자 a~z : 97 ~ 122, 대문자 A~Z : 65 ~ 90.  +- 32의 패턴을 갖음
import java.util.Scanner;


public class Code167 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("문자열을 입력해주세요 : ");
		String insert = scan.next();
		 
		char[] asc = new char[insert.length()];
		
		for(int i=0;i<insert.length();i++) {		//in stream으로 받은 자료값을 char 자료형으로 변형
			asc[i] = insert.charAt(i);
		}
		
		for(int i=0;i<asc.length;i++) {		// ascⅡ코드의 대소비교를 통해, 대문자일 경우 +32 소문자일경우 -32
			if (65<= asc[i] && asc[i] <=90) {
				asc[i] += 32;
			}
			
			else if (97 <= asc[i] && asc[i] <= 122) {
				asc[i] -= 32;
			}
		}
		
		System.out.println("입력하신 문자열은 ["+insert+"] 입니다. ");
		System.out.print("변환된 문자열은 [");
		
		for(char i:asc) {
			System.out.print(i);
		}
		
//		for(int i=0;i<asc.length;i++) {
//		System.out.print(asc[i]);
//	}
		
		System.out.print("] 입니다. ");
		
		scan.close();
	}
}

/* 
다른 풀이 (유튜브 풀이)
출처 : https://github.com/control-man/jinsslecture_basic_algorithm
package _5_CapToLow;

public class Main {
	public static void main(String[] args) {
		
		String input = "helloWorlD";
		char []arr;
		arr = input.toCharArray();
		System.out.print(arr);
		System.out.println();
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + 'A'-'a'); // 'a' 'b' ~ 'z' 'A' 'B' 'C'
			}
			else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}		
		}
		
		System.out.print(arr);
	}
}

*/
