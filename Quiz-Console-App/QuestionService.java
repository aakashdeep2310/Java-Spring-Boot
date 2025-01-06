public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is this size of int", "2", "4" , "6","8", "4" ); 

        questions[1] = new Question(2, "What is this size of double", "2", "4" , "6","8", "8" ); 
        questions[2] = new Question(3, "What is this size of char", "2", "4" , "6","8", "2" ); 
        questions[3] = new Question(4, "What is this size of long", "2", "4" , "6","8", "8" ); 
        questions[4] = new Question(5, "What is this size of boolean", "2", "4" , "6","8", "1" ); 
     }


    public void displayQuestions(){
        // System.out.println("Display question");
        // questions[0] = new Question();
        for(Question q : questions){
            System.out.println(q);
        }
    }

}
