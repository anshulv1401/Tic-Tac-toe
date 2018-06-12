package com.example.anshulvanawat.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    public static final String P1N="p1n";
    public static final String P2N="p2n";

    Button start;
    EditText p1;
    EditText p2;
    String n1;
    String n2;
    private String sISName1;//for savedInstanceStateName
    private String sISName2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getWindow().setBackgroundDrawableResource(R.drawable.bg);
        start=(Button)findViewById(R.id.start);
        p1=(EditText) findViewById(R.id.player1);
        p2=(EditText) findViewById(R.id.player2);

        if(savedInstanceState!=null){
            savedInstanceState.get(sISName1);
            savedInstanceState.get(sISName1);
            p1.setText(sISName1);
            p2.setText(sISName2);
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(sISName1,n1);
        outState.putString(sISName2,n2);

    }

    public void onPress(View view) {

        n1=p1.getText().toString().trim();
        n2=p2.getText().toString().trim();

        if(n1.equals("")){
            n1="Player 1";
        }
        if(n2.equals("")){
            n2="Player 2";
        }
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(P1N, n1);
        intent.putExtra(P2N, n2);
        startActivity(intent);
    }
}
