import java.util.Scanner;
import java.util.*;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ��� ȸ��Ƚ�� �Է�
		Scanner scanner = new Scanner(System.in);
		String str;
		int num;
		System.out.println("input)");
		str = scanner.nextLine();
		num = scanner.nextInt();
		
		if(num == 0) {
			System.out.println("������");
			System.exit(0);
		}
		
		//num�� ����϶� 
		if(num > 0) {
			//�켱 ȸ�� Ƚ����ŭ ���ڿ� ����, StringBuilder �̿�
			StringBuilder sb = new StringBuilder(str);
	        
        	for(int i = 0; i < num; i ++) {
	        	//���ڿ� �� �� ���� ���ڸ� ������ charŸ������ ��ȯ�Ͽ� firstChar�� ����
	            char firstChar = sb.charAt(0);
	            //�� ���� ���� ����
	            sb.deleteCharAt(0);
	            //firstchar�� append�� �̿��� �� �ڿ� �߰�
	            sb.append(firstChar);
		        //ȸ�� Ƚ����ŭ ������ ���ڿ� ���
	        }
	        System.out.println(sb.toString());
	        
	        //str���̿��� num��ŭ �� �������� i�� ������->�̹� num��ŭ ȸ���� �������ϱ�
	        for(int i  = 0; i <= str.length()-2*num;i +=num) {
	        	for(int j = 0; j<num;j++) {
		        	//���ڿ� �� �� ���� ���ڸ� ������ charŸ������ ��ȯ�Ͽ� firstChar�� ����
		        	char firstChar = sb.charAt(0);
		            //�� ���� ���� ����
		            sb.deleteCharAt(0);
		            //firstchar�� append�� �̿��� �� �ڿ� �߰�
		            sb.append(firstChar);
	        		
	        	}
	            System.out.println(sb.toString());
	        }
		}
		
		//num�� �����϶� 
		if(num < 0) {
			//�켱 ȸ�� Ƚ����ŭ ���ڿ� ����, StringBuilder �̿�
			StringBuilder sb = new StringBuilder(str);
	        
        	for(int i = 0; i < Math.abs(num); i ++) {
	        	//���ڿ� �� �� ���� ���ڸ� ������ charŸ������ ��ȯ�Ͽ� lastChar�� ����
	            char lastChar = sb.charAt(sb.length()-1);
	            //�� ���� ���� ����
	            sb.deleteCharAt(sb.length()-1);
	            //lastchar�� append�� �̿��� �� �տ� �߰�
	            sb.insert(0,lastChar);
		        //ȸ�� Ƚ����ŭ ������ ���ڿ� ���
	        }
	        System.out.println(sb.toString());
	        
	        //str���̿��� num��ŭ �� �������� i�� ������->�̹� num��ŭ ȸ���� �������ϱ�
	        for(int i  = 0; i <= sb.length()-2*Math.abs(num) ;i +=Math.abs(num)) {
		        	for(int j = 0; j<Math.abs(num);j++) {
		        		//���ڿ� �� �� ���� ���ڸ� ������ charŸ������ ��ȯ�Ͽ� lastChar�� ����
			            char lastChar = sb.charAt(sb.length()-1);
			            //�� ���� ���� ����
			            sb.deleteCharAt(sb.length()-1);
			            //lastchar�� append�� �̿��� �� �տ� �߰�
			            sb.insert(0,lastChar);
				        //ȸ�� Ƚ����ŭ ������ ���ڿ� ���
		        		
		        	}
		            System.out.println(sb.toString());
		        }
			}
		}
    }

