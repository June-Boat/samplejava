/**
 * 
 */
package exercise;

import java.util.*;

/**
 * @author June-Boat
 *
 */
class Command{
	private String com;
	public Command (String s) {
		com=s;
	}
	public void operation() {
		System.out.println(com);
	}
}

class CommandUse{
	public static Command addCommand(Queue<Command> q,Command com) {
		q.offer(com);
		return com;
	}
}

class CommandUse2{
	public static void removeCommand(Queue<Command> q) {
		q.poll().operation();;
	}
}

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Command> q= new LinkedList<>();
		CommandUse.addCommand(q,new Command("add"));
		CommandUse.addCommand(q,new Command("remove"));
		CommandUse2.removeCommand(q);
		CommandUse2.removeCommand(q);
	}
}
