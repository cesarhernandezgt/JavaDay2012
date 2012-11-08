package net.guatejug.mondoDB_1;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Java on duty..." );
        try {
			//Mongo m = new Mongo();
        	Mongo m = new Mongo( "localhost" , 27017 );
        	
        	DB db = m.getDB("test");		
			
        	DBCollection coll = db.getCollection("users");
        	
        	//FIND ONE
//        	DBObject myDoc = coll.findOne();
//        	System.out.println(myDoc);
        	
        	
        	//INSERT
//        	BasicDBObject doc = new BasicDBObject();
//            doc.put("name", "MongoDB");
//            doc.put("type", "database");
//            doc.put("count", 1);
//            coll.insert(doc);
        	
        	
            //COUNTING 
//            System.out.println(coll.getCount());
        	
        	
        	//FIND ALL THE DOCUMENTS
//        	DBCursor cursor = coll.find();
//            try {
//                while(cursor.hasNext()) {
//                    System.out.println(cursor.next());
//                }
//            } finally {
//                cursor.close();
//            }
        	
        	
        	//DELETE
//        	System.out.println("Documents Before delete: "+coll.getCount());
//        	coll.remove(new BasicDBObject().append("name", "MongoDB"));
//        	System.out.println("Documents After delete: "+coll.getCount());
        	
        	
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		}
        
    }
}
