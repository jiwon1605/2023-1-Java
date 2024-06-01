import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButton extends JFrame {
    private JLabel label;
    private String input;

    public NumberButton() {
        
        setSize(300, 200); //창 크기 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우를 닫을 때 앱 종료하는 기본 종료 동작 설정

        input = ""; //변수를 빈 문자열로 초기화

        JPanel panel = new JPanel(new GridLayout(1, 4, 10, 10)); //버튼을 담을 새로운 패널 컨테이너 생성
        //panel.setLayout(new GridLayout(2, 2));//패널의 레이아웃 설정

        // 숫자 버튼 생성 및 이벤트 처리
        for (int i = 0; i < 3; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(new NumberButtonListener()); 
            panel.add(button);
        }

        // C 버튼 생성 및 이벤트 처리
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonListener());
        panel.add(clearButton);

        // 초기 텍스트를 0으로 설정, 가운데 정렬된 새로운 라벨 생성
        label = new JLabel("0", JLabel.CENTER);

        add(panel, BorderLayout.NORTH);
        add(label, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton) e.getSource()).getText();
            if (input.equals("0")) {
                // 처음에 0이 입력되었을 때는 추가로 0을 입력하지 않음
                if (buttonText.equals("0"))
                    return;
                else
                    input = buttonText;
            } else {
                input += buttonText;
            }
            label.setText(input);
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            input = "";
            label.setText("0");
        }
    }

    public static void main(String[] args) {
    	NumberButton calculator = new NumberButton();
    }
}