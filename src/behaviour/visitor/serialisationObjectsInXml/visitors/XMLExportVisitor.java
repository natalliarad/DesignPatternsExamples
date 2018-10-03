package behaviour.visitor.serialisationObjectsInXml.visitors;

import behaviour.visitor.serialisationObjectsInXml.shapes.Circle;
import behaviour.visitor.serialisationObjectsInXml.shapes.CompoundShape;
import behaviour.visitor.serialisationObjectsInXml.shapes.Dot;
import behaviour.visitor.serialisationObjectsInXml.shapes.Rectangle;
import behaviour.visitor.serialisationObjectsInXml.shapes.Shape;

public class XMLExportVisitor implements Visitor {

    public String export(final Shape... args) {
        final StringBuilder sb = new StringBuilder();

        for (final Shape shape : args) {
            sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
            sb.append(shape.accept(this)).append("\n");
            System.out.println(sb);
            sb.setLength(0);
        }

        return sb.toString();
    }

    @Override
    public String visitDot(final Dot dot) {
        return "<dot>" + "\n" +
                "    <id>" + dot.getId() + "</id>" + "\n" +
                "    <x>" + dot.getX() + "</x>" + "\n" +
                "    <y>" + dot.getY() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visitCircle(final Circle circle) {
        return "<circle>" + "\n" +
                "    <id>" + circle.getId() + "</id>" + "\n" +
                "    <x>" + circle.getX() + "</x>" + "\n" +
                "    <y>" + circle.getY() + "</y>" + "\n" +
                "    <radius>" + circle.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(final Rectangle rectangle) {
        return "<rectangle>" + "\n" +
                "    <id>" + rectangle.getId() + "</id>" + "\n" +
                "    <x>" + rectangle.getX() + "</x>" + "\n" +
                "    <y>" + rectangle.getY() + "</y>" + "\n" +
                "    <width>" + rectangle.getWidth() + "</width>" + "\n" +
                "    <height>" + rectangle.getHeight() + "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitCompoundGraphic(final CompoundShape cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _visitCompoundGraphic(cg) +
                "</compound_graphic>";
    }

    private String _visitCompoundGraphic(final CompoundShape cg) {
        final StringBuilder sb = new StringBuilder();

        for (final Shape shape : cg.children) {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }

        return sb.toString();
    }
}
