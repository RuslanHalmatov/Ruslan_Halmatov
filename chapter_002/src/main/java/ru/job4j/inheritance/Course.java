package ru.job4j.inheritance;

/**
  *Class {@code Course} используется для описания свойств курса читаемого преподавателем.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Course extends Processing {

	/**
      *Конструктор {@code Course} инициализирует поля объекта курс.
	  * первый: @param teacher - преподаватель, читающий курс.
	  * второй: @param student - студент, которому читают курс.
    */
	public Course(Teacher teacher, Student student) {

		setName("Преподаватель " + teacher.getName() + " прочитал курс математического анализа студенту группы " + student.getGroup()
		+ " " + student.getName());
	}

}