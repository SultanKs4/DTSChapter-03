package polinema.ac.id.dtschapter03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }
    public void postChangePassword(View view){
        Intent i = new Intent(ResetPassword.this, success.class);
        startActivity(i);
    }
}
