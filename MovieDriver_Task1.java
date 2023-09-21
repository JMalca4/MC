import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //scanner for input from user
		
		Movie newMovie = new Movie();//create a movie object
		
		System.out.println("Enter the name of a movie");
		
		newMovie.setTitle(input.nextLine());//set the title as the input the user typed in
		
		System.out.println("Enter the rating of the movie");
		
		newMovie.setRating(input.nextLine());// set the rating
		
		System.out.println("Enter the number of tickets sold for this movie");
		
		newMovie.setSoldTickets(input.nextInt());//set the amount of tickets sold
		
		System.out.println(newMovie.toString()); // tostring method in order to print out the input from user
		
		System.out.println("Goodbye");
	}

}
