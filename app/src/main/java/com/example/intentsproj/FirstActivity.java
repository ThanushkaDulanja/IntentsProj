package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        if(n1.isEmpty() || n2.isEmpty()){
            Context context = getApplicationContext();
            CharSequence message = "Number fields cannot be empty";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, message, duration);
            toast.show();
        }


        else {
            try{
                Float.parseFloat(n1);
                Float.parseFloat(n2);

                intent.putExtra("Number1", n1);
                intent.putExtra("Number2", n2);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Sending values..";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            }catch(Exception e){
                Context context = getApplicationContext();
                CharSequence message = "Invalid! Enter again..";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            }
        }
    }
}
