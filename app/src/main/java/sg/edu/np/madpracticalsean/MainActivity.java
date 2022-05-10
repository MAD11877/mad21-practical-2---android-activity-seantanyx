package sg.edu.np.madpracticalsean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button followBtn = findViewById(R.id.button1);

        User newUser = new User("Hello World!", "Lorem Ipsum" , 000, false);
        if (newUser.followed == true){
            followBtn.setText("Unfollow");
            newUser.followed = false;
        }
        else if (newUser.followed == false){
            followBtn.setText("Follow");
            newUser.followed = true;
        }

        followBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (newUser.followed == true){
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }}
