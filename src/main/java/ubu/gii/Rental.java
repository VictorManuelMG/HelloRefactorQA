package ubu.gii;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5.
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	double getCharge(double aRental) {
		aRental = 0;
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			aRental += 2;
			if (getDaysRented() > 2)
				aRental += (getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			aRental += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			aRental += 1.5;
			if (getDaysRented() > 3)
				aRental += (getDaysRented() - 3) * 1.5;
			break;
		}
		return aRental;
	}

}
