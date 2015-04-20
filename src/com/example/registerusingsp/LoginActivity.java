package com.example.registerusingsp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	public void loginTrial(View v){
		EditText emailEditText,passEditText;

		String emailEntered=null;
		String passEntered=null;

		String emailSaved=null;
		String passSaved=null;


		emailEditText=(EditText)findViewById(R.id.editText1);
		passEditText=(EditText)findViewById(R.id.editText2);


		emailEntered=emailEditText.getText().toString();
		passEntered=passEditText.getText().toString();

		SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		emailSaved=sp.getString("email", "NO_VALUE");
		passSaved=sp.getString("pass", "NO_VALUE");

		if(emailSaved.equals("NO_VALUE") || passSaved.equals("NO_VALUE")){
			Toast.makeText(LoginActivity.this, "No Account Registered\n\nPlease Register before login!", Toast.LENGTH_SHORT).show();
			return;
		}

		//validation
		if(emailSaved.equalsIgnoreCase(emailEntered) && passSaved.equals(passEntered)){
			Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(), MainActivity.class));
			finish();
		}

	}

	public void showRegisterActivity(View v){
		startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
		finish();
	}
}
