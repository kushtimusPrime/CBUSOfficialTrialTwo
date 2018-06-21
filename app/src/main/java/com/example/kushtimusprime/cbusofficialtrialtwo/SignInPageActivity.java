package com.example.kushtimusprime.cbusofficialtrialtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignInPageActivity extends AppCompatActivity {

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);
    }
    /*
    Allows for Logins to occur
 */
    public void loginTry(View view) {
        username=(EditText)findViewById(R.id.userNameEditText);
        password=(EditText)findViewById(R.id.passwordEditText);
        if(username.getText().toString().equals("username")&&password.getText().toString().equals("password")) {
            Toast.makeText(this,"You got it",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"You failed it",Toast.LENGTH_SHORT).show();

        }
    }
}
