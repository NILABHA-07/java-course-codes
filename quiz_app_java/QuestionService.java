package quiz_app_java;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    int options[]=new int[5];

    public QuestionService() {
        questions[0] = new Question(1, "Name of Final boss of Elden ring", "Malenia", "Radahn", "Radagon",
                "ELden Beast",4);
        questions[1] = new Question(2, "Name of First boss of Elden ring", "Malenia", "Tree Sentinel", "Radagon",
                "ELden Beast",2);
        questions[2] = new Question(3, "Name of First Major boss of Elden ring", "Malenia", "Margit the fell",
                "Radagon", "ELden Beast",2);
        questions[3] = new Question(4, "Name of 2nd Major boss of Elden ring", "Godrick the grafted", "Radahn",
                "Radagon", "ELden Beast",1);
        questions[4] = new Question(5, "Name of First Intelligence boss of Elden ring", "Malenia", "Radahn", "Radagon",
                "Renalla the queen of moon",4);
    }
    public void showQuestions(){
        int i=0;
        for(Question q:questions){
            System.out.println("Question No: "+q.getId());
            System.out.println("Question : "+q.getQuestion());
            System.out.println("Choose options by 1,2,3,4");
            System.out.println("Options: "+q.getOpt1());
            System.out.println("Options: "+q.getOpt2());
            System.out.println("Options: "+q.getOpt3());
            System.out.println("Options: "+q.getOpt4());
            
            Scanner sc=new Scanner(System.in);
            options[i]=sc.nextInt();
            i++;
        }
        System.out.println("The options chosen by you are: ");
        for(int option:options){
            System.out.print(option+" ");
        }
        
    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            if(options[i]==que.getAnswer()){
                score++;
            }
        }
        if(score<2){
            System.out.println("Better luck next time, your score is: "+score);
        }
        else{
            System.out.println("Very good job , your score is: "+score);
        }
    }

}
