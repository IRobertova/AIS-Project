package uni.fmi.grade;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.grade.model.GradeScreenModel;
import uni.fmi.models.Classs;
import uni.fmi.models.Grade;
import uni.fmi.models.Parent;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;
import uni.fmi.models.Teacher;

public class GradeSteps {

	private GradeScreenModel gradeModel;

	public GradeSteps(final GradeScreenModel gradeModel) {
		this.gradeModel = gradeModel;
	}

	@When("^Избере ученик с \"([^\"]*)\"$")
	public void chooseStudent(String code) throws Throwable {
		gradeModel.chooseStudent(code);
	}

	@When("^Не избере ученик с \"([^\"]*)\"$")
	public void noChosenStudent(String code) throws Throwable {
		code = null;
		gradeModel.chooseStudent(code);

	}

	@When("^Избере предмет \"([^\"]*)\"$")
	public void chooseSubject(String subject) throws Throwable {
		gradeModel.chooseSubject(subject);
	}

	@When("^Не избере предмет \"([^\"]*)\"$")
	public void noChosenSubject(String subject) throws Throwable {
		subject = null;
		gradeModel.chooseSubject(subject);
	}

	@When("^Въведе като оценка (\\d+) цяло число$")
	public void enterGrade(int grade) throws Throwable {
		gradeModel.setGrade(grade);
	}

	@When("^Въведе като оценка (\\d+) число извън интервала за оценка$")
	public void enterInvalidGrade(int grade) throws Throwable {
		gradeModel.setGrade(grade);
	}

	@When("^Натисне бутона за добавяне на оценка$")
	public void clickAddGradeButton() throws Throwable {
		gradeModel.clickAddGradButton();
	}

	@Then("^Показва се \"([^\"]*)\"\\.$")
	public void showMessage(String message) throws Throwable {
		assertEquals(message, gradeModel.getMessage());
	}

}
