package com.example.registerusingsp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		String f1= sp.getString("first","null");
		String n2= sp.getString("last","null");
		String eml= sp.getString("email","null");
		String p1= sp.getString("pass","null");
		//String p2 = sp.getString("pass2","null");
		String mn= sp.getString("month","null");
		String d= sp.getString("day","null");
		String yr= sp.getString("year","null");
		String phno= sp.getString("phone","null");
		int gen= sp.getInt("gender",0);

		((TextView)findViewById(R.id.textView1)).setText("first name :"+f1+"\nlast name: "+n2+"\nemai: l"+eml+"\npass: "+p1+"\nmonth: "+mn+"\nday: "+d+"\nyear: "+yr+"\nphone: "+phno+"\ngender: "+gen);

		Toast.makeText(getApplicationContext(),"first name"+f1+"\nlast name"+n2+"\nemail"+eml+"\n pass"+p1+"\nmonth"+mn+"\nday"+d+"\nyear"+yr+"\nphone"+phno+"\ngender"+gen,Toast.LENGTH_LONG).show();

	}
}