import java.io.*;





public class Match implements Serializable {
	private String team1;
	private String team2;
	private int score1;
	private int score2;

	public Match(String t1, String t2)
	{
		this.team1=t1;
		this.team2=t2;}


	public void team1_score()
	{
		score1++;
	}

	public void team2_score()
	{
		score2++;
	}

	public void print_score(){
		System.out.println("\nScore:");
		System.out.println(""+team1+"\t"+team2);
		System.out.println(" " +
				""+score1+"\t "+score2);}
}
