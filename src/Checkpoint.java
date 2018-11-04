import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	String color;
	color = JOptionPane.showInputDialog("What is your favorite color?");
	if (color.equalsIgnoreCase("Purple")){
	JOptionPane.showMessageDialog(null, "Purple is my favorite color too!");
	}
	else {
		JOptionPane.showMessageDialog(null, color+ " isn't my favorite color, but it's still awesome!");
	}
}
}
