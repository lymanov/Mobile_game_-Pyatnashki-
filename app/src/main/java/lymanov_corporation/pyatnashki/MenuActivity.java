package lymanov_corporation.pyatnashki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button play_button;
    Button the_game_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        play_button = (Button) findViewById(R.id.play_button);
        the_game_button = (Button) findViewById(R.id.game_button);

        play_button.setOnClickListener(this);
        the_game_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play_button:
                Intent intent = new Intent(MenuActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.game_button:
                Intent inten = new Intent(MenuActivity.this, about_the_game.class);
                startActivity(inten);
                break;
        }
    }
}
