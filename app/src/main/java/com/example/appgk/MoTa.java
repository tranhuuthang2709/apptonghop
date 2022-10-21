package com.example.appgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MoTa extends AppCompatActivity {
    TextView txt_ten,txt_diachi,txt_sdt, txt_email;
    ImageView imgAnhmota;
    Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta);
        imgAnhmota =(ImageView) findViewById(R.id.img_mota) ;
        txt_ten =(TextView) findViewById(R.id.txt_ten) ;
        txt_diachi =(TextView) findViewById(R.id.txt_diachi) ;
        txt_sdt =(TextView) findViewById(R.id.txt_sdt);
        txt_email =(TextView) findViewById(R.id.txt_email);
        button_back = (Button) findViewById(R.id.button_back);
        Intent intent  = getIntent();
        imgAnhmota.setImageResource(intent.getIntExtra("key1",0));
        txt_ten.setText(intent.getStringExtra("key2"));
        txt_diachi.setText(intent.getStringExtra("key3"));
        txt_sdt.setText(intent.getStringExtra("key4"));
        txt_email.setText(intent.getStringExtra("key5"));

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MoTa.this, Home.class));
            }
        });
    }
}