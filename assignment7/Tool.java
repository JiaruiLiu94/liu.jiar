package assignment7;


public class Tool {

	private int strength;

	private char type;

	

	Tool(){}

	

	Tool(int strength ,char type){

		this.strength = strength;

		this.type = type;

	}



	public char getType() {

		return this.type;

	}

	

	public int getStrength() {

		return this.strength;

	}

	

	public void setStrength(int strength) {

		this.strength = strength ;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub



	}

}



class Rock extends Tool{

	Rock(){};

	

	Rock(int strength){

		super(strength, 'r');

	}

	

	public boolean fight(Tool tool) {

		if(tool.getClass() == Paper.class) {

			return this.getStrength() > 2*tool.getStrength();

		}

		else if(tool.getClass() == Scissors.class) {

			return this.getStrength()*2 > tool.getStrength();

		}

		else

			return this.getStrength() > tool.getStrength();

	}



}



class Paper extends Tool{

	Paper(){};

	

	Paper(int strength){

		super(strength, 'p');

	}

	

	public boolean fight(Tool tool) {

		if(tool.getClass() == Scissors.class) {

			return this.getStrength() > 2*tool.getStrength();

		}

		else if(tool.getClass() == Rock.class) {

			return this.getStrength()*2 > tool.getStrength();

		}

		else

			return this.getStrength() > tool.getStrength();

	}

}



class Scissors extends Tool{

	Scissors(){};

	

	Scissors(int strength){

		super(strength, 's');

	}

	

	public boolean fight(Tool tool) {

		if(tool.getClass() == Rock.class) {

			return this.getStrength() > 2*tool.getStrength();

		}

		else if(tool.getClass() == Paper.class) {

			return this.getStrength()*2 > tool.getStrength();

		}

		else

			return this.getStrength() > tool.getStrength();

	}



}



class RockPaperScissorsGame{

    public static void main(String args[]){

        Scissors s = new Scissors(5);

        Paper p = new Paper(7);

        Rock r = new Rock(15);

        System.out.println(s.fight(p) + " , "+ p.fight(s) );

        System.out.println(p.fight(r) + " , "+ r.fight(p) );

        System.out.println(r.fight(s) + " , "+ s.fight(r) );

    }

}