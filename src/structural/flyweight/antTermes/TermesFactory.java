package structural.flyweight.antTermes;

import java.util.TreeMap;

/**
 * The more external attributes - the less instances of the structural.flyweight, but the more internal
 * attributes - the less time for access to itself attributes.
 */
class TermesFactory {

    private static final TreeMap<String, Termes> map = new TreeMap<>();

    static Termes getClassFromFactory(final String name) {

        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            final TermesType type = TermesType.valueOf(name.toUpperCase());

            switch (type) {
                case WORKER:
                    final Worker worker = new Worker();
                    map.put(name, worker);

                    return worker;

                case WARRIOR:
                    final Warrior warrior = new Warrior();
                    map.put(name, warrior);

                    return warrior;

                default:
                    throw new EnumConstantNotPresentException(TermesType.class, type.name());
            }
        }
    }
}
