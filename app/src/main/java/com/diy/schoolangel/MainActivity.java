package com.diy.schoolangel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //变量***********************************************************************
    private String foodNum;
    private String apartNum;
    private String dormiNum;
    private String strname;

    //函数***********************************************************************
    public void bt_Submit_onClick(View view){
        TextView foodnum = (TextView) findViewById(R.id.et_FoodNum);
        TextView apartnum = (TextView) findViewById(R.id.et_ApartNum);
        TextView dorminum = (TextView) findViewById(R.id.et_DormiNum);
        TextView name = (TextView) findViewById(R.id.et_Name);

        foodNum = foodnum.getText().toString() ;
        apartNum = apartnum.getText().toString() ;
        dormiNum = dorminum.getText().toString() ;
        strname = name.getText().toString();
        /*Log.d("菜品编号：",foodNum);
        Log.d("楼编号：",apartNum);
        Log.d("宿舍编号：",dormiNum);
        Log.d("姓名：",strname);*/
        Bundle data=new Bundle();
        data.putString("foodNum",foodNum);
        data.putString("apartNum",apartNum);
        data.putString("dormiNum",dormiNum);
        data.putString("strname",strname);
        Intent intent=new Intent(MainActivity.this,InsertActivity.class);
        intent.putExtra("foodNum",foodNum);
        intent.putExtra("apartNum",apartNum);
        intent.putExtra("dormiNum",dormiNum);
        intent.putExtra("strname",strname);
        startActivity(intent);
    }
}
