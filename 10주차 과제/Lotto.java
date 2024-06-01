import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Vector<Integer> lotto = new Vector<Integer>(7);
		
		//로또 번호 생성
		//6개의 1~45까지의 숫자를 랜덤 생성해서 lotto에 삽입 후 출력
		for(int i=0;i<7;i++) {
			lotto.add(random.nextInt(45)+1);
			//i번째 값과 j번째 값이 같다면 중복값을 제거
			for(int j =0;j<i;j++) {
				if(lotto.elementAt(i) == lotto.elementAt(j)) {
					i--;
					break;
				}
			}
		}
		
		//sort 메소드를 이용해 오름차순 정렬(벡터를 배열로 변환)
		Object[] result = lotto.toArray();
		Arrays.sort(result);

		for (int i=0; i < result.length-1; i++){
		       System.out.print(result[i]+" ");
		}
		
		System.out.print("+ ");
		System.out.print(result[6]);
		
	}

}
