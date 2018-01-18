package ru.job4j.inheritance;
/**
  *Class {@code Engineer} используется для описания свойств и поведения Инженера.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Engineer extends Profession {

	/**
	  *Поле класса {@code Engineer} хранит наименование специализации инженера.
	*/
	private String specialization;

	/**
	  *Поле класса {@code Engineer} хранит опыт работы в годах.
	*/
	private int experience;

	/**
	  *Поле класса {@code Engineer} хранит массив объектов законченных инженером.
	*/
	private Building[] completedProjects;

	/**
	  *Поле класса {@code Engineer} хранит номер текущего проекта.
	*/
	private int numberCurrentProject = 0;

	/**
      *Конструктор {@code Engineer} инициализирует поля объекта Инженер.
	  * первый: @param name - ФИО инженера,унаследовано от базового класса {@code Profession} и
      * второй: @param specialization - наименование специализации инженера.
	  * третий: @param experience - опыт работы в годах.
    */
	public Engineer(String name, String specialization, int experience) {

		this.specialization = specialization;
		this.experience = experience;
		this.completedProjects = new Building[50];
		this.setName(name);
	}

	/**
      * Метод {@code DevelopeDocumentation}, который разрабатывает проектную документацию.
      * первый: @param newProject - новый проект здания.
      * @return возвращает объект проектная документация.
    */
	public ProjectDocumentation developeDocumentation(Building newProject) {
		this.completedProjects[numberCurrentProject++] = newProject;
		newProject.setNumber(numberCurrentProject);
		ProjectDocumentation completedProject = new ProjectDocumentation(this, newProject);
		return completedProject;
	}
}