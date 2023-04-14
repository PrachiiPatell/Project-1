package March;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class employeedao {
private MongoCollection<Document> collection;
	
	public employeedao() {
		MongoClient mongoClient = new MongoClient("localhost",27017);
		MongoDatabase database = mongoClient.getDatabase("empolyee");
					

					
		this.collection=database.getCollection("employeedata");
	}
	//register
	public void savedata(String email,String fname,String lname,String phone,String gender,String pass,String cpass) {
		Document emp = new Document("id",email).append("fname",fname).append("lname", lname).append("phone", phone).append("gender", gender).append("pass", pass).append("cpass", cpass);
		collection.insertOne(emp);
	}

	//login
	public Document getuserbyid(String id) {
		Document query = new Document("id",id);
		
		Document user = collection.find(query).first();
		if (user != null) {
			
            return user;
        }
        return null;
	}
	//delete
	public void deleteemp(String id) {
		Document query = new Document("id",id);
		collection.deleteOne(query);
	}
	//update
	public void updatedata(String id,String fname,String lname,String phone) {
		Document query = new Document("id",id);
		System.out.println("sugsu"+id+fname+lname+phone);
		Document updatedoc = new Document("$set",new Document("fname",fname).append("lname", lname).append("phone", phone));
		System.out.println("sd"+updatedoc);
		System.out.println("id"+query);
		collection.updateOne(query, updatedoc);
	}
}
