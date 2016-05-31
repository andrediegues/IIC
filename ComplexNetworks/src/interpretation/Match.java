package interpretation;

public class Match { 
	Team home;
	Team away;
	Season season;
	MatchScore score;
	MatchDate date;
	Player[] homePositionsToPlayer;
	Player[] awayPositionsToPlayer;
	int[][] homeAdjacencyMatrix;
	int[][] awayAdjacencyMatrix;
	//static int numberOfMatches = 0;
	
	public Match(Team h, Team a, MatchScore score, MatchDate d, Player[] hptp, Player[] aptp, int[][] ham, int[][] aam){
		home = h;
		away = a;
		this.score = score;
		date = d;
		homePositionsToPlayer = hptp;
		awayPositionsToPlayer = aptp;
		homeAdjacencyMatrix = ham;
		awayAdjacencyMatrix = aam;
		//numberOfMatches++;
	}
	
	public String toString(){
		return date + "\n" + home + " vs " + away + " -> " + score.homeScore + "-" + score.awayScore + "\n";
	}
}

class MatchDate {
	String weekday;
	int day;
	String month;
	int year;
	 
	MatchDate(String wd, int d, String m, int y){
		weekday = wd;
		day = d;
		month = m;
		year = y;
	}
}

class MatchScore {
	int homeScore;
	int awayScore;
	
	MatchScore(int h, int a){
		homeScore = h;
		awayScore = a;
	}	
}

