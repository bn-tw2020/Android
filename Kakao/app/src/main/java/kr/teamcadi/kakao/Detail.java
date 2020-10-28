package kr.teamcadi.kakao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    private int img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        //ImageView profile = (ImageView) findViewById(R.id.profile);
        TextView name = (TextView) findViewById(R.id.name);
        TextView short_story = (TextView) findViewById(R.id.short_story);

        //img=Integer.parseInt(intent.getStringExtra("profile"));
        //profile.setImageResource(img);
        name.setText(intent.getStringExtra("name"));
        short_story.setText(intent.getStringExtra("short_story"));


    }
}