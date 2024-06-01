package project;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculation {

    public static void main(String[] args) {
        System.out.print("정수와 연산자(+,-,*,/,%)를 입력하시오.\n");
        Scanner scanner = new Scanner(System.in);

        while (true) {
      
        	try {
        		int num1 = scanner.nextInt();
                String operator = scanner.next();
                if (operator.equals("=")) {
                	break;
                } /*operator가 =이면 루프를 탈출한다*/
                int num2 = scanner.nextInt();
                
                double result = 0;
                
                /*operator에 따른 연산의 경우를 작성
                 */
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        System.out.print("결과: "+result+"\n");
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.print("결과: "+result+"\n");
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.print("결과: "+result+"\n");
                        break;
                    case "/":
                    	//num2가 0일때는 연산이 불가능하므로 예외 처리로 넘겨줌
                    	if(num2 == 0)
                    		throw new ArithmeticException();
                        result = (double) num1 / num2;
                        System.out.print("결과: "+result+"\n");
                        break;
                    case "%":
                    	//num2가 0일때는 연산이 불가능하므로 예외 처리로 넘겨줌
                    	if(num2 == 0)
                    		throw new ArithmeticException();
                        result = num1 % num2;
                        System.out.print("결과: "+result+"\n");
                        break;
                }

            }catch (InputMismatchException | NumberFormatException e) {
                System.out.println("입력오류");
                scanner.nextLine();
                /*문자를 입력받거나 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 예외 처리
                 */
            }catch (ArithmeticException e) {
                System.out.println("계산오류");
                scanner.nextLine();
                //0으로 나눗셈을 할 경우 예외 처리
            }
        }
    }
}
