package co.grandcircus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MovieUI {
	public static ArrayList<Movie> fillMovieList() {
		ArrayList<Movie> temp = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			temp.add(MovieIO.getMovie(i));
		}
		
		return temp;
	}

	public static TreeMap<Integer, String> getGenreList() {
		TreeMap<Integer, String> genreList = new TreeMap<>();
		genreList.put(1, "Animated");
		genreList.put(2, "Comedy");
		genreList.put(3, "Drama");
		genreList.put(4, "Horror");
		genreList.put(5, "Musical");
		genreList.put(6, "SciFi");
		Set<Integer> listOKeys = genreList.keySet();
		System.out.printf("%3sGenre List\n", "");
		for (Integer key : listOKeys) {
			System.out.printf("%5s | %-30s\n", key, genreList.get(key));
		}
		return genreList;
	}

	public static boolean validator(Scanner scnr) {
		String userChoice = "";
		while (true) {
			userChoice = scnr.nextLine();
			if (userChoice.toUpperCase().startsWith("Y")) {
				return true;
			} else if (userChoice.toUpperCase().startsWith("N")) {
				return false;
			} else {
				System.out.println("Please enter Y or N.");
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		TreeMap<Integer, String> genreList = getGenreList();
		boolean userInput = false;
		Scanner scnr = new Scanner(System.in);

		movies = fillMovieList();
		System.out.println("Welcome to BlockBuster.");
		do {
			System.out.println("Please enter a genre.");
			String genre = genreList.get(scnr.nextInt());
			scnr.nextLine();
			for (Movie movie : movies) {
				if (movie.getGenre().equalsIgnoreCase(genre)) {
					System.out.printf("%s\n", movie.getTitle());
				}
			}
			System.out.println("Would you like to browse again? (Y/N)");
			userInput = validator(scnr);
		} while (userInput);
		System.out.println("Thank you for visiting BlockBuster!");
	}
}