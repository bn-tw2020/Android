package kr.teamcadi.kakao;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.lv);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.instagram), "instagram", "this is instagram");
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.youtube), "youtube", "this is youtube");
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.facebook), "facebook", "this is facebook");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.instagram), "instagram", "this is instagram");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.youtube), "youtube", "this is youtube");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.facebook), "facebook", "this is facebook");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.instagram), "instagram", "this is instagram");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.youtube), "youtube", "this is youtube");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.facebook), "facebook", "this is facebook");

        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        // 아이템을 클릭할 때의 이벤트 리스너를 등록함
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // AdapterView : 카카오톡 화면과 같이 일정한 디자인 패턴을 갖고 있는 항목
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                // Posistion에 위치한 값을 가져와 변수에 저장하여 사용가능
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainPage.this, Detail.class);
                //intent.putExtra("profile", (Parcelable) item.getProfile());
                intent.putExtra("name", item.getName());
                intent.putExtra("short_story",item.getShort_story());
                startActivityForResult(intent, 101);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==101){
            if(data !=null){
                String result = data.getStringExtra("result");
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        }
    }
}