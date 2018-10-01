package flyweight.antTermes;

import java.util.TreeMap;

/**
 * The more external attributes - the less instances of the flyweight, but the more internal
 * attributes - the less time for access to itself attributes.
 */
public class TermesFactory {

  private static TreeMap<String, Termes> map = new TreeMap<>();

  public static Termes getClassFromFactory(String name) {
    if (map.containsKey(name)) {
      return map.get(name);
    } else {
      TermesType type = TermesType.valueOf(name.toUpperCase());
      switch (type) {
        case WORKER:
          Worker worker = new Worker();
          map.put(name, worker);

          return worker;

        case WARRIOR:
          Warrior warrior = new Warrior();
          map.put(name, warrior);

          return warrior;

        default:
          throw new EnumConstantNotPresentException(TermesType.class, type.name());
      }
    }
  }
}
