package assignment;

public class Candy extends DessertItem {

	  private double weight;

	  private int pricePerPound;

	  public int getCost(){

	    return (int) (weight*pricePerPound+0.5);

	  }

	  

	  Candy(){} 

	  Candy(String name, double weight, int price){

	    super(name);

	    this.pricePerPound=price;

	    this.weight=weight;

	  }


	  public String toString(){

	    StringBuilder builder=new StringBuilder();

	    builder.append(weight+" lbs. @ "+pricePerPound+ " /lb.\n");

	    builder.append(super.toString());

	    

	    return builder.toString();

	  }

	}