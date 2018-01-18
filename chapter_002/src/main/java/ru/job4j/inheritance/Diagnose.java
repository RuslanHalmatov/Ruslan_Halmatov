package ru.job4j.inheritance;

/**
  *Class {@code Diagnose} используется для описания свойств диагноза пациента.
  *@author Halmatov.
  *@since 15.01.2018.
*/

public class Diagnose extends Processing {

	/**
      *Конструктор {@code Diagnose} инициализирует поля объекта диагноз.
	  * первый: @param doctor - доктор, который лечит пациента.
	  * второй: @param pacient - пациент, который проходит курс лечения.
    */
	public Diagnose(Doctor doctor, Pacient pacient) {

		setName(doctor.getSpecialization() + " " + doctor.getName() + " с " + doctor.getExperience() + " летним стажем и "
		+ doctor.getAcademicDegree() + " лечит пациента " + pacient.getName() + " а(у)");
	}
}