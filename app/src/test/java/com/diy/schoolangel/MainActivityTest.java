package com.diy.schoolangel;

import android.view.View;

import org.junit.Test;

/**
 * Created by diy on 2017-07-25.
 */

public class MainActivityTest
{
    @Test
    public void bt_Submit_onClickTest(){
        View view=null;
        MainActivity mainActivity = new MainActivity();
        mainActivity.bt_Submit_onClick(view);
    }
}
