package ru.job4j.inheritance;

/**
  *Class {@code Building} используется для описания свойств здания.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Building {

	/**
	  *Поле класса {@code Building} номер объекта постройки.
	*/
	private int number;

	/**
	  *Поле класса {@code Building} ширина здания.
	*/
	private double width;

	/**
	  *Поле класса {@code Building} высота здания.
	*/
	private double height;

	/**
	  *Поле класса {@code Building} длина здания.
	*/
	private double length;

	/**
      *Конструктор {@code Building} инициализирует поля объекта Здание.
	  * первый: @param width - ширина здания.
	  * второй: @param height - высота здания.
	  * третий: @param length - длина здания.
    */
	public Building(double width, double height, double length) {

			this.width = width;
			this.height = height;
			this.length = length;
	}

	/**
      * Метод {@code getNumber}, возвращает номер объекта.
      * @return возвращает номер объекта(здания).
    */
	public int getNumber() {
		return number;
	}

	/**
      * Метод {@code setNumber}, устанавливает номер объекта.
	  *@param number по средством параметра.
    */
	public void setNumber(int number) {
		this.number = number;
	}
}