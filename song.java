package project;
import java.util.Scanner;


public class song {
	//�ʵ� �ۼ�
	String title;
	String artist;
	int year;
	String country;
	 
	//�Ű����� ���� ������
	public song(){
		title = ""; artist = ""; year = 0; country = "";
		//��� �ʱ�ȭ
	}
	//�뷡 �������� ������
	public song(String t, String a, int y, String c){
		title = t; artist = a; year = y; country = c;
	}
	
	//�뷡 ���� ����ϴ� show �޼ҵ�
	public String Show() {
		return (year+"��, "+country+" ������ "+artist+"�� �θ�"+'"'+title+'"');
	}

	/*��ǥ�⵵, ����, ����, �뷡������ �Է��ϰ� ��ü ����
	 show() �̿��Ͽ� �뷡 ���� ���*/
	//�Է¾��� ��ü �����ϰ� show()�̿��Ͽ� �뷡 ���� ���
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		System.out.println("�뷡���� ���� ��ǥ�⵵ ���� ������ �Է����ּ���.\n");
		song info = new song();
		
		info.title = scanner.next();
		info.artist = scanner.next();
		info.year = scanner.nextInt();
		info.country = scanner.next();
		scanner.close();
		
		System.out.println("Song ����: " + info.Show());
	}

}
