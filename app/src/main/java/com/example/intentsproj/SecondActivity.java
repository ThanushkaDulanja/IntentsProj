package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String numb1, numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        numb1 = intent.getStringExtra("Number1");
        numb2 = intent.getStringExtra("Number2");

        EditText editFieldno1 = findViewById(R.id.fieldcal1);
        EditText editFieldno2 = findViewById(R.id.fieldcal2);

        editFieldno1.setText(numb1);
        editFieldno2.setText(numb2);
    }

    public void multiplication(View view){
        float no1, no2, answ;
        String answerFull;

        no1 = Float.parseFloat(this.numb1);
        no2 = Float.parseFloat(this.numb2);

        answ = no1 * no2;

        answerFull = Float.toString(answ);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " * "  + no2 + " = " + answerFull);
    }

    public void devision(View view){
        float no1, no2, answ;
        String finalAnswer;

        no1 = Float.parseFloat(this.numb1);
        no2 = Float.parseFloat(this.numb2);

        answ = no1 / no2;

        finalAnswer = Float.toString(answ);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " / "  + no2 + " = " + finalAnswer);
    }

    public void addition(View view){
        float no1, no2, ans;
        String answerFull;

        no1 = Float.parseFloat(this.numb1);
        no2 = Float.parseFloat(this.numb2);

        ans = no1 + no2;

        answerFull = Float.toString(ans);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " + "  + no2 + " = " + answerFull);
    }

    public void substraction(View view){
        float no1, no2, answ;
        String answerFull;

        no1 = Float.parseFloat(this.numb1);
        no2 = Float.parseFloat(this.numb2);

        answ = no1 - no2;

        answerFull = Float.toString(answ);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " - "  + no2 + " = " + answerFull);
    }


}
