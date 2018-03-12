package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
  *Class {@code TrackerTest} тестирование объектов классов Tracker и Item.
  *@author Halmatov.
  *@since 11.03.2018.
*/
public class TrackerTest {

   /**
    * Метод {@code whenAddNewItemThenTrackerHasSameItem } используется для тестирования метода add класса Tracker.
    *
	*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		 Tracker tracker = new Tracker();
		 Item item = new Item("test1", "testDescription", "123L");
		 tracker.add(item);
		 assertThat(tracker.findAll()[0], is(item));
	}

   /**
    * Метод {@code whenReplaceNameThenReturnNewName } используется для тестирования метода replace класса Tracker.
    *
	*/
	@Test
	public void whenReplaceNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDescription", "123L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(previous);
		// Создаем новую заявку.
		Item next = new Item("test2", "testDescription2", "1234L");
		// Проставляем старый id из previous, который был сгенерирован выше.
		next.setId(previous.getId());
		// Обновляем заявку в трекере.
		tracker.replace(previous.getId(), next);
		// Проверяем, что заявка с таким id имеет новые имя test2.
		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}

   /**
    * Метод {@code whenDeleteItemThenReturnNewArray } используется для тестирования метода delete класса Tracker.
    *
	*/
	@Test
	public void whenDeleteItemThenReturnNewArray() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1", "testDescription", "123L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(first);
		// Создаем новую заявку.
		Item second = new Item("test2", "testDescription2", "1234L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(second);
		// Удаляем первую заявку в трекере.
		tracker.delete(first.getId());
		// Проверяем.
		assertThat(tracker.findAll()[0], is(second));
	}

   /**
    * Метод {@code whenFindAllThenReturnItemArray } используется для тестирования метода findAll класса Tracker.
    *
	*/
	@Test
	public void whenFindAllThenReturnItemArray() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1", "testDescription", "123L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(first);
		// Создаем новую заявку.
		Item second = new Item("test2", "testDescription2", "1234L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(second);
		// Проверяем.
		assertThat(tracker.findAll()[0], is(first));
		assertThat(tracker.findAll()[1], is(second));
	}

   /**
    * Метод {@code whenFindByNameThenReturnItem } используется для тестирования метода findByName класса Tracker.
    *
	*/
	@Test
	public void whenFindByNameThenReturnItem() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1", "testDescription", "123L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(first);
		// Создаем новую заявку.
		Item second = new Item("test2", "testDescription2", "1234L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(second);
		// Проверяем.
		assertThat(tracker.findByName("test2")[0], is(second));
	}

   /**
    * Метод {@code whenFindByIdThenReturnItem } используется для тестирования метода findById класса Tracker.
    *
	*/
	@Test
	public void whenFindByIdThenReturnItem() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1", "testDescription", "123L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(first);
		// Создаем новую заявку.
		Item second = new Item("test2", "testDescription2", "1234L");
		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(second);
		// Проверяем.
		assertThat(tracker.findById(second.getId()), is(second));
	}
}