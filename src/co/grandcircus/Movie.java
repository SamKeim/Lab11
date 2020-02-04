package co.grandcircus;

public class Movie {
	private String title;
	private String genre;
	
	public Movie(String movieTitle, String movieGenre) {
		title = movieTitle;
		genre = movieGenre;
	}
	public Movie() {
		this("Not Available", "");
	}
	public String toString() {
		return String.format("Movie[Title: %s; Genre: %s]\n", title, genre);
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	
}
