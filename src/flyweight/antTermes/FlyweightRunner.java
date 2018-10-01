package flyweight.antTermes;

import java.util.ArrayList;

public class FlyweightRunner {

  private final static int SIZE = 4_000_000;

  public static void main(String[] args) {
    ArrayList<EuTermes> legion = new ArrayList<>();

    for (int i = 0; i < SIZE; i++) {

      try {
        legion.add(new EuTermes("Worker", 12.3f, 10.1f));
      } catch (OutOfMemoryError e) {
        System.err.println("OutOfMemoryError for Termes Worker");
      } finally {
        System.out.println("Instance: " + i);
      }
    }
  }
}
