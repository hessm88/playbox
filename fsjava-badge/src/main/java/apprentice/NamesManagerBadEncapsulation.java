package apprentice;

import java.util.List;

public class NamesManagerBadEncapsulation {

  private List<String> names;

  public List<String> getNames() {
    return names;
  }

  public void addName(String newName) {
    validateName(newName);
    names.add(newName);
  }

  private void validateName(String name) {
    // name validation logic
  }
}
