/**
 * 
 */
package shipeiqi;

/**
 * @author June-Boat
 *
 */
public class DBdriverAdapter extends DBnew implements DBdriver {
	   /** @pdOid 37152c24-2329-4138-b685-1ecaba3ef15a
	       @pdRoleInfo migr=yes name=NewDBdriver assc=association1 */
	   NewDBdriver dbnew;
	   
	   /** @pdOid 396b92ee-ddd4-430f-ab85-689cbeacce1e */
	   public DBdriverAdapter() {
	      dbnew=new DBnew();
	   }
	   
	   /** @pdOid 51304ab2-58ce-456d-892e-be58518690cf */
	   public void connect() {
	      // TODO: implement
	      dbnew.newConnect();
	      
	   }
	   
	   /** @pdOid 78cd347c-043c-4c3c-b347-0cb33f827525 */
	   public void query() {
	      // TODO: implement
	      dbnew.newQuery();
	   }
}
