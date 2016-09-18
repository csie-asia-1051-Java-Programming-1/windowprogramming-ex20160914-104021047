package HW;

import java.awt.*;
import java.awt.event.*;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MainFrame mFrm = new MainFrame();
mFrm.setVisible(true);
	}

}
class MainFrame extends Frame {
	private Button btn1 = new Button("¥[");
	private Button btn2 = new Button("´î");
	private Button btn3 = new Button("Exit");
	private int i = 0;
	public MainFrame(){
		initcomp();
	}
	private void initcomp() {
		this.setLayout(null);
		this.setLocation(249, 135);
		this.setSize(300, 400);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		btn1.setBounds(50,50,50,100);
		btn2.setBounds(200,50,50,100);
		btn3.setBounds(50,200,200,50);
		btn1.setBackground(Color.CYAN);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn3.setBackground(Color.YELLOW);
		this.setTitle(Integer.toString(i));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				i++;
				ct();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				i--;
				ct();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	public void ct(){
		this.setTitle(Integer.toString(i));
	} 
}