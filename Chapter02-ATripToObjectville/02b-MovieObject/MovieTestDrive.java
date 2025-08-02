class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movie");
	}


	void printDetails() {
		System.out.println("Title: " + title);
		System.out.println("Genre: " + genre);
		System.out.println("Rating: " + rating);
		System.out.println(); // line break for clarity
	}
}



public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;

		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		two.printDetails();
		
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
		
		Movie four = new Movie();
		four.title = "Supernatural";
		four.genre = "Scary but good = Scarily Good";
		four.rating = 100;
	}
}