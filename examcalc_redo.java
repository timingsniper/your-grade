import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class examcalc_redo extends JFrame {

	
	private double  total_weight;
	private double total;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examcalc_redo frame = new examcalc_redo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public examcalc_redo() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/apple/Desktop/Coding stuff/Java/Exam Calculator 2/src/kimi_no_na_wa__your_name___v2_folder_icon_by_goukenslay-daiiywm.png"));
		
		
		setTitle("your grade.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(UIManager.getFont("Button.font"));
		lblNewLabel_2.setBounds(535, 64, 98, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(UIManager.getFont("Button.font"));
		label.setBounds(535, 99, 98, 26);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(UIManager.getFont("Button.font"));
		label_1.setBounds(535, 128, 98, 26);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(UIManager.getFont("Button.font"));
		label_2.setBounds(535, 162, 98, 26);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(UIManager.getFont("Button.font"));
		label_3.setBounds(535, 193, 98, 26);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(UIManager.getFont("Button.font"));
		label_4.setBounds(535, 223, 98, 26);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(UIManager.getFont("Button.font"));
		label_5.setBounds(535, 255, 98, 26);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(UIManager.getFont("Button.font"));
		label_6.setBounds(535, 286, 98, 26);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(UIManager.getFont("Button.font"));
		label_7.setBounds(535, 320, 98, 26);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(UIManager.getFont("Button.font"));
		label_8.setBounds(535, 350, 98, 26);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(UIManager.getFont("Button.font"));
		label_9.setBounds(535, 383, 98, 26);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(UIManager.getFont("Button.font"));
		label_10.setBounds(535, 411, 98, 26);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(UIManager.getFont("Button.font"));
		label_11.setBounds(535, 443, 98, 26);
		contentPane.add(label_11);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(51, 94, 89, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(51, 145, 89, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(51, 199, 89, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(51, 255, 89, 31);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(51, 315, 89, 31);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Weight (%)");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(60, 43, 80, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(examcalc_redo.class.getResource("/Resources/WechatIMG13.png")));
		lblNewLabel_1.setBounds(289, 22, 404, 458);
		contentPane.add(lblNewLabel_1);
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(179, 94, 83, 31);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(179, 145, 83, 31);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(179, 199, 83, 31);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(179, 255, 83, 31);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(179, 313, 83, 31);
		contentPane.add(textField_10);
		
		
		JLabel lblGrade = new JLabel("Grade (%)");
		lblGrade.setForeground(new Color(255, 255, 255));
		lblGrade.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblGrade.setBounds(182, 45, 80, 26);
		contentPane.add(lblGrade);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
						ArrayList<Double> grades= new ArrayList<Double>();
						ArrayList<Double> weight= new ArrayList<Double>();
						
						if(!textField.getText().trim().isEmpty())
							weight.add( Double.parseDouble(textField.getText()));
						if(!textField_1.getText().trim().isEmpty())
							weight.add( Double.parseDouble(textField_1.getText()));
						if(!textField_2.getText().trim().isEmpty())
							weight.add( Double.parseDouble(textField_2.getText()));
						if(!textField_3.getText().trim().isEmpty())
							weight.add( Double.parseDouble(textField_3.getText()));
						if(!textField_4.getText().trim().isEmpty())
							weight.add( Double.parseDouble(textField_4.getText()));
						
						if(!textField_6.getText().trim().isEmpty())
							grades.add( Double.parseDouble(textField_6.getText()));
						if(!textField_7.getText().trim().isEmpty())
							grades.add( Double.parseDouble(textField_7.getText()));
						if(!textField_8.getText().trim().isEmpty())
							grades.add( Double.parseDouble(textField_8.getText()));
						if(!textField_9.getText().trim().isEmpty())
							grades.add( Double.parseDouble(textField_9.getText()));
						if(!textField_10.getText().trim().isEmpty())
							grades.add( Double.parseDouble(textField_10.getText()));
						
						total_weight=0;
						total=0;
					for (int i=0; i<weight.size();i++){
						total+= weight.get(i)*grades.get(i)/100;
						total_weight+=weight.get(i)/100;
						}
					/*if (total_weight!=0.8){
						JOptionPane.showMessageDialog(null, "Stop trolling");
						return;
					}*/
					
					
					if((96.5-total)/(1-total_weight)<=100&&(96.5-total)/(1-total_weight)>=0)
						lblNewLabel_2.setText(calculate(96.5));
						else lblNewLabel_2.setText("N/A");
					
					if((92.5-total)/(1-total_weight)<=100&&(92.5-total)/(1-total_weight)>=0)
						label.setText(calculate(92.5));
						else label.setText("N/A");
					
					if((89.5-total)/(1-total_weight)<=100&&(89.5-total)/(1-total_weight)>=0)
						label_1.setText(calculate(89.5));
						else label_1.setText("N/A");
					
					if((86.5-total)/(1-total_weight)<=100&&(86.5-total)/(1-total_weight)>=0)
						label_2.setText(calculate(86.5));
						else label_2.setText("N/A");
					
					if((82.5-total)/(1-total_weight)<=100&&(82.5-total)/(1-total_weight)>=0)
						label_3.setText(calculate(82.5));
						else label_3.setText("N/A");

					if((79.5-total)/(1-total_weight)<=100&&(79.5-total)/(1-total_weight)>=0)
						label_4.setText(calculate(79.5));
						else label_4.setText("N/A");
					
					if((76.5-total)/(1-total_weight)<=100&&(76.5-total)/(1-total_weight)>=0)
						label_5.setText(calculate(76.5));
						else label_5.setText("N/A");
					
					if((72.5-total)/(1-total_weight)<=100&&(72.5-total)/(1-total_weight)>=0)
						label_6.setText(calculate(72.5));
						else label_6.setText("N/A");
					
					if((69.5-total)/(1-total_weight)<=100&&(69.5-total)/(1-total_weight)>=0)
						label_7.setText(calculate(69.5));
						else label_7.setText("N/A");
					
					if((66.5-total)/(1-total_weight)<=100&&(66.5-total)/(1-total_weight)>=0)
						label_8.setText(calculate(66.5));
						else label_8.setText("N/A");
					
					if((62.5-total)/(1-total_weight)<=100&&(62.5-total)/(1-total_weight)>=0)
						label_9.setText(calculate(62.5));
						else label_9.setText("N/A");

					if((59.5-total)/(1-total_weight)<=100&&(59.5-total)/(1-total_weight)>=0)
						label_10.setText(calculate(59.5));
						else label_10.setText("N/A");
					
					if((52.5-total)/(1-total_weight)<=100&&(52.5-total)/(1-total_weight)>=0)
						label_11.setText(calculate(52.5));
						else label_11.setText("N/A");
					
					
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Stop trolling");
				}
			}
		});
		btnCalculate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnCalculate.setBounds(82, 380, 163, 57);
		contentPane.add(btnCalculate);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(examcalc_redo.class.getResource("/Resources/737400.jpg")));
		lblNewLabel_3.setBounds(-147, 0, 882, 511);
		contentPane.add(lblNewLabel_3);
		
		
			}
	public String calculate (double expected){
		double needed= (expected-total)/(1-total_weight);
		double rounded= Math.round(needed*1000)/1000.0;
		String answ=Double.toString(rounded)+"%";
		return 	answ;	
		}
	}

