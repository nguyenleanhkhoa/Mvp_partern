package com.example.anhkhoa.mvp_partern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import presenter.PresenterLogin;
import view.ViewLogin;

public class MainActivity extends AppCompatActivity implements ViewLogin {
    private PresenterLogin presenterLogin;
    Button btnlogin;
    EditText edtuser,edtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenterLogin=new PresenterLogin(this);
        addControl();
        addEvent();
    }

    private void addEvent() {
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=edtuser.getText().toString();
                String password=edtpass.getText().toString();

                presenterLogin.receiveHandleLogin(username,password );
            }
        });
    }

    private void addControl() {
        btnlogin=findViewById(R.id.btnlogin);
        edtuser=findViewById(R.id.edtusername);
        edtpass=findViewById(R.id.edtpassword);
    }

    @Override
    public void LoginSuccess() {
        Toast.makeText(this, "Log in!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginFailed() {
        Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
    }
}
