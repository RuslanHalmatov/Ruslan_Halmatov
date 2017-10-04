package ru.job4j.condition;

/**
  *Class {@code Triangle} описывает треугольники.
  *@author Halmatov
  *@since 04.10.2017.
 */
public class Triangle {
   /**
     *Поле описывает сторону {@code a}.
   */
   private Point a;

   /**
     *Поле описывает сторону {@code b}.
   */
   private Point b;

   /**
     *Поле описывает сторону {@code c}.
   */
   private Point c;


   /**
	 *Конструктор класса {@code Triangle}.
	 *1 - параметр @param a сторона a,
	 *2 - параметр @param b сторона b,
	 *3 - параметр @param c сторона c.
   */
   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

	/**
	* Метод должен вычислять расстояние между точками left и right.
	*
	* Для вычисления расстояния использовать формулу.
	* √(xb - xa)^2 + (yb - ya)^2
	*
	* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
	*
	* ^ - степень.
	*
	* @param left Точка слева
	* @param right Точка с права.
	* @return расстояние между точками left и right.
	*/
	public double distance(Point left, Point right) {
		return Math.sqrt(Math.pow((double) (left.getX() - right.getX()), 2.0) + Math.pow((double) (left.getY() - right.getY()), 2.0));
	}

		/**
	* Метод вычисления периметра по длинам сторон.
	*
	* Формула.
	*
	* (ab + ac + bc) / 2
	*
	* @param ab расстояние между точками a b
	* @param ac расстояние между точками a c
	* @param bc расстояние между точками b c
	* @return Перимент.
	*/
	public double period(double ab, double ac, double bc) {
		return (ab + ac + bc) / 2;
	}

		/**
	* Метод должен вычислить прощадь треугольканива.
	*
	* Формула.
	*
	* √ p *(p - ab) * (p - ac) * (p - bc)
	*
	* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
	*
	* @return Вернуть прощадь, если треугольник существует или -1.
	*/
	public double area() {
		double rsl = -1;
		double ab = this.distance(this.a, this.b);
		double ac = this.distance(this.a, this.c);
		double bc = this.distance(this.b, this.c);
		double p = this.period(ab, ac, bc);
		if (this.exist(ab, ac, bc)) {
			rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		}
		return rsl;
	}

		/**
	* Метод проверяет можно ли построить треугольник с такими длинами сторон.
	*
	* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
	*
	* @param ab Длина от точки a b.
	* @param ac Длина от точки a c.
	* @param bc Длина от точки b c.
	* @return истина если сумма любых 2х сторон больше 3, иначе ложь.
	*/
	private boolean exist(double ab, double ac, double bc) {
	   double max = (ab > ac) ? ab : ac;
	   double sum = ab + ac + bc;
	   max = (max > bc) ? max : bc;
	   return max < sum - max;
	}

}