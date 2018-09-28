package composite.compositeChannel;

public class CompositeRun {

    public static void main(String[] args) {
        final TCPChannel channel1 = new TCPChannel(1);
        final TCPChannel channel2 = new TCPChannel(2);
        final UDPChannel channel3 = new UDPChannel(3);
        final UDPChannel channel4 = new UDPChannel(4);
        final UDPChannel channel9 = new UDPChannel(9);

        final CompositeTool mainTool = new CompositeTool(777);
        final CompositeTool childTool1 = new CompositeTool(10);
        final CompositeTool childTool2 = new CompositeTool(11);

        childTool1.add(channel1);
        childTool1.add(channel2);
        childTool1.add(channel3);
        childTool2.add(channel4);

        mainTool.add(childTool1);
        mainTool.add(childTool2);
        mainTool.add(channel9);

        System.out.println("Main tool send: ");
        mainTool.send();

        childTool1.remove(channel2);
        mainTool.remove(childTool2);

        System.out.println("Main tool send after remove: ");
        mainTool.send();
    }
}
