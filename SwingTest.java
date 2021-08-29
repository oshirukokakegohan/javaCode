import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingTest extends JFrame implements ActionListener{
	JPasswordField pass = new JPasswordField(16);
	JPanel panel = new JPanel();
	JPanel secondPanel = new JPanel();
	
	public static void main(String args[]){
    SwingTest frame = new SwingTest("Login");
    frame.setVisible(true);
	}
	
	SwingTest(String title){
		 setTitle(title);
		 setSize(500,400);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JLabel label = new JLabel("ID");
		 JLabel passLabel = new JLabel("Password");
		 JTextField text = new JTextField(20);
		 
		 JButton btn1 = new JButton("OK");
		 btn1.addActionListener(this);
		 JButton btn2 = new JButton("Cancel");
		 
		 panel.add(label);
		 panel.add(text);
		 panel.add(passLabel);
		 panel.add(pass);
		 panel.add(btn1,BorderLayout.SOUTH);
		 panel.add(btn2);
		 
		 Container contentPane = getContentPane();
		 contentPane.add(panel,BorderLayout.CENTER);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		String password = new String(pass.getPassword());
		
		if(password.equals("pass")) {
			JLabel passSuccess = new JLabel("Success") ;
			JOptionPane.showMessageDialog(this,passSuccess,
					"Login",JOptionPane.INFORMATION_MESSAGE);
			panel.setVisible(false);
			secondPanel.setVisible(true);
			
		}else {
			JLabel passFailed = new JLabel("Failed");
			JOptionPane.showMessageDialog(this,passFailed,
					"Login",JOptionPane.ERROR_MESSAGE);
			pass.setText("");
		}
	}
}