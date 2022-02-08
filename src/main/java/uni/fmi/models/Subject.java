package uni.fmi.models;
import java.util.*;


public class Subject {

    private int subjectID;
    private String subjectName;
    private Set<Classs> classses;
    private Set<Teacher> teachers;
    private Set<Grade> grades;


    public Subject() {
    }

    
    public Subject(int subjectID, String subjectName, Set<Classs> classses, Set<Teacher> teachers, Set<Grade> grades) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.classses = classses;
		this.teachers = teachers;
		this.grades = grades;
	}


	public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
    	this.subjectID=subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
    	this.subjectName=subjectName;
    }

    public Set<Classs> getClasss() {
		return classses;
    }

    public void setClass(Set<Classs> classs) {
    	this.classses=classs;
    }

    public Set<Teacher> getTeacher() {
        return teachers;
    }

    public void setTeacher(Set<Teacher> teacher) {
    	this.teachers=teacher;
    }

    public Set<Grade> getGrade() {
        return grades;
    }

    public void setGrade(Set<Grade> grade) {
    	this.grades=grade;
    }

}