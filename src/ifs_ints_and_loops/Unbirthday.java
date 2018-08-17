package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("When is your Birthday?");
	if(answer.equals("08/16")) {
	JOptionPane.showMessageDialog(null,"HappyBirthday");
	}else {
	JOptionPane.showMessageDialog(null,"happy unbirthday");
}
}
}