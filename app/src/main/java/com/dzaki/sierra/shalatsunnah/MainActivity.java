package com.dzaki.sierra.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tahajjud, witir, rawatib, dhuha, tahiyatul_masjid, shalat_syuruk, istikhoroh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajjud = findViewById(R.id.tahajjud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        tahiyatul_masjid = findViewById(R.id.tahiyatul_masjid);
        shalat_syuruk = findViewById(R.id.shalat_syuruk);
        istikhoroh = findViewById(R.id.istikhoroh);

        tahajjud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        tahiyatul_masjid.setOnClickListener(this);
        shalat_syuruk.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tahajjud:
                Intent tahajjud = new Intent(MainActivity.this, Deskripsi.class);
                tahajjud.putExtra("salat", "https://wisatanabawi.com/shalat-tahajjud/");
                startActivity(tahajjud);
                break;

            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("salat", "https://bersamadakwah.net/shalat-witir");
                startActivity(witir);
                break;

            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("salat", "https://muslim.or.id/4602-tuntunan-shalat-sunnah-rawatib.html");
                startActivity(rawatib);
                break;

            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("salat", "https://muslim.or.id/44198-fikih-shalat-dhuha.html");
                startActivity(dhuha);
                break;

            case R.id.tahiyatul_masjid:
                Intent tahiyatul_masjid = new Intent(MainActivity.this, Deskripsi.class);
                tahiyatul_masjid.putExtra("salat", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                startActivity(tahiyatul_masjid);
                break;

            case R.id.shalat_syuruk:
                Intent shalat_syuruk = new Intent(MainActivity.this, Deskripsi.class);
                shalat_syuruk.putExtra("salat", "https://aitarus.com/shalat-syuruq-isyraq");
                startActivity(shalat_syuruk);
                break;

            case R.id.istikhoroh:
                Intent istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
                istikhoroh.putExtra("salat", "https://www.dream.co.id/orbit/tata-cara-istikharah-1811138.html");
                startActivity(istikhoroh);
                break;
        }

    }
}
