package ru.job4j.checked;

/**
  *Class {@code StringProcessing} используется для нахождения заданного слова в другом слове.
  *@author Halmatov.
  *@since 10.12.2017.
*/
public class StringProcessing {

  /**
    *Метод {@code contains} находит заданное слово в другом слове.
    * первый: @param origin - исходное слово и
    *второй: @param sub - слово для поиска параметр.
    *@return возвращает истину, если заданое слово есть, в противном случае ложь.
  */
  public boolean contains(String origin, String sub) {

		int subLength = sub.length();

		boolean flag = false;

		char[] originArray = origin.toCharArray();

		char[] subArray = sub.toCharArray();

		for (int i = 0; i < origin.length(); i++) {

			for (int j = i; j < sub.length() + i; j++) {

				if (originArray[j] != subArray[j - i]) {

					j = subLength + i;
				} else if (j - i == subLength - 1) {

					flag = true;
				}
			}

		}
		return flag;
  }

}