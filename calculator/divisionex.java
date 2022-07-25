package calculator;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class divisionex implements ActionListener{
	public static void main(String[] args) {
	JFrame frame= new JFrame();
	String msgString;
	JTextField num1,num2,res;
	JLabel l1,l2,l3;
	JButton divButton;
	l1=new JLabel("Divident");
	l2=new JLabel("Divisor");
	l3=new JLabel("result");
	num1= new JTextField(10);
	num2= new JTextField(10);
	res=new JTextField(10);
	divButton =new JButton("click");
	divButton.addActionListener();
	frame.add(l1);
	
	
}
	public void actionPerformed(ActionListener ae) {
		
	}
}