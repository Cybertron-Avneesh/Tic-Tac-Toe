package com.cyb3rtr0n_4vn335h.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;



import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    Integer Player =1;
    Integer i = 1;
    TextView CurrPlayer;
    ImageView Play_but;
    ImageButton btn1, btn2, btn3, btn4, btn5,btn6,btn7,btn8,btn9;
    Button btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurrPlayer = (TextView) findViewById(R.id.CurrPlayer);
        Play_but = (ImageView) findViewById(R.id.Play_but);
        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);
        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);
        btn5 = (ImageButton) findViewById(R.id.btn5);
        btn6 = (ImageButton) findViewById(R.id.btn6);
        btn7 = (ImageButton) findViewById(R.id.btn7);
        btn8 = (ImageButton) findViewById(R.id.btn8);
        btn9 = (ImageButton) findViewById(R.id.btn9);
        btnreset = (Button) findViewById(R.id.btnreset);


        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Player=1;
                CurrPlayer.setText("Player 1");
                Play_but.setImageResource(R.drawable.cross);
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                btn6.setClickable(true);
                btn7.setClickable(true);
                btn8.setClickable(true);
                btn9.setClickable(true);

                btn1.setImageResource(R.drawable.blank);
                btn2.setImageResource(R.drawable.blank);
                btn3.setImageResource(R.drawable.blank);
                btn4.setImageResource(R.drawable.blank);
                btn5.setImageResource(R.drawable.blank);
                btn6.setImageResource(R.drawable.blank);
                btn7.setImageResource(R.drawable.blank);
                btn8.setImageResource(R.drawable.blank);
                btn9.setImageResource(R.drawable.blank);

                btn1.setContentDescription("1");
                btn2.setContentDescription("2");
                btn3.setContentDescription("3");
                btn4.setContentDescription("4");
                btn5.setContentDescription("5");
                btn6.setContentDescription("6");
                btn7.setContentDescription("7");
                btn8.setContentDescription("8");
                btn9.setContentDescription("9");

                CurrPlayer.setContentDescription("1");


            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn1.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn1.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn1.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn1.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");

                }
                btn1.setClickable(false);
                check_Win();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn2.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn2.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn2.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn2.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn2.setClickable(false);

               check_Win();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn3.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn3.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn3.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn3.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn3.setClickable(false);

                check_Win();


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn4.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn4.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn4.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn4.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn4.setClickable(false);

                check_Win();


            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn5.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn5.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn5.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn5.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn5.setClickable(false);

                check_Win();


            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn6.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn6.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn6.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn6.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn6.setClickable(false);

                check_Win();

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn7.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn7.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn7.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn7.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn7.setClickable(false);

                check_Win();


            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn8.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn8.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn8.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn8.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn8.setClickable(false);
                check_Win();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Player == 1) {
                    btn9.setImageResource(R.drawable.cross);
                    CurrPlayer.setText(R.string.player_2);
                    btn9.setContentDescription("x");
                    Play_but.setImageResource(R.drawable.group_1);
                    Player = 2;
                    CurrPlayer.setContentDescription("2");
                } else {

                    btn9.setImageResource(R.drawable.group_1);
                    CurrPlayer.setText(R.string.player_1);
                    btn9.setContentDescription("o");
                    Play_but.setImageResource(R.drawable.cross);
                    Player = 1;
                    CurrPlayer.setContentDescription("1");
                }
                btn9.setClickable(false);

                check_Win();

            }

        });



    }

    public void check_Win()
    {
        if((btn1.getContentDescription()==btn2.getContentDescription()&&btn2.getContentDescription()==btn3.getContentDescription())
                ||(btn4.getContentDescription()==btn5.getContentDescription()&&btn5.getContentDescription()==btn6.getContentDescription())
                ||(btn7.getContentDescription()==btn8.getContentDescription()&&btn8.getContentDescription()==btn9.getContentDescription())
                ||(btn1.getContentDescription()==btn4.getContentDescription()&&btn4.getContentDescription()==btn7.getContentDescription())
                ||(btn2.getContentDescription()==btn5.getContentDescription()&&btn5.getContentDescription()==btn8.getContentDescription())
                ||(btn3.getContentDescription()==btn6.getContentDescription()&&btn6.getContentDescription()==btn9.getContentDescription())
                ||(btn1.getContentDescription()==btn5.getContentDescription()&&btn5.getContentDescription()==btn9.getContentDescription())
                ||(btn3.getContentDescription()==btn5.getContentDescription()&&btn5.getContentDescription()==btn7.getContentDescription()))
        {
            btn9.setClickable(false);
            btn8.setClickable(false);
            btn7.setClickable(false);
            btn6.setClickable(false);
            btn5.setClickable(false);
            btn4.setClickable(false);
            btn3.setClickable(false);
            btn2.setClickable(false);
            btn1.setClickable(false);
            if(Player==2){
                CurrPlayer.setText("Hurray\n Player [1] Won");
                Play_but.setImageResource(R.drawable.cross);
            }
            else if(Player==1){
                CurrPlayer.setText("Hurray\n Player [2] Won");
                Play_but.setImageResource(R.drawable.group_1);
            }
            CurrPlayer.setContentDescription("WON");


        }
        if((btn1.getContentDescription()=="x"||btn1.getContentDescription()=="o")
                &&(btn2.getContentDescription()=="x"||btn2.getContentDescription()=="o")
                &&(btn3.getContentDescription()=="x"||btn3.getContentDescription()=="o")
                &&(btn4.getContentDescription()=="x"||btn4.getContentDescription()=="o")
                &&(btn5.getContentDescription()=="x"||btn5.getContentDescription()=="o")
                &&(btn6.getContentDescription()=="x"||btn6.getContentDescription()=="o")
                &&(btn7.getContentDescription()=="x"||btn7.getContentDescription()=="o")
                &&(btn8.getContentDescription()=="x"||btn8.getContentDescription()=="o")
                &&(btn9.getContentDescription()=="x"||btn9.getContentDescription()=="o"))
        {
            if(CurrPlayer.getContentDescription()=="1" || CurrPlayer.getContentDescription()=="2")
            {
                CurrPlayer.setContentDescription("Draw");
                CurrPlayer.setText("Game DRAW ");
                Play_but.setImageResource(R.drawable.blank);
            }
        }

    }

}
