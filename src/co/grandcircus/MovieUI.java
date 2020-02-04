package co.grandcircus;

import java.util.ArrayList;
import java.util.Collections;

public class MovieUI {
	public static ArrayList<Movie> fillMovieList(ArrayList<Movie> movies) {
		for (int i = 1; i < 101; i++) {
			Movie temp = MovieIO.getMovie(i);
			movies.add(temp);
		}
//		Collections.sort(movies);
		return movies;
	}
	
	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		movies = fillMovieList(movies);
		for (Movie temp : movies) {
			System.out.println(temp);
		}
	}
	
}
