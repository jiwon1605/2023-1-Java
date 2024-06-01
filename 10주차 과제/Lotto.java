import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Vector<Integer> lotto = new Vector<Integer>(7);
		
		//�ζ� ��ȣ ����
		//6���� 1~45������ ���ڸ� ���� �����ؼ� lotto�� ���� �� ���
		for(int i=0;i<7;i++) {
			lotto.add(random.nextInt(45)+1);
			//i��° ���� j��° ���� ���ٸ� �ߺ����� ����
			for(int j =0;j<i;j++) {
				if(lotto.elementAt(i) == lotto.elementAt(j)) {
					i--;
					break;
				}
			}
		}
		
		//sort �޼ҵ带 �̿��� �������� ����(���͸� �迭�� ��ȯ)
		Object[] result = lotto.toArray();
		Arrays.sort(result);

		for (int i=0; i < result.length-1; i++){
		       System.out.print(result[i]+" ");
		}
		
		System.out.print("+ ");
		System.out.print(result[6]);
		
	}

}
