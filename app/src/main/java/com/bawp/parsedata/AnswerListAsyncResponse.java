package com.bawp.parsedata;



import com.bawp.parsedata.model.Question;
import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
