package ru.job4j.condition;

/**
  *Class {@code Point} описывает координаты точки в двумерной плоскости.
  *@author Halmatov.
  *@since 03.10.2017.
*/

public class Point {
   /**
     *Поле класса {@code Point} описывает координату X.
   */
   private int x;

   /**
     *Поле класса {@code Point} описывает координату Y.
   */
   private int y;

   /**
     *Конструктор класса {@code Point} задает начальные координаты точки.
	 *Координата @param x по оси абсцисс,
	 *координата @param y по оси ординат.
   */
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
     *Метод  {@code is} проверяет лежит ли заданная точка на графике функции a*x + b.
	 *1-параметр: @param a ,
	 *2-параметр @param b функции.
	 *@return возвращает истина,если точка лежит на графике функции и ложь в противном случае.
   */
   public boolean is(int a, int b) {
	 return this.y == a * this.x + b; // используя координаты точки и вычисления функции.
   }

  /**
     *Метод  {@code getX} @return возвращает  значение координаты X.
  */
   public int getX() {
	 return this.x;
   }
   /**
     *Метод  {@code getY} @return возвращает  значение координаты Y.
   */
   public int getY() {
	 return this.y;
   }
}