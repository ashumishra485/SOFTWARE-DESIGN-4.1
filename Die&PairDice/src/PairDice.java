import java.io.Serializable;

class PairDice implements Serializable{
	private Die d1;
	private Die d2;

	

	public PairDice(int v1, int v2) {
		d1=new Die(v1);
		d2=new Die(v2);
		
	}

	public void rollDice() {
		d1.roll();
		d2.roll();
		
	}

	public int readValue1() {
		// TODO Auto-generated method stub
		return d1.getValue();
	}

	public int readValue2() {
		// TODO Auto-generated method stub
		return d2.getValue();
	}

	public int sumDiceValues() {
		// TODO Auto-generated method stub
		return d1.getValue() + d2.getValue();
	}

	public boolean valuesEqual() {
		// TODO Auto-generated method stub
		if(d1.getValue()==d2.getValue())
			return true;
		else
		return false;
	}

}

