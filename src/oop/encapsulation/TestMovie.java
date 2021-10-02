package oop.encapsulation;

public class TestMovie {
	public static void main(String[] args) {
	
		Movie movie1 = new Movie();
		movie1.setTitle("avengers");
		movie1.setRating("G");
		System.out.println(movie1.getTitle());
		System.out.println(movie1.getRating());

	}

}
