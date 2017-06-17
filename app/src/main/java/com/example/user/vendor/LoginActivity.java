package com.example.user.vendor;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void gotoProductsListActivity(View view){
        EditText e1;
        EditText e2;
        e1 = (EditText) findViewById(R.id.edit_login_password);
        e2 = (EditText) findViewById(R.id.edit_login_username);
        if (e1.equals(e2)){
            Intent intent= new Intent(this,ProductsListActivity.class);
        startActivity(intent);
        }
    }
}

