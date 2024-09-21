package quiz_app_java;
public class Main {
    public static void main(String[] args) {
        QuestionService questionService=new QuestionService();
        questionService.showQuestions();
        questionService.printScore();
    }
}
