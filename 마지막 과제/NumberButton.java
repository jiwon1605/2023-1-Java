import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButton extends JFrame {
    private JLabel label;
    private String input;

    public NumberButton() {
        
        setSize(300, 200); //â ũ�� ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����츦 ���� �� �� �����ϴ� �⺻ ���� ���� ����

        input = ""; //������ �� ���ڿ��� �ʱ�ȭ

        JPanel panel = new JPanel(new GridLayout(1, 4, 10, 10)); //��ư�� ���� ���ο� �г� �����̳� ����
        //panel.setLayout(new GridLayout(2, 2));//�г��� ���̾ƿ� ����

        // ���� ��ư ���� �� �̺�Ʈ ó��
        for (int i = 0; i < 3; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(new NumberButtonListener()); 
            panel.add(button);
        }

        // C ��ư ���� �� �̺�Ʈ ó��
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonListener());
        panel.add(clearButton);

        // �ʱ� �ؽ�Ʈ�� 0���� ����, ��� ���ĵ� ���ο� �� ����
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
                // ó���� 0�� �ԷµǾ��� ���� �߰��� 0�� �Է����� ����
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