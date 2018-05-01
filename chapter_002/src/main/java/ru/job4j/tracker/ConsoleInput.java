package ru.job4j.tracker;
import java.util.Scanner;
/**
  *Class {@code ConsoleInput} используется операций ввода вывода.
  *@author Halmatov.
  *@since 18.03.2018.
*/
public class ConsoleInput implements Input {
	/**
	* Объект для операций ввода.
	*/
	private Scanner sc = new Scanner(System.in);
	/**
	* Метод реализует вывод и ввод в консоль.
	* @param request параметр  используется для вывода в консоль текста для взаимодействия с пользователем
	* @return строку введенную пользователем.
	*/
	public String ask(String request) {
		System.out.println(request);
		return sc.nextLine();
	}
}