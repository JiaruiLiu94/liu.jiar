package a;
import java.util.*;




public class Mreview implements Comparable<Mreview>

{

	

	private String title;   

	private static ArrayList<Integer> ratings; 

	public Mreview() {

		title = "";

		ratings = new ArrayList<>();

	}

	public Mreview(String ttl) {

		title = ttl;

		ratings = new ArrayList<>();

	}

	public Mreview(String ttl, int firstRating) {

		title = ttl;

		ratings = new ArrayList<>(firstRating);

	}



	public static void addRating(int r) {

		ratings.add(r);

	}

	public double aveRating() {

		double ave = 0.0;

		for(Integer integer : ratings) ave += integer;

		return ave / ratings.size();

	}



  	public int compareTo(Mreview obj) {

  		return this.title.compareTo(obj.title);

  	}

	public boolean equals(Object obj) {

		if(this.title.equals(obj)) obj = new Mreview();

		return this.title.equals(obj);

	}

	public String getTitle() {

		return title;

	}

	public int numRatings() {

		return ratings.size();

	}

	public String toString() {

		return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings";

	}


	



	public static void main(String[] args) {

		Mreview mreview = new Mreview("Kill Bill");

		addRating(3);

		addRating(4);

		addRating(5);

		System.out.println(mreview.toString());

		System.out.println(mreview.aveRating());	
		

	}
  

  

}