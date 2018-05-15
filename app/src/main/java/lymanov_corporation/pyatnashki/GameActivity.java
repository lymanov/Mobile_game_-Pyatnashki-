package lymanov_corporation.pyatnashki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button zero;

    int[] game_num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,0,15};
    int[] game_win = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};

    public void vivod()
    {
        button1.setText(Integer.toString(game_num[0]));
        button2.setText(Integer.toString(game_num[1]));
        button3.setText(Integer.toString(game_num[2]));
        button4.setText(Integer.toString(game_num[3]));
        button5.setText(Integer.toString(game_num[4]));
        button6.setText(Integer.toString(game_num[5]));
        button7.setText(Integer.toString(game_num[6]));
        button8.setText(Integer.toString(game_num[7]));
        button9.setText(Integer.toString(game_num[8]));
        button10.setText(Integer.toString(game_num[9]));
        button11.setText(Integer.toString(game_num[10]));
        button12.setText(Integer.toString(game_num[11]));
        button13.setText(Integer.toString(game_num[12]));
        button14.setText(Integer.toString(game_num[13]));
        button15.setText(Integer.toString(game_num[14]));
        zero.setText(Integer.toString(game_num[15]));

        //Проверка на победу
        boolean pobeda = true;
        for(int i = 0; i<15; i++)
            {
                if(game_num[i]!=game_win[i])
                    pobeda=false;
            }
        if(pobeda==true) {
            Intent intent = new Intent(GameActivity.this, Pobeda.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        zero = (Button) findViewById(R.id.zero);

        vivod();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        zero.setOnClickListener(this);
    }

    public void zamena(int k,int j)
    {
        int a = game_num[k];
        game_num[k] = game_num[j];
        game_num[j] = a;
    }

    @Override
    public void onClick(View view) {
              switch(view.getId()){
                  case R.id.button1:
                      if(game_num[1]==0){
                          zamena(0,1);
                          vivod();}
                      if (game_num[4]==0){
                          zamena(0,4);
                          vivod();}
                      break;
                  case R.id.button2:
                      if (game_num[0]==0){
                          zamena(1,0);
                          vivod();}
                      if (game_num[2]==0){
                          zamena(1,2);
                          vivod();}
                      if (game_num[5]==0){
                          zamena(1,5);
                          vivod();}
                      break;
                  case R.id.button3:
                      if (game_num[1]==0){
                          zamena(2,1);
                          vivod();}
                      if (game_num[3]==0){
                          zamena(2,3);
                          vivod();}
                      if (game_num[6]==0){
                          zamena(2,6);
                          vivod();}
                      break;
                  case R.id.button4:
                      if (game_num[2]==0){
                          zamena(3,2);
                          vivod();}
                      if (game_num[7]==0){
                          zamena(3,7);
                          vivod();}
                      break;
                  case R.id.button5:
                      if (game_num[0]==0){
                          zamena(4,0);
                          vivod();}
                      if (game_num[5]==0){
                          zamena(4,5);
                          vivod();}
                      if (game_num[8]==0){
                          zamena(5,8);
                          vivod();}
                      break;
                  case R.id.button6:
                      if (game_num[1]==0){
                          zamena(5,1);
                          vivod();}
                      if (game_num[4]==0){
                          zamena(5,4);
                          vivod();}
                      if (game_num[6]==0){
                          zamena(5,6);
                          vivod();}
                      if (game_num[9]==0){
                          zamena(5,9);
                          vivod();}
                      break;
                  case R.id.button7:
                      if(game_num[2]==0){
                          zamena(6,2);
                        vivod();}
                      if(game_num[5]==0){
                          zamena(6,5);
                          vivod();}
                      if(game_num[7]==0){
                          zamena(6,7);
                          vivod();}
                      if(game_num[10]==0){
                          zamena(6,10);
                          vivod();}
                      break;
                  case R.id.button8:
                      if(game_num[3]==0){
                          zamena(7,3);
                          vivod();}
                      if(game_num[6]==0){
                          zamena(7,6);
                          vivod();}
                      if(game_num[11]==0){
                          zamena(7,11);
                          vivod();}
                      break;
                  case R.id.button9:
                      if(game_num[4]==0){
                          zamena(8,4);
                          vivod();}
                      if(game_num[9]==0){
                          zamena(8,9);
                          vivod();}
                      if(game_num[12]==0){
                          zamena(8,12);
                          vivod();}
                      break;
                  case R.id.button10:
                      if(game_num[5]==0){
                          zamena(9,5);
                          vivod();}
                      if(game_num[8]==0){
                          zamena(9,8);
                          vivod();}
                      if(game_num[10]==0){
                          zamena(9,10);
                          vivod();}
                      if (game_num[13]==0){
                          zamena(9,13);
                          vivod();}
                      break;
                  case R.id.button11:
                      if(game_num[6]==0){
                          zamena(10,6);
                          vivod();}
                      if(game_num[9]==0){
                          zamena(10,9);
                          vivod();}
                      if(game_num[11]==0){
                          zamena(10,11);
                          vivod();}
                      if (game_num[14]==0){
                          zamena(10,14);
                          vivod();}
                      break;
                  case R.id.button12:
                      if(game_num[7]==0){
                          zamena(11,7);
                          vivod();}
                      if(game_num[10]==0){
                          zamena(11,10);
                          vivod();}
                      if(game_num[15]==0){
                          zamena(11,15);
                          vivod();}
                      break;
                  case R.id.button13:
                      if (game_num[8]==0){
                          zamena(12,8);
                          vivod();}
                      if (game_num[13]==0){
                          zamena(12,13);
                          vivod();}
                      break;
                  case R.id.button14:
                      if(game_num[9]==0){
                          zamena(13,9);
                          vivod();}
                      if(game_num[12]==0){
                          zamena(13,12);
                          vivod();}
                      if(game_num[14]==0){
                          zamena(13,14);
                          vivod();}
                      break;
                  case R.id.button15:
                      if(game_num[10]==0){
                          zamena(14,10);
                          vivod();}
                      if(game_num[13]==0){
                          zamena(14,13);
                          vivod();}
                      if(game_num[15]==0){
                          zamena(14,15);
                          vivod();}
                      break;
                  case R.id.zero:
                      if (game_num[11]==0){
                          zamena(15,11);
                          vivod();}
                      if (game_num[14]==0){
                          zamena(15,14);
                          vivod();}
                      break;
                }

            }
}