package ru.job4j.inheritance;

/**
  *Class {@code Teacher} используется для описания свойств и поведения Учителя.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Teacher extends Profession {

	/**
	  *Поле класса {@code Teacher} наименование ученой степени преподавателя.
	*/
	private String academicDegree;

	/**
      *Конструктор {@code Teacher} инициализирует поля объекта Преподаватель.
	  * первый: @param name - ФИО преподавателя,унаследовано от базового класса {@code Profession} и.
	  * второй: @param academicDegree - ученая степень преподавателя.
    */
	public Teacher(String name, String academicDegree) {

		this.academicDegree = academicDegree;
		this.setName(name);
	}

	/**
      * Метод {@code teachStudent}, осуществляет обучение студента математическому анализу.
      * первый: @param student - новый проект студент.
      * @return объект класса Course.
    */
	public Course teachStudent(Student student) {
		Course newCourse = new Course(this, student);
		return newCourse;
	}
}