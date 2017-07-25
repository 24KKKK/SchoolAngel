package com.diy.schoolangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InsertActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = getIntent();
                Bundle b = intent.getExtras();
                String foodNum = b.getString("foodNum");
                String apartNum = b.getString("apartNum");
                String dormiNum = b.getString("dormiNum");
                String strname = b.getString("strname");
                InsertData insertData = new InsertData();
                insertData.insertData(apartNum, dormiNum, strname, foodNum);
            }
        }).start();
    }
}
