package assignment;

public abstract class DessertItem {
	protected String name;



	  public DessertItem() {

	  }


	  public DessertItem(String name) {

	    if(name.length()<=DessertShoppe.ITEM_NAME_MAX_SIZE) this.name = name;

	    else throw new IllegalArgumentException("Name exceeds "+DessertShoppe.ITEM_NAME_MAX_SIZE+". Try to use a shorter name.");

	  }



	  public String toString() {

	    StringBuilder builder=new StringBuilder();

	    int pad=DessertShoppe.PRINT_WIDTH-name.length();

	    builder.append(name);

	    builder.append(String.format("%"+pad+"s", DessertShoppe.cents2dollars(getCost())));

	    return builder.toString();

	  }


	  public final String getName(){

	    return this.name;

	  }


	  public abstract int getCost();



	}