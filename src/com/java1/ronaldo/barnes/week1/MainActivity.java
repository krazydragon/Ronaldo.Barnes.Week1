package com.java1.ronaldo.barnes.week1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	LinearLayout lLayout;
	LinearLayout.LayoutParams lParams;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        lLayout = new LinearLayout(this);
        lLayout.setOrientation(LinearLayout.VERTICAL);
        lParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        lLayout.setLayoutParams(lParams);
        
        TextView tview = new TextView(this);
        tview.setText(getString(R.string.test));
        
        lLayout.addView(tview);
        
        EditText eText = new EditText(this);
        eText.setHint(getString(R.string.test)); 
        
        
        Button b = new Button(this);
        b.setText(getString(R.string.test));
        
        
        
        LinearLayout side = new LinearLayout(this);
        
        side.setOrientation(LinearLayout.HORIZONTAL);
        side.setLayoutParams(lParams);
        side.addView(eText);
        side.addView(b);
        
        lLayout.addView(side);
        
        setContentView(lLayout);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
