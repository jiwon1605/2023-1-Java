import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class StringToExchange {

	public static void main(String[] args) {
		//���ڿ��� �Է�
		Scanner scan = new Scanner(System.in);
		String date;
		System.out.println("input)");
		date = scan.next();
		
		//yyyy/MM/dd�� ���·� �Է¹ޱ�
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");
        //�Է¹��� ���ڿ��� �Ľ��Ͽ� Date��ü�� ��ȯ
		Date parsedDate;
        try {
        	//paresedDate�� date�� SDF�� �Ľ��� ���� ����
            parsedDate = SDF.parse(date);
            //���ο� ���¸� newSDF��� ����
            SimpleDateFormat newSDF = new SimpleDateFormat("yyyy�� MM�� dd��");
            //formattedDate�� newSDF�� paresedDate�� ������ ����
            String formattedDate = newSDF.format(parsedDate);
            //formattedDate ���
            System.out.println(formattedDate);
        } catch (Exception e) {
        	//�Է� ������ catch�� ����
            System.out.println("�߸��� �Է��Դϴ�.");
        }
    }
}
