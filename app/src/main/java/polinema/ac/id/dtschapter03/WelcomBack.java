package polinema.ac.id.dtschapter03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_back);
    }

    public void clickForgot (View view){
        Intent i = new Intent(WelcomBack.this, ForgotPassword.class);
        startActivity(i);
    }

    public void postLogin (View view){
        Intent i = new Intent(WelcomBack.this, success.class);
        startActivity(i);
    }
}
