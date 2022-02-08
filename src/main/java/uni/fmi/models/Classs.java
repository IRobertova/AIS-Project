package uni.fmi.models;
import java.util.*;


public class Classs {
	
	
	private int classID;
    private String className;
    private Teacher mainTeacher;
    private Set<Student> students;
    private Set<Subject> subjects;
    
  
    public Classs() {
    }

    
    public Classs(int classID, String className, Teacher mainTeacher, Set<Student> students, Set<Subject> subjects) {
		this.classID = classID;
		this.className = className;
		this.mainTeacher = mainTeacher;
		this.students = students;
		this.subjects = subjects;
	}


	public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID=classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
    	this.className=className;
    }

    public Teacher getMainTeacher() {
        return mainTeacher;
    }

    public void setMainTeacher(Teacher teacher) {
    	this.mainTeacher=teacher;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
    	this.students=students;
    }

    public Set<Subject> getSubject() {
        return subjects;
    }

    public void setSubject(Set<Subject> subject) {
    	this.subjects=subject;
    }

}