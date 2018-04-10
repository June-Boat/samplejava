/**
 * 
 */
package shipeiqi;

/**
 * @author June-Boat
 *
 */
public class Client {
	   public static void main() {
		  DBdriver db1=new DBmysql();
	      db1.connect();
	      db1.query();
	      
	      DBdriver db2=new DBdriverAdapter();
	      db2.connect();
	      db2.query();
	      
	   }
	}