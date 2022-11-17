import java.util.ArrayList;
import java.util.logging.LoggingPermission;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName() + " picked for the team " + getName());
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        }
        else if(ourScore < theirScore) {
            lost++;
            message = " lost to ";
        }
        else {
            tied++;
            message = " tied with ";
        }
        played++;

        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> tTeam) {
        if(this.ranking() > tTeam.ranking())
            return -1;
        else if(this.ranking() < tTeam.ranking())
            return 1;
        return 0;
    }
}
