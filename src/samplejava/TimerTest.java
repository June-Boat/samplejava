/**java���ļ���1�нӿ�ʾ��
 * ����һ����ʱ��Timer�࣬һ��ʵ��ActionListenerd�ӿڵ��࣬ʵ�ֱ���ʱ������õ�actionPerformed()����
 */
package samplejava;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.*;

/**
 * @author June-Boat
 *
 */
public class TimerTest {
	public static void main(String[] args) {
		ActionListener e = new TimePrinter();
		Timer t = new Timer(10000, e);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("now that is " + new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}