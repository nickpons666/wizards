package net.ddns.wizards.wizards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Equipos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);
    }

    public void principal (View view){
        Intent i = new Intent(this, principal.class);
        startActivity(i);
        finish();
    }





}
