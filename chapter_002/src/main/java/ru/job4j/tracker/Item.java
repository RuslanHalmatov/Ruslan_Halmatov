package ru.job4j.tracker;


/**
  *Class {@code Item} заявка пользователя.
  *@author Halmatov.
  *@since 11.03.2018.
*/
public class Item {
	/**
     * Идентификационный номер заявки.
     */
	private String id;
	/**
     * Наименование	 заявки.
     */
	private String name;
	/**
     * Описание	 заявки.
     */
	private String description;
	/**
     * Конструктор класса {@code Item}.
	 * @param name - наименование заявки
	 * @param description - описание заявки
	 * @param id - идентификационный номер заявки.
     */
	public Item(String name, String description, String id) {
		setId(id);
		setName(name);
		setDescription(description);
	}
	/**
     * Метод реализующий возврат значения Description заявки.
	 * @return описание заявки типа String.
     */
	public String getDescription() {
		return description;
	}
	/**
     * Метод реализующий возврат значения id заявки.
	 * @return идентификационный номер заявки типа String.
     */
	public String getId() {
		return id;
	}
	/**
     * Метод реализующий добавления описания заявки.
     * @param description - описание заявки.
     */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
     * Метод реализующий установку идентификационного номера заявки.
     * @param id заявки.
     */
	public void setId(String id) {
		this.id = id;
	}
	/**
     * Метод реализующий возврат значения name заявки.
	 * @return наименование заявки типа String.
     */
	public String getName() {
		return name;
	}
	/**
     * Метод реализующий установку наименования	 заявки.
     * @param name заявки.
     */
	public void setName(String name) {
		this.name = name;
	}
}