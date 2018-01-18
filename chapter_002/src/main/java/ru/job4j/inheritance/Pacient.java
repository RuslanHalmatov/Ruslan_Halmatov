package ru.job4j.inheritance;

/**
  *Class {@code Pacient} используется для описания характеристик пациента.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Pacient extends Profession {

	/**
      *Конструктор {@code Pacient} инициализирует поле объекта пациент.
	  * первый: @param name - ФИО пациента,унаследовано от базового класса {@code Profession}.
    */
	public Pacient(String name) {
		this.setName(name);
	}
}