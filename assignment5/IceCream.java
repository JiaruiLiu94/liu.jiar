package assignment;


class IceCream extends DessertItem {

  private int cost;


  public int getCost() {

    return cost;

  }


  IceCream(String name, int price){

    super(name);

    this.cost=price;

  }

}