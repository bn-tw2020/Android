package kr.teamcadi.kakao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 1500);
    }

    private class splashhandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), MainPage.class));
            Splash.this.finish();
        }
    }
    @Override
    public void onBackPressed(){
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못하게
    }
}