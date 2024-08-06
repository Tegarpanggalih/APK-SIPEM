package com.sipem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    Button Login;
    Button Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Login=(Button)findViewById(R.id.bt_login);
        Exit=(Button)findViewById(R.id.bt_exit);
        Username = (EditText) findViewById(R.id.usr);
        Password = (EditText) findViewById(R.id.pwd);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();



                    if (isValidCredentials(username,password)){
                        Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
                        intent.putExtra("username", username);
                        startActivity(intent);
                        finish();
                    }else{
                        Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                    }

            }
        });

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }

    private boolean isValidCredentials(String username,String password){
        return "sipem".equals(username) && "password".equals(password);
    }



}
