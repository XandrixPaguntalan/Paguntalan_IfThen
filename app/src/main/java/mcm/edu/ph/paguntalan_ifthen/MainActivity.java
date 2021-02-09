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
        textlore.setText("It's already past your bed time and you are having fun playing games. Will you continue to play games for 2 more hours?");
    }
    @Override
    public void onClick(View view){

        TextView textresult = findViewById(R.id.textresult);


        switch(view.getId()){
            case R.id.buttondecision1:
            textresult.setText("Your mother caught you playing games past your bed time and confiscated all your gadgets.");
            break;
        }
        switch(view.getId()){
            case R.id.buttondecision2:
            textresult.setText("Your mother almost caught you playing games past your bed time.");
            break;
        }


    }
}