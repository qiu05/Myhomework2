package sn170507180105.home.android.sdwu.edu.cn.myhomework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }

    public void hm01Activity(View view) {
        Intent intent = new Intent(this,hm01Activity.class);
        startActivity(intent);
    }
}

