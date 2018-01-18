package ru.job4j.inheritance;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
  *Class {@code InheritanceTest} используется для тестирования реализации поведений объектов профессий.
  *@author Halmatov.
  *@since 16.01.2018.
*/
public class InheritanceTest {

  /**
    *Метод {@code checkProfession } используется для тестирования реализации поведений объектов профессий.
    *
  */
  @Test
  public void checkProfession() {
        Teacher teacher = new Teacher("Владимир", "кандидат физико-математических наук");
		Student student = new Student("Дмитрий", 4331, 3);
		Course course = teacher.teachStudent(student);
		String result = course.getAction();
		String expected = "Преподаватель " + "Владимир" + " прочитал курс математического анализа студенту группы " + "4331" + " " + "Дмитрий";
        assertThat(result, is(expected));
		Doctor doctor = new Doctor("Олег", "Невролог", 10, "без ученой степени");
		Pacient pacient = new Pacient("Светлана");
		Diagnose diagnose = doctor.heal(pacient);
		result = diagnose.getAction();
		expected = "Невролог" + " " + "Олег" + " с " + "10" +  " летним стажем и "
		+ "без ученой степени" + " лечит пациента " + "Светлана" + " а(у)";
		assertThat(result, is(expected));
		Engineer engineer = new Engineer("Игорь", "инженер-строитель", 20);
		Building building = new Building(10, 10, 10);
		ProjectDocumentation projectDocumentation = engineer.developeDocumentation(building);
		result = projectDocumentation.getAction();
		expected = "Инженер " + "Игорь" + " разработал проектную документацию для здания под номером " + "1";
		assertThat(result, is(expected));
  }

}

