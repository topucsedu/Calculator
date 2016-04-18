package com.notun_bekar.calculator;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

	EditText operand1,operand2;
	TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        operand1=(EditText) findViewById(R.id.et1);
        operand2=(EditText) findViewById(R.id.et2);
        operand1.setTextColor(Color.WHITE);
        operand2.setTextColor(Color.WHITE);
        textResult=(TextView) findViewById(R.id.tv1);
        
    }
    public void addition(View view)
    {
    	String inputStr1=operand1.getText().toString();
    	String inputStr2=operand2.getText().toString();
    	if(!inputStr1.equals("") && !inputStr2.equals(""))
    	{
    		Double input1=Double.parseDouble(inputStr1);
    		Double input2=Double.parseDouble(inputStr2);
    		Double result=input1+input2;
    		textResult.setText("Result= "+result);
    	}
    	else{
    		textResult.setText("Please input both the operands");
    	}
    	
    }
    public void subtraction(View view)
    {
    	String inputStr1=operand1.getText().toString();
    	String inputStr2=operand2.getText().toString();
    	if(!inputStr1.equals("") && !inputStr2.equals(""))
    	{
    		Double input1=Double.parseDouble(inputStr1);
    		Double input2=Double.parseDouble(inputStr2);
    		Double result=input1-input2;
    		textResult.setText("Result= "+result);
    	}
    	else{
    		textResult.setText("Please input both the operands");
    	}
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
