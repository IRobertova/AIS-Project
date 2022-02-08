package uni.fmi.models;
import java.util.*;


public class Student extends User {

    private String firstName;
    private String secondName;
    private String surname;
    private Teacher mainTeacher;
    private Parent parent;
    private Classs classs;
    private Set<Grade> grades;
    
    
    public Student() {
    }

    public Student(String code, String firstName, String secondName, String surname, Teacher mainTeacher, Parent parent,
			Classs classs, Set<Grade> grades) {
		super();
		super.code=code;
		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.mainTeacher = mainTeacher;
		this.parent = parent;
		this.classs = classs;
		this.grades = grades;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
    	this.surname=surname;
    }

    public Teacher getMainTeacher() {
        return null;
    }

    public void setMainTeacher(Teacher mainTeacher) {
    	this.mainTeacher=mainTeacher;
    }

    public Parent getParent() {
        return parent;
    }


    public void setParent(Parent parent) {
    	this.parent=parent;
    }

    public Classs getClasss() {
        return classs;
    }

    public void setClass(Classs classs) {
    	this.classs=classs;
    }

    public Set<Grade> getGrade() {
        return grades;
    }

    public void setGrade(Set<Grade> grades) {
    	this.grades=grades;
    }

}