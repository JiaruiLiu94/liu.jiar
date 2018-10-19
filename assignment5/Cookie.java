package assignment;

class Cookie extends DessertItem{

	  private int number;

	  private int pricePerDozen;


	  public int getCost(){

	    return (int) (1.0*number*pricePerDozen/12 + 0.5);

	  }

	  

	  Cookie(){};

	  

	  Cookie(String name, int n, int price){

	    super(name);

	    this.number=n;

	    this.pricePerDozen=price;

	  }


	  public String toString(){

	    StringBuilder builder=new StringBuilder();

	    builder.append(number+ " @ "+pricePerDozen+" /dz.\n");

	    builder.append(super.toString());

	    return builder.toString();

	  }

	}