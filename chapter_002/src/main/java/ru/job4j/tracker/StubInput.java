package ru.job4j.tracker;
/**
  *Class {@code StubInput} используется автоматических операций ввода вывода.
  *@author Halmatov.
  *@since 01.04.2018.
*/
public class StubInput implements Input {
	/**
	* Поле {@code answers} хранит набор автоматических ответов.
	*/
	private String[] answers;
	/**
	* Поле {@code position} номер текущего ответа.
	*/
	private int position = 0;

	/**
	* Конструктор класса {@code StubInput}.
	* @param answers - набор автоматических ответов.
	*/
	public StubInput(String[] answers) {
		this.answers = answers;
	}
	/**
	* Метод реализует автоматический ввод ответов вместо пользователя.
	* @param question параметр  используется для взаимодействия программы с программой автотестирования.
	* @return строку ответ на вопрос программы.
	*/
	public String ask(String question) {
		System.out.println(answers[0] + "asd----------------------");
		return answers[position++];
	}
}