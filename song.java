package project;
import java.util.Scanner;


public class song {
	//필드 작성
	String title;
	String artist;
	int year;
	String country;
	 
	//매개변수 없는 생성자
	public song(){
		title = ""; artist = ""; year = 0; country = "";
		//모두 초기화
	}
	//노래 정보가진 생성자
	public song(String t, String a, int y, String c){
		title = t; artist = a; year = y; country = c;
	}
	
	//노래 정보 출력하는 show 메소드
	public String Show() {
		return (year+"년, "+country+" 국적의 "+artist+"가 부른"+'"'+title+'"');
	}

	/*발표년도, 국적, 가수, 노래제목을 입력하고 객체 생성
	 show() 이용하여 노래 정보 출력*/
	//입력없이 객체 생성하고 show()이용하여 노래 정보 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		System.out.println("노래제목 가수 발표년도 국적 순서로 입력해주세요.\n");
		song info = new song();
		
		info.title = scanner.next();
		info.artist = scanner.next();
		info.year = scanner.nextInt();
		info.country = scanner.next();
		scanner.close();
		
		System.out.println("Song 정보: " + info.Show());
	}

}
