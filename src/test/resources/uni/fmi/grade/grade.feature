Feature: Добавяне на оценка от изпит 

	Background:
	Given: Преподавател отваря формата за добавяне на оценка
	
  Scenario: Добавяне на валидна оценка
    When Избере ученик с "1865965204"
    And Избере предмет "История"
    And Въведе като оценка 6 цяло число
    And Натисне бутона за добавяне на оценка
    Then Показва се "Добавихте успешно оценка!". 

	Scenario: Добавяне на оценка без избор на ученик
    When Не избере ученик с ""
    And Избере предмет "Рисуване"
    And Въведе като оценка 5 цяло число
    And Натисне бутона за добавяне на оценка
    Then Показва се "Моля, изберете ученик!". 

	Scenario: Добавяне на оценка без избор на предмет
    When Избере ученик с "1584102444"
    And Не избере предмет ""
    And Въведе като оценка 5 цяло число
    And Натисне бутона за добавяне на оценка
    Then Показва се "Моля, изберете предмет!". 

	Scenario: Добавяне на невалидна оценка
    When Избере ученик с "1584102444"
    And Избере предмет "География"
    And Въведе като оценка 8 число извън интервала за оценка
    And Натисне бутона за добавяне на оценка
    Then Показва се "Моля, въведете за оценка в интервал от 2 до 6!". 
    
	Scenario: Оценяване на ученик без добавяне оценка
    When Избере ученик с "1584102444"
    And Избере предмет "География"
    And Натисне бутона за добавяне на оценка
    Then Показва се "Моля, въведете валидна оценка!". 




    
