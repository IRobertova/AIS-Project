package uni.fmi.models;
import java.util.*;


public class Grade {


    private int gradeID;
    private int grade;
    private String subject;
    private String student;
    private String studentName;

  
    public Grade() {
    	
    }
    
    public Grade(String code,  String subject, int grade) {
		this.student=code;
		this.subject=subject;
		this.grade=grade;
			
	}

 

	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	
   /* public Grade(int grade, Subject subject, Student student) {
		this.grade = grade;
		this.subject = subject;
		this.student = student;
	}

    public Grade(int gradeID, int grade, Subject subject, Student student) {
		this.gradeID = gradeID;
		this.grade = grade;
		this.subject = subject;
		this.student = student;
	}


	public Grade(int i) {
		this.grade = i;
	}*/

	

	public int getGradeID() {
        return gradeID;
    }

    public void setGradeID(int gradeID) {
    	this.gradeID=gradeID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
    	this.gradeID=gradeID;
    }

    /*public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
    	this.subject=subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
    	this.student=student;
    }
*/
}