package uni.fmi.models;
import java.util.*;


public class Parent extends User {

	private Set<Student> students;

    public Parent() {
    }

    

    public Parent(Set<Student> students, String code) {
		super();
		super.code=code;
		this.students = students;
	}

	public Set<Student> getStudent() {
        return students;
    }

    public void setStudent(Set<Student> student) {
    	this.students=student;
    }

}