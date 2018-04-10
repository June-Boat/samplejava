/**java核心技术1中接口示例
 * 创建一个定时器Timer类，一个实现ActionListenerd接口的类，实现被定时器类调用的actionPerformed()方法
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