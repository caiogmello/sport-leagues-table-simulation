import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    int games = 0;
    private String leagueName;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println("The team " + team.getTeamName() + " is already in the league");
            return false;
        } else {
            System.out.println("Team " + team.getTeamName() + " added to the league");
            teams.add(team);
            return true;
        }

    }

    public void showLeagueTable() {
        Collections.sort(teams);
        int i = 0;
        System.out.println("\nTable - " + leagueName);
        System.out.println("-".repeat(30));
        for(var team: teams){
            i++;
            System.out.printf("%dº - %s: %d%n",
                    i, team.getTeamName(), team.getPoints());
        }
        System.out.println("-".repeat(30));
    }

}
