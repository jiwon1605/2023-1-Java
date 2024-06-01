import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class StringToExchange {

	public static void main(String[] args) {
		//문자열을 입력
		Scanner scan = new Scanner(System.in);
		String date;
		System.out.println("input)");
		date = scan.next();
		
		//yyyy/MM/dd의 형태로 입력받기
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");
        //입력받은 문자열을 파싱하여 Date객체로 변환
		Date parsedDate;
        try {
        	//paresedDate에 date를 SDF로 파싱한 것을 넣음
            parsedDate = SDF.parse(date);
            //새로운 형태를 newSDF라고 생성
            SimpleDateFormat newSDF = new SimpleDateFormat("yyyy년 MM월 dd일");
            //formattedDate에 newSDF를 paresedDate로 포맷해 넣음
            String formattedDate = newSDF.format(parsedDate);
            //formattedDate 출력
            System.out.println(formattedDate);
        } catch (Exception e) {
        	//입력 오류시 catch문 실행
            System.out.println("잘못된 입력입니다.");
        }
    }
}
