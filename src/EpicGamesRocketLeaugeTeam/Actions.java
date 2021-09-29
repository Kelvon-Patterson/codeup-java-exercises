package EpicGamesRocketLeaugeTeam;

public interface Actions {
    boolean clockIn(); //everyone
    boolean clockOut(); //everyone
    boolean atLunch(); //everyone
    String work();  // everyone
    String meeting(); //Devs, Actors, Managers
    String cleaning(); //janitors
    String writeCode(); //devs
    String takeRoleCall(); //managers
}
