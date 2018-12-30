package com.capgemini.moviedetails.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.moviedetails.collections.MovieDetails;
import com.capgemini.moviedetails.collections.MovieDetailsList;

public class MovieDetailsTest {

	private MovieDetails movie1;
	private MovieDetails movie2;
	private MovieDetails movie3;
	private MovieDetails movie4;

	private MovieDetailsList movieDetailsList;

	@Before
	public void setUp() {
		movie1 = new MovieDetails("3 Idiots", "Amir Khan", "Karina Kapoor",
				"Drama");
		movie2 = new MovieDetails("Titanic", "Leonardo", "Kate", "Romantic");
		movie3 = new MovieDetails("Stree", "RajKumar", "Shraddha", "Horror");
		movie4 = new MovieDetails("Rocky", "John", "Esha", "Action");

		movieDetailsList = new MovieDetailsList();

	}

	@Before
	public void addMovie() {
		movieDetailsList.addMovie(movie1);
		movieDetailsList.addMovie(movie2);
		movieDetailsList.addMovie(movie3);
		movieDetailsList.addMovie(movie4);

	}

	@Test
	public void testToCheckAddMovies() {
		String actual = movieDetailsList.toString();
		String expected = "MovieDetailsList [arrayList=[MovieDetails [movieName=3 Idiots, leadActor=Amir Khan, leadActress=Karina Kapoor, genre=Drama], MovieDetails [movieName=Titanic, leadActor=Leonardo, leadActress=Kate, genre=Romantic], MovieDetails [movieName=Stree, leadActor=RajKumar, leadActress=Shraddha, genre=Horror], MovieDetails [movieName=Rocky, leadActor=John, leadActress=Esha, genre=Action]]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForRemoveMovie() {

		boolean actual = movieDetailsList.removeMovie(movie1);
		boolean expected = true;
		assertEquals(expected, actual);

	}

	@Test
	public void testForRemoveAllMovies() {
		boolean actual = movieDetailsList.removeAllMovies();
		boolean expected = true;
		assertEquals(expected, actual);

	}

	@Test
	public void testForSearchMovieByName() {

		MovieDetails movie = movieDetailsList.getMovieByMovieName("Titanic");
		String actual = movie.toString();
		String expected = "MovieDetails [movieName=Titanic, leadActor=Leonardo, leadActress=Kate, genre=Romantic]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForSearchMovieByActorName() {

		MovieDetails movie = movieDetailsList.getMovieByGenre("Action");
		String actual = movie.toString();
		String expected = "MovieDetails [movieName=Rocky, leadActor=John, leadActress=Esha, genre=Action]";
		assertEquals(expected, actual);

	}

	@Test
	public void sortMovieByMovieName() {

		String actual = movieDetailsList.sort(1).toString();
		String expected = "[MovieDetails [movieName=3 Idiots, leadActor=Amir Khan, leadActress=Karina Kapoor, genre=Drama],"
				+ " MovieDetails [movieName=Rocky, leadActor=John, leadActress=Esha, genre=Action], "
				+ "MovieDetails [movieName=Stree, leadActor=RajKumar, leadActress=Shraddha, genre=Horror],"
				+ " MovieDetails [movieName=Titanic, leadActor=Leonardo, leadActress=Kate, genre=Romantic]]";
		assertEquals(expected, actual);

	}

	@Test
	public void sortMovieByMovieActorName() {

		String actual = movieDetailsList.sort(2).toString();
		String expected = "[MovieDetails [movieName=3 Idiots, leadActor=Amir Khan, leadActress=Karina Kapoor, genre=Drama], "
				+ "MovieDetails [movieName=Rocky, leadActor=John, leadActress=Esha, genre=Action], "
				+ "MovieDetails [movieName=Titanic, leadActor=Leonardo, leadActress=Kate, genre=Romantic], "
				+ "MovieDetails [movieName=Stree, leadActor=RajKumar, leadActress=Shraddha, genre=Horror]]";
		assertEquals(expected, actual);

	}

	@Test
	public void sortMovieByMovieActressName() {

		String actual = movieDetailsList.sort(3).toString();
		String expected = "[MovieDetails [movieName=Rocky, leadActor=John, leadActress=Esha, genre=Action],"
				+ " MovieDetails [movieName=3 Idiots, leadActor=Amir Khan, leadActress=Karina Kapoor, genre=Drama],"
				+ " MovieDetails [movieName=Titanic, leadActor=Leonardo, leadActress=Kate, genre=Romantic],"
				+ " MovieDetails [movieName=Stree, leadActor=RajKumar, leadActress=Shraddha, genre=Horror]]";
		assertEquals(expected, actual);

	}

	@Test
	public void sortMovieByMovieGenre() {

		String actual = movieDetailsList.sort(4).toString();
		String expected = "[MovieDetails [movieName=Rocky, leadActor=John, leadActress=Esha, genre=Action], "
				+ "MovieDetails [movieName=3 Idiots, leadActor=Amir Khan, leadActress=Karina Kapoor, genre=Drama], "
				+ "MovieDetails [movieName=Stree, leadActor=RajKumar, leadActress=Shraddha, genre=Horror], "
				+ "MovieDetails [movieName=Titanic, leadActor=Leonardo, leadActress=Kate, genre=Romantic]]";
		assertEquals(expected, actual);

	}
}
