import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//식 입력
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("input) ");
		str = scanner.nextLine();
		
		//벡터 생성
		Vector<Integer> nums = new Vector<Integer>(str.length());
		//+와 -를 구분 문자로 하여 토큰 분리
		StringTokenizer st = new StringTokenizer(str,"+-",true);
		//초기 연산자를 +로 지정
		String operator = "+";
		//분리된 토큰을 벡터에 추가
		while(st.hasMoreTokens()) {
			//수식 문자열을 토큰으로 분리
			String token = st.nextToken().trim();
			//연산자인 경우, operator에 token으로 초기화
			if(token.equals("+") || token.equals("-")) {
				operator = token;
			} else {
				//operator가 +인 경우 nums에 양수로 저장
				if(operator.equals("+")) {
					nums.add(Integer.parseInt(token));
				}//operator가 -인 경우 nums에 음수로 저장
				else {
					nums.add(-1 * Integer.parseInt(token));
				}
			}
		}

		//벡터nums 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0; i<nums.size(); i++) {
		int n = nums.elementAt(i);
		sum += n;
		}
		System.out.println("result) "+sum);
	}

}
