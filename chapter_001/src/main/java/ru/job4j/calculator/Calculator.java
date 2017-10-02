/**
* Package for calculate task.
*
* @author Ruslan Halmatov (mailto:HalmatovJava@yandex.ru).
* @version $Id$.
* @since 25.09.2017.
*/
package ru.job4j.calculator;
/**
  *Объект класса {@code Calculator} имитирует калькулятор с базовыми функциями.
  *умножения,деления,суммы и вычитания.
*/
public class Calculator {
	/**
	  *Поле класса {@code Calculator} хранит результат вычисления
	  *арифметических операций.
	*/
    private double result;

	/**
	  *Метод {@code add} класса {@code Calculator} складывает.
	  *значения параметров @param first и
	  *@param second и возвращает результат в поле {@code result}.
	*/
    public void add(double first, double second) {
        this.result = first + second;
    }

	/**
	  *Метод {@code subtract} вычитает значение.
	  *@param second второго параметра  из первого
	  *@param first
	  *и возвращает результат в поле result.
	  *
	*/
	public void subtract(double first, double second) {
        this.result = first - second;
    }
	/**
	  *Метод {@code div} делит значение.
	  *первого параметра @param first на значение
	  *второго параметра @param second и записывает результат
	  *в поле объекта {@code result}.
	*/
	public void div(double first, double second) {
        this.result = first / second;
    }
	/**
	  *Метод {@code multiple} умножает значение.
	  *первого параметра @param first на значение
	  *второго @param second и возвращает результат
	  *в поле {@code result}.
	*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }
	/**
	  *Метод {@code getResult} возвращает значение.
	  *поле @return result.
	*/
    public double getResult() {
        return this.result;
    }
}