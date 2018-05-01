package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
  *Class {@code StartUITest} используется для текстирование программы Tracker.
  *@author Halmatov.
  *@since 01.04.2018.
*/
public class StartUITest {
	/**
	* Метод {@code whenUserAddItemThenTrackerHasNewItemWithSameName } используется для тестирования метода add класса StartUI.
	*
	*/
    	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
	   Tracker tracker = new Tracker();     // создаём Tracker
	   Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
	   new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
	   assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
	}
	/**
	* Метод {@code whenUpdateThenTrackerHasUpdatedValue } используется для тестирования метода editItem класса StartUI.
	*
	*/
	 @Test
	 public void whenUpdateThenTrackerHasUpdatedValue() {
	    // создаём Tracker
	    Tracker tracker = new Tracker();
	    //Напрямую добавляем заявку
	    Item item = tracker.add(new Item());
	    //создаём StubInput с последовательностью действий
	    Input input = new StubInput(new String[]{"1", item.getId(), "2", "test name", "desc", "6"});
	    // создаём StartUI и вызываем метод init()
	    new StartUI(input, tracker).init();
	    System.out.println(tracker.findById(item.getId()).getName());
	    // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
	    assertThat(tracker.findById(item.getId()).getName(), is("test name"));
	 }
}