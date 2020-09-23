package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/**
     * This app executes computer base text.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *this function is called when the submit button ids clicked to display the score
     * @param view stores the score
     */
    public void submitOrder(View view) {
// tracks the correct option in question 1
        RadioButton firstAnswer = (RadioButton) findViewById(R.id.option_D);
        boolean firstAnswerChecked = firstAnswer.isChecked();
// tracks the correct option in question 2
        RadioButton secondAnswer = (RadioButton) findViewById(R.id.right_op);
        boolean secondAnswerChecked = secondAnswer.isChecked();

// tracks the correct option in question 3
        RadioButton thirdAnswer = (RadioButton) findViewById(R.id.right_option);
        boolean thirdAnswerChecked = thirdAnswer.isChecked();

// tracks the correct option in question 4
        RadioButton fourthAnswer = (RadioButton) findViewById(R.id.right);
        boolean forthAnswerChecked = fourthAnswer.isChecked();

// tracks the correct option in question 5
        RadioButton fifthAnswer = (RadioButton) findViewById(R.id.answer);
        boolean fifthAnswerChecked = fifthAnswer.isChecked();

// calls the function-calculateAnswer and stores it inside the variable-result
        int result = calculateAnswer(firstAnswerChecked, secondAnswerChecked, thirdAnswerChecked, forthAnswerChecked,
                fifthAnswerChecked);

// displays the result as toast on the screen
        Toast.makeText(this, "your score is " + result +"%", Toast.LENGTH_LONG).show();
    }

    /**calculate the numbers of correct answers
     *
      * @param firstAnswerChecked= check if the right option is clicked in question 1
     * @param secondAnswerChecked=check if the right option is clicked in question 2
     * @param thirdAnswerChecked=check if the right option is clicked in question 3
     * @param forthAnswerChecked=check if the right option is clicked in question 4
     * @param fifthAnswerChecked=check if the right option is clicked in question 5
     * @return= returns the total score
     */

    public int calculateAnswer(boolean firstAnswerChecked, boolean secondAnswerChecked, boolean thirdAnswerChecked,
                               boolean forthAnswerChecked,boolean fifthAnswerChecked) {
        int counter = 0;
        if (firstAnswerChecked) counter++;
        if (secondAnswerChecked) counter++;
        if (thirdAnswerChecked) counter++;
        if (forthAnswerChecked) counter++;
        if (fifthAnswerChecked) counter++;

        return counter * 20;
    }
}

