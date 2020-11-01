package kr.teamcadi.kakao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button chat = (Button) findViewById(R.id.chat);
        Button back = (Button) findViewById(R.id.back);

        // 대화하기 버튼 클릭 시
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //뒤로 가기 버튼
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnToMain();
            }
        });
    }
    public void returnToMain(){
        Intent i = new Intent();
        i.putExtra("result","리스트로 돌아왔습니다.");
        setResult(RESULT_OK, i);
        finish();
    }
}