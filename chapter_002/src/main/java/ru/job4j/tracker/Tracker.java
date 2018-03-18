package ru.job4j.tracker;
import java.util.Random;

/**
  *Class {@code Tracker} хранит заявки пользователей.
  *@author Halmatov.
  *@since 11.03.2018.
*/
public class Tracker {
	/**
     * Массив для хранение заявок.
     */
	private Item[] items = new Item[100];
	/**
     * Позиция для добавления новой заявки в массиве.
     */
	private int position = 0;
	/**
     * объект генерации случайных чисел для задания {@code id} заявки.
     */
	private final Random random = new Random();
    /**
     * Метод реализующий добавление заявки в хранилище.
     * @param item новая заявка
	 * @return добавленную заявку Item.
     */
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}
	/**
     * Метод реализующий замену  заявки, на новую в хранилище.
     * первый: @param id заявки подлежащей замене
	 * второй: @param item на новую  заявку.
     */
	public void replace(String id, Item item) {
		int index = findIndexById(id);
		if (index != -1) {
			items[index] = item;
		}
	}
    /**
     * Метод реализующий поиск заявки по идентификационному номеру.
     * @param id заявки подлежащей поиску
	 * @return найденную заявку Item, в противном случае null.
     */
	public Item findById(String id) {
		Item result = null;
	   for (Item current:items) {
			if (current.getId().equals(id)) {
				result = current;
				break;
			}
	   }
	   return result;
	}
	/**
     * Метод реализующий удаление заявки по идентификационному номеру.
     * @param id заявки подлежащей удалению
     */
	public void delete(String id) {
		int index = findIndexById(id);
		if (index != -1) {
			System.arraycopy(items, index + 1, items, index, position - index - 1);
			position--;
		}
	}
	/**
     * Метод реализующий выгрузку всех доступных заявок.
	 * @return массив заявок Item[].
     */
	public Item[] findAll() {
		Item[] copiedArray = new Item[position];
		System.arraycopy(items, 0, copiedArray, 0, position);
		return copiedArray;
	}
    /**
     * Метод реализующий поиск заявки по ключу.
     * @param key ключ - наименование заявки
	 * @return массив заявок Item[], у которых ключ совпадает.
     */
	public Item[] findByName(String key) {
		int counter = 0;
		for (int i = 0; i < position; i++) {
			if (items[i].getName().equals(key)) {
				counter++;
			}
		}
		int foundItemsPosition = 0;
		Item[] foundItems = new Item[counter];
		for (int i = 0; i < position; i++) {
			if (items[i].getName().equals(key)) {
				foundItems[foundItemsPosition++] = items[i];
			}
		}
		return foundItems;
	}
    /**
     * Метод реализующий поиск индекса заявки по идентификационному номеру.
     * @param id  заявки для поиска индекса
	 * @return индекс типа int, первого совпадения, в противном случае null.
     */
	private int findIndexById(String id) {
		int index = -1;
		for (int i = 0; i < position; i++) {
			if (items[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		return index;
	}
    /**
     * Метод реализующий генерацию идентификационного номера для заявки.
	 * @return значение типа String, идентификационного номера заявки.
     */
	private String generateId() {
		return String.valueOf(random.nextInt(100));
	}

}