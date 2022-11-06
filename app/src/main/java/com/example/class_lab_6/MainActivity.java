package com.example.class_lab_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Radio Group
    RadioButton rb1,rb2,rb3,rb4,rb5;
    Button btn1;

    //RadioButton rb;
    TextView tv2;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1= (RadioButton) findViewById(R.id.rb1);
        rb2= (RadioButton) findViewById(R.id.rb2);
        rb3= (RadioButton) findViewById(R.id.rb3);
        rb4= (RadioButton) findViewById(R.id.rb4);
        rb5= (RadioButton) findViewById(R.id.rb5);
        btn1 = (Button) findViewById(R.id.btn1);
        tv2=(TextView) findViewById(R.id.tv2);
        et1=(EditText) findViewById(R.id.et1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = et1.getText().toString(); // getting user input string and store in a

                double amount = Double.parseDouble(a);  // convert user string value to double

                if (rb1.isChecked()){
                    amount = amount/80.00;
                    tv2.setText(String.valueOf("Converted Amount "+ amount));
                    }
                else if (rb2.isChecked()){
                    amount = amount/100.00;
                    tv2.setText(String.valueOf("Converted Amount "+ amount));
                }
                else if (rb3.isChecked()){
                    amount = amount/75.00;
                    tv2.setText(String.valueOf("Converted Amount "+ amount));
                }
                else if (rb4.isChecked()){
                    amount = amount/115;
                    tv2.setText(String.valueOf("Converted Amount "+ amount));
                }
                else if (rb5.isChecked()){
                    amount = amount/102;
                    tv2.setText(String.valueOf("Converted Amount "+ amount));
                }
            }
        });
    }
}