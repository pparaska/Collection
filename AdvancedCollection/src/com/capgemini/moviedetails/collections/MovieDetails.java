package com.capgemini.moviedetails.collections;

/**
 * 
 * @author Poonam Paraskar 2) Create class Movie_Details with field’s mov_Name,
 *         lead_actor, lead_actress, and genre add setter and getter method in
 *         that class. a. After creating this class create class
 *         Movie_DetailsList class who will maintain all the objects. b.
 *         Movie_DetailsList class should have method add_movie(),
 *         remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(),
 *         find_movie_By_Genre() c. Movie_DetailsList should have method which
 *         will take an argument that will be use to determine on which to sort
 */

public class MovieDetails {

	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;

	public MovieDetails(String movieName, String leadActor, String leadActress,
			String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}
}
