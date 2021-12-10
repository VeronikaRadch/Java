package labbb2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
@SuppressWarnings("serial")

public class MainFrame extends JFrame {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    double sum = 0;
    double result;
    private static final JTextArea textArea1 = new JTextArea(1, 20);
    private static final JTextArea textArea2 = new JTextArea(1, 20);
    private static final JTextArea textArea3 = new JTextArea(1, 20);
    private static final JTextArea textArea5 = new JTextArea(1, 20);
    private static final JTextArea textArea4 = new JTextArea(1, 20);
    private static final JButton button1 = new JButton("Formula 1");
    private static final JButton button2 = new JButton("Formula 2");
    private static final JButton button3 = new JButton("M+");
    private static final JButton button4 = new JButton("MC");
   
    
    public Double calculate1(Double x, Double y, Double z) {
        return Math.pow((Math.cos(Math.exp(x)) + Math.log(Math.pow((1+y), 2))+ Math.pow(Math.exp(Math.cos(x)) + Math.pow(Math.sin(Math.PI*z), 2), 0.5) + Math.pow((1/x), 0.5) + Math.cos(Math.pow(y, 2))), Math.sin(z));
    }

    public Double calculate2(Double x, Double y, Double z) {
        return (Math.pow((1 + Math.pow(x, 2)), (1/y)))/(Math.exp(Math.sin(z)+x));
    }


    public MainFrame() throws HeadlessException {
        super("mainFrame");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setVisible(true);
        add(textArea1);
        add(textArea2);
        add(textArea3);
        add(button1);
        add(button2);
        add(textArea4);
        add(button3);
        add(textArea5);
        add(button4);
        

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(textArea1.getText());
                double secondNumber = Double.parseDouble(textArea2.getText());
                double thirdNumber = Double.parseDouble(textArea3.getText());
                result = calculate1(firstNumber,secondNumber,thirdNumber);
                textArea4.setText(result + "");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(textArea1.getText());
                double secondNumber = Double.parseDouble(textArea2.getText());
                double thirdNumber = Double.parseDouble(textArea3.getText());
                result = calculate2(firstNumber,secondNumber,thirdNumber);
                textArea4.setText(result + "");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += result;
                textArea5.setText(sum+"");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = 0;
                textArea5.setText(sum+"");
            }
        }); 
        
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}