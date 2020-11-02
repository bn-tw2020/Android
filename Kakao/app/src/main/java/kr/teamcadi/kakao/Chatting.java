package kr.teamcadi.kakao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Chatting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

        Intent i = getIntent();
        TextView name = findViewById(R.id.name);
        name.setText(i.getStringExtra("name"));
    }
}