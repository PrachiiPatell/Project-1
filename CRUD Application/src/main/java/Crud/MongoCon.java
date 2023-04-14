package Crud;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

public class MongoCon {

	public static void main(String[] args) {
		MongoClient con =  new MongoClient("localhost", 27017);
		
		MongoCollection<Document> coll = con.getDatabase("db");
		MongoDatabase db1=Con.getDatabase("db");
		this.collection = this.database.getCollection(this.collectionName);
		System.out.println("Database is Connected");
		collection=db1.getCollection("student");
		              System.out.println("The Name of collection is: "+collection);
		              Document d1=new Document("Name","Vishal123").append("Age", "21"); 
		              Document d2=new Document("Name","Jaydip123").append("Age", "19");
		//              collection.insertOne(d1); 
		//              collection.insertOne(d2);
		          System.out.println("Data is inserted...");
		
	}
}
