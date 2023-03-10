package ca.brennanleblanc.SWE4403Lab5.E01;

public class Demo {
  public static void main(String[] args) {
    show();
  }
  public static void show() {
    var subTeam1 = new Team();
    subTeam1.add(new Truck());
    subTeam1.add(new HumanResource());
    subTeam1.add(new HumanResource());

    var subTeam2 = new Team();
    subTeam2.add(new Truck());
    subTeam2.add(new HumanResource());
    subTeam2.add(new HumanResource());

    var team = new Team();
    team.add(subTeam1);
    team.add(subTeam2);

    team.deploy();
  }
}
