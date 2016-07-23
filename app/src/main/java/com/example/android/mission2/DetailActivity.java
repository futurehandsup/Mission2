package com.example.android.mission2;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleText = (TextView)findViewById(R.id.textView);
        TextView descText = (TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();

        titleText.setText(intent.getStringExtra("item1"));
        descText.setText(intent.getStringExtra("item2"));

        // ActionBar에 타이틀 변경
        getSupportActionBar().setTitle(intent.getStringExtra("item1"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    @Override
    public boolean onSupportNavigateUp()
    {
        Log.d("클릭", "클릭됨");
        return super.onSupportNavigateUp();
    }
}
