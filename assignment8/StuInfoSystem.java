package assignment8;
import java.awt.Container;

import java.awt.Font;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableCellRenderer;


public class StuInfoSystem {



	public static void main(String[] args) {

		StudentView View = new StudentView();

		StudentModel Model = new StudentModel();

		StudentController Controller = new StudentController(Model,View);

		View.setVisible(true);

	}

	

}


class StudentModel {

	private String ID;

	private String Name;

	private String Gender;

	

	StudentModel(){}

	

	StudentModel(String ID, String Name, String Gender){

		this.ID = ID;

		this.Name = Name;

		this.Gender = Gender;

	}

	

	public String getID() {

		return ID;

	}



	public void setID(String iD) {

		ID = iD;

	}



	public String getName() {

		return Name;

	}



	public void setName(String name) {

		Name = name;

	}



	public String getGender() {

		return Gender;

	}



	public void setGender(String gender) {

		Gender = gender;

	}



}



class StudentView extends JFrame {

	

	/**

	 * 

	 */

	private static final long serialVersionUID = 1L;

	private Font font;

	private JTextField IDTextField, NameTextField, GenderTextField;

	private JLabel IDLabel, NameLabel, GenderLabel;

	private JButton InsertButton, ViewAllButton;

	private JTable StuInfoTable;

	private JScrollPane jscrollpane;

	private String[] columnName = {"ID","Name","Gender"};

	private String[][] rowData = new String[10][3];

	private String[] GenderOption= {"Male","Female"};

	private JComboBox<String> GenderComboBox;

	public static int NumberOfStu = 0;

	

	StudentView(){

		super("Student Information System");

		createComponents();

		setLayout();

		display();

	}

	

	private void createComponents() {

		font = new Font("TimesRoman",Font.PLAIN,24);

		IDTextField = new JTextField(5);

		IDTextField.setFont(font);

		NameTextField = new JTextField(5);

		NameTextField.setFont(font);

		GenderTextField = new JTextField(5);

		GenderTextField.setFont(font);

		

		

		IDLabel = new JLabel("ID");

		IDLabel.setFont(font);

		NameLabel = new JLabel("Name");

		NameLabel.setFont(font);

		GenderLabel = new JLabel("Gender");

		GenderLabel.setFont(font);

		

		InsertButton = new JButton("Insert");

		InsertButton.setFont(font);

		ViewAllButton = new JButton("View");

		ViewAllButton.setFont(font);

		

		jscrollpane = new JScrollPane();

		StuInfoTable = new JTable(rowData,columnName);

		Font font2 = new Font("TimesRoman",Font.PLAIN,20);

		StuInfoTable.setFont(font2);

		GenderComboBox = new JComboBox<>(GenderOption);



	}

	

	private void setLayout() {

		Container c = this.getContentPane();

		this.setLocation(600, 250);

		this.setLayout(null);

		

		c.add(IDLabel);

		IDLabel.setBounds(40, 70, 100, 30);

		c.add(NameLabel);

		NameLabel.setBounds(40, 140, 100, 30);

		c.add(GenderLabel);

		GenderLabel.setBounds(40, 210, 100, 30);

		

		c.add(IDTextField);

		IDTextField.setBounds(150, 70, 120, 30);

		c.add(NameTextField);

		NameTextField.setBounds(150, 140, 120, 30);


		c.add(GenderComboBox);

		GenderComboBox.setBounds(150, 210, 120, 30);

		

		c.add(InsertButton);

		InsertButton.setBounds(300, 70, 200, 30);

		c.add(ViewAllButton);

		ViewAllButton.setBounds(300, 190, 200, 30);

		

		jscrollpane.setBounds(10, 250, 550, 250);

		jscrollpane.setViewportView(StuInfoTable);

		StuInfoTable.setRowHeight(35); 

		DefaultTableCellRenderer r = new DefaultTableCellRenderer();    

		r.setHorizontalAlignment(JLabel.CENTER);

		StuInfoTable.setDefaultRenderer(Object.class, r);

		c.add(jscrollpane);

		

		setVisible(true);

		

	}

	

	private void display() {

		this.setSize(600, 600);

		setVisible(true);

	}



	

	public void addInsertListener(ActionListener Ac) {

		this.InsertButton.addActionListener(Ac);

	}

	

	public void addViewListener(ActionListener Ac) {

		this.ViewAllButton.addActionListener(Ac);

	}

	

	public String getID() {

		return IDTextField.getText();

	}



	public String getName() {

		return NameTextField.getText();

	}



	public String getGender() {

		return GenderComboBox.getSelectedItem().toString();

	}



	public String[][] getRowData() {

		return rowData;

	}



	public void setRowData(String ID, String Name, String Gender) {

		this.rowData[NumberOfStu][0] = ID;

		this.rowData[NumberOfStu][1] = Name;

		this.rowData[NumberOfStu][2] = Gender;

		NumberOfStu++;

		jscrollpane.setViewportView(StuInfoTable);

		add(jscrollpane);

		

	}

}



class StudentController {

	private StudentModel Model;

	private StudentView View;

	

	StudentController(StudentModel Model, StudentView View){

		this.Model = Model;

		this.View = View;

		

		this.View.addInsertListener(new InsertListener());

		this.View.addViewListener(new ViewListener());

	}

	

	class InsertListener implements ActionListener{



		@Override

		public void actionPerformed(ActionEvent e) {

			String IDtmp = View.getID();

			String Nametmp = View.getName();

			String Gendertmp = View.getGender();

			try {

				View.setRowData(IDtmp, Nametmp, Gendertmp);

			}catch(Exception e2) {

				System.out.println("The Number of Students is Overload!!!");

			}

			Model.setID(IDtmp);

			Model.setName(Nametmp);

			Model.setGender(Gendertmp);

		}

		

	}

	

	class ViewListener implements ActionListener{



		@Override

		public void actionPerformed(ActionEvent e) {

			

		}

		

	}


}



