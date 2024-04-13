package Generics.example;
interface Player{
    String name();
}
record BaseballPlayer (String name, String position) implements Player{}
record FootballPlayer (String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {

        Team<FootballPlayer, Affiliation> afc = new Team<>("Adelaide crows");
        var adelaideAffiliation = new Affiliation("city","Adelaide, PA", "US");
        Team<FootballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm", adelaideAffiliation);

        adelaide.addTeamMember(new FootballPlayer("Pippo","Center fielder"));

        var guthrie = new BaseballPlayer("DD Guthrie","Center fielder");
        var tex = new FootballPlayer("Tex Walker","Center Half forward");

        afc.addTeamMember(tex);
        afc.listTeamMembers();
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n%n", team1,message,team2);
    }
}
