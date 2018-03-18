package ru.job4j.tracker;
/**
  *Интерфейс {@code Input} используется операций ввода вывода.
  *@author Halmatov.
  *@since 18.03.2018.
*/
public interface Input {
	/**
     * Метод реализует вывод и ввод в консоль.
	 * @param request параметр  используется для вывода в консоль текста для взаимодействия с пользователем
	 * @return строку введенную пользователем.
     */
	String ask(String request);
}