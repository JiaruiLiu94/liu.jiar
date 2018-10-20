package assignment;

class Sundae extends IceCream {

	  private String sundaeName;

	  private int topping;


	  public int getCost() {

	    return super.getCost()+topping;

	  }

	  

	  Sundae(String icecream, int cost, String sundae, int topCost){

	    super(icecream, cost);

	    this.sundaeName=sundae;

	    this.topping=topCost;

	  }

	  public String toString(){

	    return sundaeName+" Sundae with\n" + super.toString();

	  }



	}
