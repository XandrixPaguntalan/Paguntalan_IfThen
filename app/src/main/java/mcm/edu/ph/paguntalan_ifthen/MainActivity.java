package mcm.edu.ph.paguntalan_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textlore;
        Button  buttondecision1, buttondecision2;

        textlore = findViewById(R.id.textlore);
        buttondecision1 = findViewById(R.id.buttondecision1);
        buttondecision2 = findViewById(R.id.buttondecision2);

        buttondecision1.setOnClickListener(this);
        buttondecision2.setOnClickListener(this);
        textlore = findViewById(R.id.textlore);
        textlore.setText("You are playing a MOBA game and your character is low on health. You saw an enemy who is also low health and is trying to escape. Will you chase and try to kill your enemy?");
    }
    @Override
    public void onClick(View view){

        TextView textresult = findViewById(R.id.textresult);


        switch(view.getId()){
            case R.id.buttondecision1:
            textresult.setText("You chased the enemy for 30 seconds and you were killed because of an another enemy hiding in the bush.");
            break;
        }
        switch(view.getId()){
            case R.id.buttondecision2:
            textresult.setText("You recalled back to your base to regenerate and your enemy was killed because he was chased by one of your teammates.");
            break;
        }


    }
}