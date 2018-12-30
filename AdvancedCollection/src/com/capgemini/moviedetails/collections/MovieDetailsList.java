package com.capgemini.moviedetails.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieDetailsList {

	private static final int sortMovieByMovieName = 1;
	private static final int sortMovieByActorName = 2;
	private static final int sortByActressName = 3;
	private static final int sortByGenre = 4;

	List<MovieDetails> arrayList = new ArrayList<>();

	public void addMovie(MovieDetails Object) {
		arrayList.add(Object);

	}

	public boolean removeMovie(MovieDetails Object) {
		boolean removeMovie = arrayList.remove(Object);
		return removeMovie;
	}

	public boolean removeAllMovies() {
		arrayList.clear();
		return true;
	}

	public MovieDetails getMovieByMovieName(String movieName) {
		MovieDetails getMovieByMovieName = null;
		for (MovieDetails Object : arrayList) {
			if (Object.getMovieName().equalsIgnoreCase(movieName)) {
				getMovieByMovieName = Object;
			}
		}
		return getMovieByMovieName;
	}

	public MovieDetails getMovieByGenre(String genre) {
		MovieDetails getMovieByGenre = null;
		for (MovieDetails Object : arrayList) {
			if (Object.getGenre().equalsIgnoreCase(genre))
				getMovieByGenre = Object;
		}
		return getMovieByGenre;
	}

	public List<MovieDetails> sort(int choice) {
		switch (choice) {
		case sortMovieByMovieName:
			Collections.sort(arrayList, new Comparator<MovieDetails>() {
				@Override
				public int compare(MovieDetails movieOne, MovieDetails movieTwo) {
					return movieOne.getMovieName().compareTo(
							movieTwo.getMovieName());
				}
			});
			return arrayList;

		case sortMovieByActorName:
			Collections.sort(arrayList, new Comparator<MovieDetails>() {
				@Override
				public int compare(MovieDetails leadActorMovie1,
						MovieDetails leadActorMovie2) {
					return leadActorMovie1.getLeadActor().compareTo(
							leadActorMovie2.getLeadActor());
				}
			});
			return arrayList;

		case sortByActressName:
			Collections.sort(arrayList, new Comparator<MovieDetails>() {
				@Override
				public int compare(MovieDetails leadActressMovie1,
						MovieDetails leadActressMovie2) {
					return leadActressMovie1.getLeadActress().compareTo(
							leadActressMovie2.getLeadActress());
				}
			});
			return arrayList;

		case sortByGenre:
			Collections.sort(arrayList, new Comparator<MovieDetails>() {
				@Override
				public int compare(MovieDetails genreMovie1,
						MovieDetails genreMovie2) {
					return genreMovie1.getGenre().compareTo(
							genreMovie2.getGenre());
				}
			});
			return arrayList;

		default:
			return arrayList;
		}
	}

	@Override
	public String toString() {
		return "MovieDetailsList [arrayList=" + arrayList + "]";
	}

}