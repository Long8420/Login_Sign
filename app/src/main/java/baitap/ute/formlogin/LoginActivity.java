package baitap.ute.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        img = findViewById(R.id.gotoback);
    }

    public void gotoback(View view) {
        Intent ic = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(ic);
    }
}