package com.example.kushtimusprime.cbusofficialtrialtwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_screen);
    }
    /**
     * @param view: Something required for this according to a tutorial
     * Method opens a blank sign in page
     */

    public void openSignInPage(View view) {
        Intent signInPage=new Intent(this,SignInPageActivity.class);
        startActivity(signInPage);
    }
    public void openSignUpPage(View view) {
        Intent signUpPage=new Intent(this,SignUpPageActivity.class);
        startActivity(signUpPage);
    }
}
