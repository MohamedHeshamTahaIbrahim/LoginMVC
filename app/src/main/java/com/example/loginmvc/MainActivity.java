package com.example.loginmvc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
private EditText username_signup;
 private EditText password_signup;
 private EditText username;
 private EditText password;
 private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username_signup=(EditText)findViewById(R.id.usernamesignup);
        password_signup=(EditText)findViewById(R.id.passsignup);
        LoginModel loginmodel=new LoginModel();
        loginmodel.setUsername(username_signup.getText().toString());
        loginmodel.setPassword(password_signup.getText().toString());
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.passsword);
        username.setText(loginmodel.getUsername());
        password.setText(loginmodel.getPassword());
        login=(Button)findViewById(R.id.login_button);
        login.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(username.getText().toString().equals(username_signup.getText().toString())&&password.getText().toString().equals(password_signup.getText().toString())){
            Toast.makeText(getApplicationContext(),"Login done"+username.getText(),Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getApplicationContext(),"please try again",Toast.LENGTH_SHORT).show();

        }
    }
}
