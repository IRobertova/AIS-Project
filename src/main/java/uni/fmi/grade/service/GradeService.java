package uni.fmi.grade.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import uni.fmi.models.Grade;

public class GradeService {

	private static List<Grade> gradesDb = new ArrayList<>();
	public static String addGrade(final String code, final String subject, final int grade) {
		String noGrade="";
		noGrade=String.valueOf(grade);
		if(null==code) {
			return "Моля, изберете ученик!";
		}else if(null==subject) {
			return "Моля, изберете предмет!";
		}else if(noGrade.equals("0")) {
			 return "Моля, въведете валидна оценка!";
		}else if((grade>6)||(grade<2)) {
			return "Моля, въведете за оценка в интервал от 2 до 6!";
		}


		final Grade grade1 = new Grade("1000000604","Matematika",grade);
		gradesDb.add(grade1);

		return "Добавихте успешно оценка!";
	
	}

}
