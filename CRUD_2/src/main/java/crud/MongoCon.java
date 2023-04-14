package crud;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoCon {
	MongoClient mongo = new MongoClient("localhost", 27017);
	DB db = mongo.getDB("mydb");
}
