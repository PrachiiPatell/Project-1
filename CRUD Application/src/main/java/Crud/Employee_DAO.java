package Crud;

import java.util.Collection;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.connection.Connection;

public class Employee_DAO {
//public static void main(String[] args) {
	public static void Employee_DAO(){ 
	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	MongoClient mongo = new MongoClient("localhost", 27017);
	DB db = mongo.getDB("Employee_db");
//}
	}


public static int save(AddEmpDetails e) {
	// TODO Auto-generated method stub
	return 0;
}


public static Employee_DAO getConnection() {
	// TODO Auto-generated method stub
	return null;
}
}
