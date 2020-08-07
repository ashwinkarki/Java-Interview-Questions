import java.util.Random;

public class Dice {
    static int sidesOfDice = 6;
    int faceValue = 0;
    
  

    public int roll() {
        Random rand = new Random();
        this.faceValue = rand.nextInt(sidesOfDice) + 1;
        
        return this.faceValue;
       
    }

    public static void changeNumSidesOfDice(int newNumberOfSides) {
        Dice.sidesOfDice = newNumberOfSides;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + faceValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dice other = (Dice) obj;
		if (faceValue != other.faceValue)
			return false;
		return true;
	}
    
    
  
}
