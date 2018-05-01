package ru.job4j.tracker;

/**
  *Class {@code StartUI} используется для взаимодействия с пользователем.
  *@author Halmatov.
  *@since 11.03.2018.
*/
public class StartUI {
	/**
     * Константа меню для добавления новой заявки.
     */
	private static final String ADD 	 	 = "0";
	/**
     * Константа меню для показа всех заявок.
     */
	private static final String SHOWALL  	 = "1";
	/**
     * Константа меню для редактирования заявки.
     */
	private static final String EDITITEM 	 = "2";
	/**
     * Константа меню для редактирования заявки.
     */
	private static final String DELITEM  	 = "3";
	/**
     * Константа меню для поиска заявки по id.
     */
	private static final String FINDITEMID 	 = "4";
	/**
     * Константа меню для поиска заявки по id.
     */
	private static final String FINDITEMNAME = "5";
	/**
     * Константа меню для выхода из программы.
     */
	private static final String EXIT 		 = "6";
	/**
     * Объект для операций ввода и вывода.
     */
	private final Input input;
	/**
     * Объект содержащий заявки и методы их создания,доступа,удаления и модификации.
     */
	private final Tracker tracker;

	/**
     * Конструктор класса {@code StartUI}.
	 * @param input - объект операций ввода/вывода
	 * @param tracker - объект-хранилище заявок.
     */
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	/**
     * Метод {@code init} инициализирует программу.Выводит меню и обрабатывает действия пользователя.
     */
	public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
				this.showAllItems();
			} else if (EDITITEM.equals(answer)) {
				this.editItem();
			} else if (DELITEM.equals(answer)) {
				this.deleteItem();
			} else if (FINDITEMID.equals(answer)) {
				this.findItemById();
			} else if (FINDITEMNAME.equals(answer)) {
				this.findItemsByName();
			} else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
	/**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("id добавленной заявки : " + item.getId());
    }

	/**
     * Метод реализует вывод списка всех доступных заявок.
     */
    private void showAllItems() {
        System.out.println("------------ Все заявки в системе --------------");

        Item[] currentItems = this.tracker.findAll();
		int itemNumber		= 0;
		for (Item current:currentItems) {
			System.out.println((itemNumber + 1) + ") id заявки : " + current.getId() + "\n   наименование заявки : " + current.getName()
			+ "\n   описание заявки : " + current.getDescription());
			itemNumber++;
		}
    }

	/**
     * Метод реализует редактирование заявки по id.
     */
    private void editItem() {
        String id = this.input.ask("Введите id заявки :");
		System.out.println(id + "  hu-----------------------------------------");
		Item editedItem = this.tracker.findById(id);
		String answer = this.input.ask("Введите  0 - редактирование наименования\n 1 - редактирование описания\n 2 - редактировать оба параметра");
		if (answer.equals("0")) {
			editedItem.setName(this.input.ask("Введите наименование заявки :"));
		} else if (answer.equals("1")) {
			editedItem.setDescription(this.input.ask("Введите описание заявки :"));
		} else if (answer.equals("2")) {
			editedItem.setName(this.input.ask("Введите наименование :"));
			editedItem.setDescription(this.input.ask("Введите описание :"));
		}
		System.out.println("Отредактированная заявка --------------");
		System.out.println("id : " + editedItem.getId());
		System.out.println("наименование : " + editedItem.getName());
		System.out.println("описание : " + editedItem.getDescription());
    }

	/**
     * Метод реализует удаление заявки по id.
     */
    private void deleteItem() {
        String id = this.input.ask("Введите id заявки :");
		this.tracker.delete(id);
		System.out.println("заявка удалена");
    }

	/**
     * Метод реализует поиск заявки по id.
     */
    private void findItemById() {
        String id = this.input.ask("Введите id заявки :");
		Item currentItem = this.tracker.findById(id);
		System.out.println("id заявки : " + currentItem.getId() + " наименование заявки : " + currentItem.getName() + " описание заявки : "
		+ currentItem.getDescription());
    }

	/**
     * Метод реализует поиск заявки по наименованию.
     */
    private void findItemsByName() {
        String name = this.input.ask("Введите наименование заявки :");
		System.out.println("Заявки с указанным наименованием");
		Item[] foundItems = this.tracker.findByName(name);
		int itemNumber		= 0;
		for (Item current:foundItems) {
			System.out.println((itemNumber + 1) + ") id заявки : " + current.getId() + " наименование заявки : " + current.getName() + " описание заявки : "
			+ current.getDescription());
			itemNumber++;
		}
    }
	/**
     * Метод реализует вывод пунктов меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0 - Добавить заявку");
		System.out.println("1 - Показать все заявки");
		System.out.println("2 - Редактировать заявку");
		System.out.println("3 - Удалить заявку");
		System.out.println("4 - Найти заявку по id");
		System.out.println("5 - Найти заявку по наименованию");
		System.out.println("6 - Выйти из программы");
    }

    /**
     * Запускт программы.
     * @param args используется для передачи значений в программу.
     */
    public static void main(String[] args) {
     //   new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}