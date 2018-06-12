package com.example.anshulvanawat.tictactoe;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String p1 ="";//store the buttons hit by player 1
    String p2 ="";//store the buttons hit by player 2
    String p1n;
    String p2n;
    int alter=0;//decides player's turn, even for player 1, odd for player 2
    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageView b4;
    ImageView b5;
    ImageView b6;
    ImageView b7;
    ImageView b8;
    ImageView b9;
    boolean chance =true;//depends on alter
    boolean switchTurn=false;//This decides weather the user want to switch turn
    //It will change the value assigning to chance

    TextView tV1;// do display who wins
    TextView tV2;// display who's turn
    boolean on1=true,on2=true,on3=true,on4=true,on5=true,on6=true,on7=true,on8=true,on9=true,on10=true;//for the buttons
    boolean[] buttonON = new boolean[10];
    // on10 decides weather to display turns or not





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);







        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        p1n =intent.getExtras().getString(MainActivity.P1N);
        p2n =intent.getExtras().getString(MainActivity.P2N);
        Toast toast=Toast.makeText(this, p1n +" vs "+ p2n,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();
        b1 =(ImageView)findViewById(R.id.b1);
        b2 =(ImageView)findViewById(R.id.b2);
        b3 =(ImageView)findViewById(R.id.b3);
        b4 =(ImageView)findViewById(R.id.b4);
        b5 =(ImageView)findViewById(R.id.b5);
        b6 =(ImageView)findViewById(R.id.b6);
        b7 =(ImageView)findViewById(R.id.b7);
        b8 =(ImageView)findViewById(R.id.b8);
        b9 =(ImageView)findViewById(R.id.b9);


        tV1 =(TextView)findViewById(R.id.textView1);
        tV2 =(TextView)findViewById(R.id.textView2);
        tV1.setText("Result : ");
        tV2.setText(p1n +"'s turn");
    }



    public void onHit(View view) {

        int i=Integer.parseInt(view.getTag().toString());//returns int associated with each button
        if(alter<=9){

            if(buttonON[i]){

                if(chance){
                    p1 = p1 +view.getTag().toString();
                    b1.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +view.getTag().toString();
                    b1.setImageResource(R.drawable.toe);
                }
                alter++;
                buttonON[i]=false;

            }

        }
        /*
        view.playSoundEffect(SoundEffectConstants.CLICK);
        switch (view.getId()) {

        case R.id.b1:

            if(on1) {
                if(chance){
                    p1 = p1 +"1";
                    b1.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"1";
                    b1.setImageResource(R.drawable.toe);
                }
                alter++;
                on1=false;

            }

            break;

        case R.id.b2:
            if(on2) {
                if(chance){
                    p1 = p1 +"2";
                    b2.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"2";
                    b2.setImageResource(R.drawable.toe);
                }


                alter++;
                on2=false;

            }break;

        case R.id.b3:
            if(on3) {
                if(chance){
                    p1 = p1 +"3";
                    b3.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"3";
                    b3.setImageResource(R.drawable.toe);
                }


                alter++;
                on3=false;

            } break;

        case R.id.b4:
            if(on4) {
                if(chance){
                    p1 = p1 +"4";
                    b4.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"4";
                    b4.setImageResource(R.drawable.toe);
                }


                alter++;
                on4=false;

            }
            break;

        case R.id.b5:
            if(on5) {
                if(chance){
                    p1 = p1 +"5";
                    b5.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"5";
                    b5.setImageResource(R.drawable.toe);
                }


                alter++;
                on5=false;

            }
            break;

        case R.id.b6:
            if(on6) {
                if(chance){
                    p1 = p1 +"6";
                    b6.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"6";
                    b6.setImageResource(R.drawable.toe);
                }


                alter++;
                on6=false;

            }
            break;

        case R.id.b7:
            if(on7) {
                if(chance){
                    p1 = p1 +"7";
                    b7.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"7";
                    b7.setImageResource(R.drawable.toe);
                }


                alter++;
                on7=false;

            }
            break;

        case R.id.b8:
            if(on8) {
                if(chance){
                    p1 = p1 +"8";
                    b8.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"8";
                    b8.setImageResource(R.drawable.toe);
                }


                alter++;
                on8=false;

            }
            break;

        case R.id.b9:
            if(on9) {
                if(chance){
                    p1 = p1 +"9";
                    b9.setImageResource(R.drawable.tic);
                }else{
                    p2 = p2 +"9";
                    b9.setImageResource(R.drawable.toe);
                }
                alter++;
                on9=false;

            }
            break;

        }
        */

        String check=chance? p1 : p2;
        String result;

        if(on10 && ((check.contains("1") && check.contains("2") && check.contains("3"))
                || (check.contains("4") && check.contains("5") && check.contains("6"))
                || (check.contains("7") && check.contains("8") && check.contains("9"))
                || (check.contains("1") && check.contains("4") && check.contains("7"))
                || (check.contains("2") && check.contains("5") && check.contains("8"))
                || (check.contains("3") && check.contains("6") && check.contains("9"))
                || (check.contains("1") && check.contains("5") && check.contains("9"))
                || (check.contains("3") && check.contains("5") && check.contains("7")))){
            result=(chance? p1n +" wins": p2n +" wins");
            tV1.setText("Result : "+result);
            tV2.setText("Reset To play again");
            on1=false;
            on2=false;
            on3=false;
            on4=false;
            on5=false;
            on6=false;
            on7=false;
            on8=false;
            on9=false;
            on10=false;
            alter=10;//this is done coz if the game ends at the last turn, the alter will be 9, so next click will make the else statement execute.

            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.toast_layout_root));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText(result);
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }else if(alter==9) {
            result="Draw";
            tV1.setText("Result : "+result);
            tV2.setText("Reset to play again");
            on1 = false;
            on2 = false;
            on3 = false;
            on4 = false;
            on5 = false;
            on6 = false;
            on7 = false;
            on8 = false;
            on9 = false;
            on10 = false;
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.toast_layout_root));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText(result);
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }


        if(view.getId()==R.id.buttonReset){
            Toast toast1=Toast.makeText(this,"game Reset",Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
            toast1.show();

            p2 ="";
            p1 ="";
            tV1.setText("Result : ");
            tV2.setText(p1n +"'s turn");
            alter=0;
            b1.setImageDrawable(null);
            b2.setImageDrawable(null);
            b3.setImageDrawable(null);
            b4.setImageDrawable(null);
            b5.setImageDrawable(null);
            b6.setImageDrawable(null);
            b7.setImageDrawable(null);
            b8.setImageDrawable(null);
            b9.setImageDrawable(null);
            on1=true;
            on2=true;
            on3=true;
            on4=true;
            on5=true;
            on6=true;
            on7=true;
            on8=true;
            on9=true;
            on10=true;


        }

        if(view.getId()==R.id.buttonSwitch){

            switchTurn=!switchTurn;

            p2 = "";
            p1 = "";
            tV1.setText("Result : ");
            Toast toast2=Toast.makeText(this,(switchTurn?p2n:p1n) +"'s turn",Toast.LENGTH_SHORT);
            toast2.setGravity(Gravity.CENTER_VERTICAL,0,0);
            toast2.show();
            alter=0;
            b1.setImageDrawable(null);
            b2.setImageDrawable(null);
            b3.setImageDrawable(null);
            b4.setImageDrawable(null);
            b5.setImageDrawable(null);
            b6.setImageDrawable(null);
            b7.setImageDrawable(null);
            b8.setImageDrawable(null);
            b9.setImageDrawable(null);
            on1=true;
            on2=true;
            on3=true;
            on4=true;
            on5=true;
            on6=true;
            on7=true;
            on8=true;
            on9=true;
            on10=true;

        }

        if(!switchTurn) {
            chance = (alter % 2 == 0);//true for player 1 and false for player 2
        }else{
            chance = !(alter % 2 == 0);//true for player 2 and false for player 1
        }
        if(on10){
            tV2.setText(chance? p1n +"'s turn": p2n +"'s turn");
        }
    }

    public void AI(){





    }

}
