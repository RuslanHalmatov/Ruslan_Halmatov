package ru.job4j.inheritance;

/**
  *Class {@code Doctor} используется для описания свойств и поведения Доктора.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Doctor extends Profession {

	/**
	  *Поле класса {@code Doctor} хранит наименование специализации доктора.
	*/
	private String specialization;

	/**
	  *Поле класса {@code Doctor} хранит опыт работы в годах.
	*/
	private int experience;

	/**
	  *Поле класса {@code Doctor} наименование ученой степени доктора.
	*/
	private String academicDegree;

	/**
      *Конструктор {@code Doctor} инициализирует поля объекта Доктор.
	  * первый: @param name - ФИО доктора,унаследовано от базового класса {@code Profession} и
      * второй: @param specialization - наименование специализации доктора.
	  * третий: @param experience - опыт работы в годах.
	  * четвертый: @param academicDegree - ученая степень доктора.
    */
	public Doctor(String name, String specialization, int experience, String academicDegree) {

		this.setName(name);
		this.specialization = specialization;
		this.experience = experience;
		this.academicDegree = academicDegree;
	}

	/**
      * Метод {@code heal}, который осуществляет лечение больного.
      * первый: @param pacient - объект пациент.
      * @return возвращает объект Diagnose.
    */
	public Diagnose heal(Pacient pacient) {
		Diagnose newDiagnose = new Diagnose(this, pacient);
		return newDiagnose;
	}

	/**
      * Метод {@code getSpecialization}, возвращает значение поля  specialization.
	  * @return возвращает значение поля  specialization.
    */
	public String getSpecialization() {
		return specialization;
	}

	/**
      * Метод {@code getExperience}, возвращает значение поля  experience.
	  * @return возвращает значение поля  experience.
    */
	public int getExperience() {
		return experience;
	}

	/**
      * Метод {@code getAcademicDegree}, возвращает значение поля  academicDegree.
	  * @return возвращает значение поля  academicDegree.
    */
	public String getAcademicDegree() {
		return academicDegree;
	}


}