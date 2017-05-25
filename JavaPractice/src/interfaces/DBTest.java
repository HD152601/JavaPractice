/**
 * 
 */
package interfaces;

/**
 * <pre>
 * interfaces
 *   |_ DBTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author            : ksw10
 * @version           : 1.0
 */
public class DBTest{

	public static void main(String[] args) {
			IDBManager db = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
			IDBManager db1 = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
			crud(db);
			System.out.println("");
			crud(db1);
		}
	
	public static void crud(IDBManager db){
		if(db instanceof OracleDB)
		{
			System.out.println("<<변경 후>>");
		}
		else if (db instanceof SybaseDB)
		{
			System.out.println("<<변경 전>>");
		}
		db.insert();
		db.search();
		db.update();
		db.delete();
		}

}
