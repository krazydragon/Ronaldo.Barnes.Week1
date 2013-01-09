package com.java1.ronaldo.barnes.week1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	LinearLayout llayout;
	LinearLayout.LayoutParams lparams;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        llayout = new LinearLayout(this);
        llayout.setOrientation(LinearLayout.VERTICAL);
        lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        llayout.setLayoutParams(lparams);
        
        TextView tview = new TextView(this);
        tview.setText("Test");
        
        llayout.addView(tview);
        setContentView(llayout);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
