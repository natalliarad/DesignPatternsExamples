package behaviour.visitor.serialisationObjectsInXml;

import behaviour.visitor.serialisationObjectsInXml.shapes.Circle;
import behaviour.visitor.serialisationObjectsInXml.shapes.CompoundShape;
import behaviour.visitor.serialisationObjectsInXml.shapes.Dot;
import behaviour.visitor.serialisationObjectsInXml.shapes.Rectangle;
import behaviour.visitor.serialisationObjectsInXml.shapes.Shape;
import behaviour.visitor.serialisationObjectsInXml.visitors.XMLExportVisitor;

public final class DemoShapesInXML {

    public static void main(final String[] args) {
        final Dot dot = new Dot(1, 10, 55);
        final Circle circle = new Circle(2, 23, 15, 10);
        final Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        final CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(final Shape... shapes) {
        final XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
