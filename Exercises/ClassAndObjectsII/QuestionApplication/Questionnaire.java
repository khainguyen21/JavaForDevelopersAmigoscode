package Exercises.ClassAndObjectsII.QuestionApplication;

import com.sun.java.accessibility.util.EventID;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Questionnaire {

    private int id;
    private Date createdAt;
    private List<Question> questionList;

    public Questionnaire(int id) {
        this.id = id;
        this.createdAt = new Date();
        this.questionList = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questionList.add(question);
    }

    public void removeQuestion(Question question) {
        questionList.remove(question);
    }

    public List<Question> getQuestionList() {
        return questionList;
    }
}
