


public class Team {
	private int gamesPlayed, points;
	
	public Team(){
		this.gamesPlayed = 0;
		this.points = 0;
		}
	public void win() {
		this.gamesPlayed++;
		this.points +=3;
		
	}
	
	public void lose() {
		this.gamesPlayed++;
		this.points +=0;
		
	}
	
	public void draw() {
		this.gamesPlayed++;
		this.points +=1;
		
	}
	
	public void reset() {
		this.gamesPlayed = 0;
		this.points = 0;
		
	}
	
	public int readPoints() {
		return points;
		
	}
	
	public int ReadGamesPlayed() {
		return gamesPlayed;
		
	}
	
	public void printDetails() {
		System.out.println("Team Details");
		System.out.println("========");
		System.out.println("Played: " + "Points: ");
		System.out.println(" "+ this.gamesPlayed+" "+this.points);
		System.out.println();
	}
	
	

}
