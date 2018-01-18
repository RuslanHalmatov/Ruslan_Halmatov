package ru.job4j.inheritance;

/**
  *Class {@code Profession} используется для общих для всех профессионалов свойств и поведений.
  *@author Halmatov.
  *@since 10.12.2017.
*/

public class Processing {

	/**
	  *Поле класса {@code Processing} хранит строку, для описания процесса работы профессионала.
	*/
	private String action;

	/**
      * Метод {@code getAction}, возвращает значения поля action.
      * @return строковое поле action.
    */
	public String getAction() {
		return action;
	}

	/**
      * Метод {@code setAction}, устанавливает значение  @param action в поле action.
    */
	public void setName(String action) {
		this.action = action;
	}
}