package uni.fmi.grade.model;

import java.lang.invoke.VarHandle;

import uni.fmi.grade.service.GradeService;
import uni.fmi.models.Grade;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;

public class GradeScreenModel {

	private String studentName;
	private String code;
	private String subject;
	private int grade;
	private String message;

	public void chooseStudent(final String code) {
		this.code = code;

	}

	public void chooseSubject(final String subject) {
		this.subject = subject;
	}

	public void clickAddGradButton() {
		message = GradeService.addGrade(code, subject, grade);
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMessage() {
		return message;
	}

}
