package com.example.android.mission2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.TwoLineListItem;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView                m_ListView;
    private SimpleAdapter           m_Adapter;
    ArrayList<HashMap<String,String>> itemList = new ArrayList<HashMap<String,String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Android에서 제공하는 string 문자열 하나를 출력 가능한 layout으로 어댑터 생성
        m_Adapter = new SimpleAdapter(getApplicationContext(), itemList, R.layout.list_item_black,
                new String[]{"item1", "item2"}, new int[]{R.id.ListTextTitle, R.id.ListTextItem});


        // Xml에서 추가한 ListView 연결
        m_ListView = (ListView) findViewById(R.id.listView);

        // ListView에 어댑터 연결
        m_ListView.setAdapter(m_Adapter);

        m_ListView.setEmptyView((TextView)findViewById(R.id.emptytextview));

        // ListView 아이템 터치 시 이벤트 추가
        //m_ListView.setOnItemClickListener(onClickListItem);


    }
    public void onClickImageSaveButton(View view) {
        EditText titleText = (EditText) findViewById(R.id.editText1);
        EditText subText   = (EditText) findViewById(R.id.editText2);

        HashMap<String, String> item = new HashMap<String, String>();
        item.put("item1", titleText.getText().toString());
        item.put("item2", subText.getText().toString());
        itemList.add(item);
        m_ListView.setAdapter(m_Adapter);

        //Init EditText
        titleText.setText("");
        subText.setText("");
    }

}



