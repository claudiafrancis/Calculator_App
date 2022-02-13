package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,buttonC,buttonEqual,buttonadd,buttonsub,buttonmul,buttondiv;
EditText editText;
float mValueone,mValuetwo;
boolean add,sub,mult,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button) findViewById(R.id.button0);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        buttonC=(Button) findViewById(R.id.buttonC);
        buttonEqual=(Button) findViewById(R.id.buttoneql);
        buttonadd=(Button) findViewById(R.id.buttonadd);
        buttonmul=(Button) findViewById(R.id.buttonmul);
        buttondiv=(Button) findViewById(R.id.buttondiv);
        buttonsub=(Button) findViewById(R.id.buttonsub);
        editText=(EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText==null)
                {
                    editText.setText("");
                }
                else
                {
                    mValueone=Float.parseFloat(editText.getText()+ "");
                    add= true;
                    editText.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueone=Float.parseFloat(editText.getText()+"");
                sub=true;
                editText.setText(null);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueone=Float.parseFloat(editText.getText()+"");
                mult=true;
                editText.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    mValueone=Float.parseFloat(editText.getText()+"");
                    div=true;
                    editText.setText(null);
                }

        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               editText.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValuetwo=Float.parseFloat(editText.getText()+"");

                if(add==true)
                {
                    editText.setText(mValueone+mValuetwo+"");
                    add=false;
                }
                if(sub==true)
                {
                    editText.setText(mValueone+mValuetwo+"");
                }
                if(mult==true)
                {
                    editText.setText(mValueone+mValuetwo+"");
                }
                if(div==true)
                {
                    editText.setText(mValueone+mValuetwo+"");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              editText.setText(editText.getText()+"0");
            }
        });


    }
}