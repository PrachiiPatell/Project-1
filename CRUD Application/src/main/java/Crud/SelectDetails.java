package Crud;

import java.util.List;

public class SelectDetails {
public static AddEmpDetails getEmployeebyId(int id){
	AddEmpDetails e=new AddEmpDetails();
	try {
		Employee_DAO emp=Employee_DAO.getConnection();
		
	}catch(Exception e1) {
		e1.printStackTrace();
	}
	return e;
}
	public static List<AddEmpDetails> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
