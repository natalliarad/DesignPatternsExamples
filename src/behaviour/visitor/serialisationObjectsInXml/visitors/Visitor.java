package behaviour.visitor.serialisationObjectsInXml.visitors;

import behaviour.visitor.serialisationObjectsInXml.shapes.Circle;
import behaviour.visitor.serialisationObjectsInXml.shapes.CompoundShape;
import behaviour.visitor.serialisationObjectsInXml.shapes.Dot;
import behaviour.visitor.serialisationObjectsInXml.shapes.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
