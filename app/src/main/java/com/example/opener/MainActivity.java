package com.example.opener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button open;
EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open=findViewById(R.id.open);
        url=findViewById(R.id.url);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlText=url.getText().toString();
                Uri webpage = Uri.parse(urlText);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) == null) {
                    startActivity(intent);
                }
            }
        });
    }
}