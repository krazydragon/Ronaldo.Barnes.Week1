package com.java1.ronaldo.barnes.week1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	LinearLayout lLayout;
	LinearLayout.LayoutParams lParams;
	Boolean goodGuess;
	EditText eText;
	TextView answer;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        lLayout = new LinearLayout(this);
        lLayout.setOrientation(LinearLayout.VERTICAL);
        lParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lLayout.setLayoutParams(lParams);
        
        TextView tview = new TextView(this);
        tview.setText(getString(R.string.main_text));
        
        lLayout.addView(tview);
        
        eText = new EditText(this);
        eText.setHint(getString(R.string.editText_hint)); 
        
        
        Button b = new Button(this);
        b.setText("Pick");
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int magic = Integer.parseInt(eText.getText().toString());
				answer.setText("Wait for it...");
				for (int i = 0; i < magic; i++)
				{
					/// a delay that is too fast to see
				}
				answer.setText(compareNumbers(magic));
			}
		}); 
        	
        	
        
        
        
        LinearLayout side = new LinearLayout(this);
        
        side.setOrientation(LinearLayout.HORIZONTAL);
        side.setLayoutParams(lParams);
        side.addView(eText);
        side.addView(b);
        
        lLayout.addView(side);
        answer = new TextView(this);
        lLayout.addView(answer);
        
        setContentView(lLayout);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    String compareNumbers(int inputedNumber)
    {
    	String result = null; 
    	if(inputedNumber == getResources().getInteger(R.integer.random_num) )
    	{
    		result = "I knew your number was 7!";
    		goodGuess = true;
    		return result;
    	}
    	else
    		result = "Why did you change your number from 7?";
    		goodGuess = false;
    		
		return result;

    		
    }
    
}
