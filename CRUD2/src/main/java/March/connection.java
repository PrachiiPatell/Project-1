package March;
import org.bson.Document;

import com.mongodb.MongoClient; 
import com.mongodb.client.MongoCollection;
 import com.mongodb.client.MongoDatabase; 
public class connection {
	 public static void getConnection() {

	try (MongoClient mongoClient = new MongoClient("localhost",27017)) {
		 MongoDatabase database = mongoClient.getDatabase("empolyee");
		  System.out.println("get database successfully");
		  
		  MongoCollection<Document> collection = database.getCollection("student");
		  System.out.println("collection created successfully");
		 
		  Document doc = new Document("name", "henil").append("id", 12); //
		  collection.insertOne(doc);
		  
		  collection.deleteOne(doc);
		  
		  MongoCollection<Document> coll = database.getCollection("stu");
		  System.out.println("collection created succcessfully");
		  
		  Document doc1 = new Document("name","henil").append("id", 101);
		  coll.insertOne(doc1); }
		 
		 }
		  
		  public static void main(String[] args) { 
			 getConnection(); }}
 

