package com.cs.ajinmathew.project.calcspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
EditText edNum1,edNum2,edRes;
Button btnSubmit;
float first,second,res;
String oper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        spinner=(Spinner)findViewById( R.id.operators );
        edNum1=(EditText)findViewById( R.id.num1 );
        edNum2=(EditText)findViewById( R.id.num2 );
        edRes=(EditText)findViewById( R.id.result );
        btnSubmit=(Button)findViewById( R.id.submit );
        btnSubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=Float.parseFloat( edNum1.getText().toString() );
                second=Float.parseFloat( edNum2.getText().toString() );
                oper=spinner.getSelectedItem().toString();
                if(oper.equals( "+" )){
                    res=first+second;
                }else if(oper.equals( "-" )){
                    res=first-second;
                }else if(oper.equals( "*" )) {
                    res = first * second;
                }else if(oper.equals( "/" )) {
                    res = first / second;
                }

                edRes.setText( String.valueOf( res ) );
            }
        } );

    }
}
