package com.diy.schoolangel;

import Bean.DBBean;

/**
 * Created by diy on 2017-07-25.
 */

public class InsertData
{
    public void insertData(String apartNum,String dormiNum,String strName,String foodNum) {

        int intApartNum = Integer.parseInt(apartNum);
        int intDormiNum = Integer.parseInt(dormiNum);
        int intFoodNum = Integer.parseInt(foodNum);
        System.out.println("四项信息："+intApartNum+","+intDormiNum+","+strName+","+intFoodNum);
        DBBean dbBean = new DBBean();
        System.out.println("dbBean.conn:"+dbBean.conn);
        String insertSQL = "insert into table_order (apartment,dorm,name,foodnum) values " +
                "("+intApartNum+","+intDormiNum+","+"'"+strName+"'"+","+intFoodNum+");";
        //Log.d("数据插入语句：",insertSQL);
        dbBean.executeUpdate(insertSQL);
        //dbBean.close();
    }
}
