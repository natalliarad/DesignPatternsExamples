package behaviour.visitor.serialisationObjectsInXml.shapes;

import behaviour.visitor.serialisationObjectsInXml.visitors.Visitor;

public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
