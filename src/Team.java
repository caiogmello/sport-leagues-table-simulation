public abstract class Team implements Comparable<Team> {
    private String teamName;
    private int played = 0;
    private int wins = 0;
    private int loses = 0;
    private int draws = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void playGame(Team opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            wins++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            draws++;
            message = " drew with ";
        } else {
            loses++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.playGame(null, theirScore, ourScore);
        }

    }

    public int getPoints() {
        return (wins*3) + draws;
    }

    @Override
    public int compareTo(Team team) {
        if(this.getPoints() > team.getPoints()) {
            return -1;
        } else if(this.getPoints() < team.getPoints()) {
            return 1;
        } else {
            return 0;
        }
    }
}
