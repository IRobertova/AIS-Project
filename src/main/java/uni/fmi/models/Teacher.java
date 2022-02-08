package uni.fmi.models;
import java.util.*;


public class Teacher extends User {


    private String firstName;
    private String secondName;
    private Classs classs;
    private Set<Subject> subjects;
    private Set<Student> students;

    
    public Teacher() {
    }


    public Teacher(String code, String firstName, String secondName, Classs classs, Set<Subject> subjects, Set<Student> students) {
		super();
		super.code=code;
		this.firstName = firstName;
		this.secondName = secondName;
		this.classs = classs;
		this.subjects = subjects;
		this.students = students;
	}


	public Teacher(String code, String firstName, String secondName) {
		super();
		super.code=code;
		this.firstName = firstName;
		this.secondName = secondName;
	}


	public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs ) {
    	this.classs=classs;
    }

    public Set<Subject> getSubject() {
        return subjects;
    }

    public void setSubject(Set<Subject> subject) {
    	this.subjects=subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
    	this.firstName=firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
    	this.secondName=secondName;
    }

    public Set<Student> getStudents() {
    	return students;
    }

    public void setStudents(Set<Student> students) {
    	this.students=students;
    }

}