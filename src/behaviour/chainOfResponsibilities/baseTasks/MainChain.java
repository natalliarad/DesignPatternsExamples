package behaviour.chainOfResponsibilities.baseTasks;

public final class MainChain {

    public static void main(final String[] args) {
        //configuring of the chain
        final Task root = new Task("Получить зачёт");
        final SubTask subTask = new SubTask("Написать тест", root);
        final Question question = new Question("Сделать лабораторную", subTask);
        //run
        System.out.println("Message from question < " + question.handleRequest() + " >");
    }
}
