package uni.fmi.models;
import java.util.*;


public class User {


    protected int userID;
    protected String code;
    
    public User() {
    }

   
	public User(int userID, String code) {
		this.userID = userID;
		this.code = code;
	}


	public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
    	this.userID=userID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
    	this.code=code;
    }

}