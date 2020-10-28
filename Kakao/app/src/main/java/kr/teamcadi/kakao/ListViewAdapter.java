package kr.teamcadi.kakao;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자를 만들어 줍니다.
public class ListViewAdapter extends BaseAdapter {

    private ArrayList<ListViewItem> listviewItemList = new ArrayList<ListViewItem>();
    @Override
    public int getCount() {
        return listviewItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return listviewItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        ViewHolder viewHolder;

        if(convertView ==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tx1 = convertView.findViewById(R.id.name);
            viewHolder.tx2 = convertView.findViewById(R.id.short_story);
            viewHolder.img1 = convertView.findViewById(R.id.profile);
            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ListViewItem listViewItem = listviewItemList.get(i);
        viewHolder.tx1.setText(listViewItem.getName());
        viewHolder.tx2.setText(listViewItem.getShort_story());
        viewHolder.img1.setImageDrawable(listViewItem.getProfile());

        return convertView;
    }

    public void addItem(Drawable icon, String title, String desc)
    {
        ListViewItem item = new ListViewItem(); // 하나의 리스트 항목을 하나의 객체로 간주함

        item.setProfile(icon);
        item.setName(title);
        item.setShort_story(desc);

        listviewItemList.add(item);
    }
}
