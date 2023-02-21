package ca.brennanleblanc.SWE4403Lab5.E01;

import java.util.ArrayList;
import java.util.List;

public class Team implements Employee {
  private List<Employee> resources = new ArrayList<>();

  public void add(Employee resource) {
    resources.add(resource);
  }

  public void deploy() {
    for (var resource : resources) {
      resource.deploy();
    }
  }
}
