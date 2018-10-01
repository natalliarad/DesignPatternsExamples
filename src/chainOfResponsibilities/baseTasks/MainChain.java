package chainOfResponsibilities.baseTasks;

public class MainChain {

  public static void main(String[] args) {
    //configuring of the chain
    Task root = new Task("Получить зачёт");
    SubTask subTask = new SubTask("Написать тест", root);
    Question question = new Question("Сделать лабораторную", subTask);
    //run
    System.out.println("Message from question < " + question.handleRequest() + " >");
  }
}
