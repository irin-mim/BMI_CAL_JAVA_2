import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Cal {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 328, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(124, 252, 0));
		panel.setBounds(10, 10, 292, 51);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("BMI Calulator");
		label.setBounds(73, 10, 130, 30);
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Arial", Font.BOLD, 18));
		panel.add(label);
		
		Panel panel_1 = new Panel();
		panel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
		panel_1.setForeground(new Color(47, 79, 79));
		panel_1.setBackground(new Color(124, 252, 0));
		panel_1.setBounds(20, 67, 270, 224);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Label label_1 = new Label("Height(m) : ");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		label_1.setBounds(10, 26, 62, 22);
		panel_1.add(label_1);
		
		Label label_2 = new Label("Weight(kg) : ");
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setBounds(10, 74, 70, 22);
		panel_1.add(label_2);
		
		Label label_3 = new Label("BMI");
		label_3.setForeground(new Color(0, 0, 128));
		label_3.setFont(new Font("Arial", Font.BOLD, 16));
		label_3.setBounds(10, 118, 34, 22);
		panel_1.add(label_3);
		
		Button button = new Button("Calclute");
		button.setForeground(new Color(0, 0, 139));
		button.setBackground(new Color(255, 255, 255));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double h = Double.parseDouble(textField.getText());
				double w = Double.parseDouble(textField_1.getText());
				double bmi= w/(h*h);
				String cal = String.format("%.2f", bmi);
				textField_2.setText(cal);
				if(bmi<=18.5){
					textField_2.setOpaque(true);
					textField_3.setText("Under Weight");
				}
				else if(bmi<=24.5){
					textField_2.setOpaque(true);
					textField_3.setText("Normal Weight");
				}
				else if(bmi<=29.5){
					textField_2.setOpaque(true);
					textField_3.setText("Over Weight");
				}
				if(bmi>=30){
					textField_2.setOpaque(true);
					textField_3.setText("Obese");
				}
			}
		});
		button.setBounds(10, 174, 70, 32);
		panel_1.add(button);
		
		Button button_1 = new Button("Clear");
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setForeground(new Color(0, 0, 128));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_2.setOpaque(true);
				textField_2.setBackground(null);
			}
		});
		button_1.setBounds(100, 174, 70, 32);
		panel_1.add(button_1);
		
		Button button_2 = new Button("Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.setBounds(190, 174, 70, 32);
		panel_1.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 64, 137, 32);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(84, 26, 141, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(51, 108, 86, 32);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setBackground(new Color(124, 252, 0));
		textField_3.setFont(new Font("Arial", Font.BOLD, 15));
		textField_3.setBounds(139, 107, 121, 33);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
	}
}
