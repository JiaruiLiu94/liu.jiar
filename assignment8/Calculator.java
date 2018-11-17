package assignment8;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextField;



public class Calculator extends JFrame {

	JTextField textField;

	JPanel p;

	String input = "";

	double result = 0;

	boolean firstNum = true;

	String operator = "=";

	double second = 0;

	

	public Calculator(){

		super("Calculator");

		setLayout(new BorderLayout());

		

		textField = new JTextField(10);

		

		p = new JPanel(new GridLayout(5,10));

		

		String[] name= {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};

		for(int i = 0; i < 16; i++){

			JButton button = new JButton(name[i]);

			button.addActionListener(new ButtonListener());

			p.add(button);

		}

		

		getContentPane().add(BorderLayout.NORTH, textField);

		getContentPane().add(BorderLayout.CENTER, p);

		

		setSize(500, 500);

		setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);   

        

	}

	

	public static void main(String[] args){

		Calculator c = new Calculator();

	}

	

	class ButtonListener implements ActionListener{

		

		@Override

		public void actionPerformed(ActionEvent e) {

			String action = e.getActionCommand();

			

			if(action.equals("C")){

				textField.setText("0");

				operator = "=";

				firstNum = true;

			}

			else if("1234567890".indexOf(action) >= 0){

		        if (firstNum) {  

		            textField.setText(action);  

		        } else {  

		            textField.setText(textField.getText() + action);  

		        }  

		        

		        firstNum = false;  

			}

			else{

				operation(action);

			}

		}

		

		public void operation(String action){

			if(operator.equals("+")){

				result += Double.parseDouble(textField.getText());

			}



			if(operator.equals("-")){

				result -= Double.parseDouble(textField.getText());

			}



			if(operator.equals("*")){

				result *= Double.parseDouble(textField.getText());

			}



			if(operator.equals("/")){

				result /= Double.parseDouble(textField.getText());

			}

			

			if(operator.equals("=")){

				result = Double.parseDouble(textField.getText());

			}

			

			

			textField.setText(String.valueOf(result));

			operator = action;

			firstNum = true;

		}

	}

}