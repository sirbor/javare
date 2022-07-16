public class Team{
    Player player;
    public Team(Player player){
        this.player = player;
    }

    public static void main(String[] args){
        Player myPlayer = new Player("Kounde", "Chelsea", 44, 23);
        Team myTeam = new Team(myPlayer);
        System.out.println(myTeam.player.getName());
        System.out.println(myTeam.player.getClub());
        System.out.println(myTeam.player.getGoals());
        System.out.println(myTeam.player.getAssists());
    }
}

class Player{
    private String name;
    private String club;
    private int goals;
    private int assists;

    public Player(String name, String club, int goals, int assists){
        this.name = name;
        this.club = club;
        this.goals = goals;
        this.assists = assists;
    }

    public String getName(){
        return this.name;
    }

    public String getClub(){
        return  this.club;
    }

    public int getGoals(){
        return this.goals;
    }

    public int getAssists(){
        return  this.assists;
    }
}