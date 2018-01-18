package ru.job4j.inheritance;

/**
  *Class {@code ProjectDocumentation} используется для описания свойств проектной документации.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class ProjectDocumentation extends Processing {

	/**
      *Конструктор {@code ProjectDocumentation} инициализирует поля объекта проектная документация.
	  * первый: @param engineer - инженер, разрабатывающий проектную документацию.
	  * второй: @param newProject - здание, для которого разрабатывается проектная документация.
    */
	public ProjectDocumentation(Engineer engineer, Building newProject) {

		setName("Инженер " + engineer.getName() + " разработал проектную документацию для здания под номером " + newProject.getNumber());
	}
}