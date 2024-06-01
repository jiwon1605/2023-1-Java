import java.util.Scanner;
import java.util.*;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열과 회전횟수 입력
		Scanner scanner = new Scanner(System.in);
		String str;
		int num;
		System.out.println("input)");
		str = scanner.nextLine();
		num = scanner.nextInt();
		
		if(num == 0) {
			System.out.println("종료함");
			System.exit(0);
		}
		
		//num이 양수일때 
		if(num > 0) {
			//우선 회전 횟수만큼 문자열 정리, StringBuilder 이용
			StringBuilder sb = new StringBuilder(str);
	        
        	for(int i = 0; i < num; i ++) {
	        	//문자열 중 맨 앞의 문자를 선택해 char타입으로 변환하여 firstChar에 대입
	            char firstChar = sb.charAt(0);
	            //맨 앞의 문자 삭제
	            sb.deleteCharAt(0);
	            //firstchar을 append를 이용해 맨 뒤에 추가
	            sb.append(firstChar);
		        //회전 횟수만큼 정리한 문자열 출력
	        }
	        System.out.println(sb.toString());
	        
	        //str길이에서 num만큼 뺀 값까지를 i의 범위로->이미 num만큼 회전을 시켰으니까
	        for(int i  = 0; i <= str.length()-2*num;i +=num) {
	        	for(int j = 0; j<num;j++) {
		        	//문자열 중 맨 앞의 문자를 선택해 char타입으로 변환하여 firstChar에 대입
		        	char firstChar = sb.charAt(0);
		            //맨 앞의 문자 삭제
		            sb.deleteCharAt(0);
		            //firstchar을 append를 이용해 맨 뒤에 추가
		            sb.append(firstChar);
	        		
	        	}
	            System.out.println(sb.toString());
	        }
		}
		
		//num이 음수일때 
		if(num < 0) {
			//우선 회전 횟수만큼 문자열 정리, StringBuilder 이용
			StringBuilder sb = new StringBuilder(str);
	        
        	for(int i = 0; i < Math.abs(num); i ++) {
	        	//문자열 중 맨 뒤의 문자를 선택해 char타입으로 변환하여 lastChar에 대입
	            char lastChar = sb.charAt(sb.length()-1);
	            //맨 뒤의 문자 삭제
	            sb.deleteCharAt(sb.length()-1);
	            //lastchar을 append를 이용해 맨 앞에 추가
	            sb.insert(0,lastChar);
		        //회전 횟수만큼 정리한 문자열 출력
	        }
	        System.out.println(sb.toString());
	        
	        //str길이에서 num만큼 뺀 값까지를 i의 범위로->이미 num만큼 회전을 시켰으니까
	        for(int i  = 0; i <= sb.length()-2*Math.abs(num) ;i +=Math.abs(num)) {
		        	for(int j = 0; j<Math.abs(num);j++) {
		        		//문자열 중 맨 뒤의 문자를 선택해 char타입으로 변환하여 lastChar에 대입
			            char lastChar = sb.charAt(sb.length()-1);
			            //맨 뒤의 문자 삭제
			            sb.deleteCharAt(sb.length()-1);
			            //lastchar을 append를 이용해 맨 앞에 추가
			            sb.insert(0,lastChar);
				        //회전 횟수만큼 정리한 문자열 출력
		        		
		        	}
		            System.out.println(sb.toString());
		        }
			}
		}
    }

