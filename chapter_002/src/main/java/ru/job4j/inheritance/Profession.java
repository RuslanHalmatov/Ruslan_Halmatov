package ru.job4j.inheritance;

/**
  *Class {@code Profession} используется для общих для всех профессионалов свойств и поведений.
  *@author Halmatov.
  *@since 10.12.2017.
*/

public class Profession {

	/**
	  * Поле класса {@code Profession} ФИО профессионала.
	*/
	private String name;

	/**
      * Метод {@code getName}, возвращает значения поля name.
      * @return строковое поле name.
    */
	public String getName() {
		return name;
	}

	/**
      * Метод {@code setName}, устанавливает значение  @param name в поле name.
    */
	public void setName(String name) {
		this.name = name;
	}
}