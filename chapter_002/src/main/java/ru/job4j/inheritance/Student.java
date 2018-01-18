package ru.job4j.inheritance;

/**
  *Class {@code Student} используется для описания свойств и студента.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Student extends Profession {

	/**
	  *Поле класса {@code Student} наименование группы студента.
	*/
	private int group;

	/**
	  *Поле класса {@code Student} наименование курса студента.
	*/
	private int courseNumber;

	/**
      *Конструктор {@code Student} инициализирует поля объекта студент.
	  * первый: @param name - ФИО студента,унаследовано от базового класса {@code Profession}.
	  * второй: @param group - наименование группы студента.
	  * третий: @param courseNumber - наименование курса студента.
    */
	public Student(String name, int group, int courseNumber) {

		this.group = group;
		this.courseNumber = courseNumber;
		this.setName(name);
	}

	/**
      * Метод {@code getGroup}, возвращает значения поля group.
      * @return целочисленное значение поле group.
    */
	public int getGroup() {
		return group;
	}

	/**
      * Метод {@code getCourseNumber}, возвращает значения поля courseNumber.
      * @return целочисленное значение поле courseNumber.
    */
	public int getCourseNumber() {
		return courseNumber;
	}
}