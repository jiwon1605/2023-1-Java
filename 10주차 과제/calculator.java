import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� �Է�
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("input) ");
		str = scanner.nextLine();
		
		//���� ����
		Vector<Integer> nums = new Vector<Integer>(str.length());
		//+�� -�� ���� ���ڷ� �Ͽ� ��ū �и�
		StringTokenizer st = new StringTokenizer(str,"+-",true);
		//�ʱ� �����ڸ� +�� ����
		String operator = "+";
		//�и��� ��ū�� ���Ϳ� �߰�
		while(st.hasMoreTokens()) {
			//���� ���ڿ��� ��ū���� �и�
			String token = st.nextToken().trim();
			//�������� ���, operator�� token���� �ʱ�ȭ
			if(token.equals("+") || token.equals("-")) {
				operator = token;
			} else {
				//operator�� +�� ��� nums�� ����� ����
				if(operator.equals("+")) {
					nums.add(Integer.parseInt(token));
				}//operator�� -�� ��� nums�� ������ ����
				else {
					nums.add(-1 * Integer.parseInt(token));
				}
			}
		}

		//����nums ���� ��� ���� ���ϱ�
		int sum = 0;
		for(int i=0; i<nums.size(); i++) {
		int n = nums.elementAt(i);
		sum += n;
		}
		System.out.println("result) "+sum);
	}

}
