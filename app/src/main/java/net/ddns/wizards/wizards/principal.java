package net.ddns.wizards.wizards;

import android.content.Intent;
import android.net.http.LoggingEventHandler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class principal extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void equipos (View view){
        Intent i = new Intent(this, Equipos.class);
        startActivity(i);
        finish();
    }

    public void Asistencia (View view){
        Intent i = new Intent(this, Asistencia.class);
        startActivity(i);
        finish();
    }

    public void jugadores (View view){
        Intent i = new Intent(this, Jugadores.class);
        startActivity(i);
        finish();
    }

    public void Horario (View view){
        Intent i = new Intent(this, Horario.class);
        startActivity(i);
        finish();
    }

    public void Historial (View view){
        Intent i = new Intent(this, Historial.class);
        startActivity(i);
        finish();
    }

    public void canastas (View view){
        Intent i = new Intent(this, Canastas.class);
        startActivity(i);
        finish();
    }

    public void reglamento (View view){
        Intent i = new Intent(this, Reglamento.class);
        startActivity(i);
        finish();
    }

    public void reglamento2 (View view){
        Intent i = new Intent(this, Reglamento2.class);
        startActivity(i);
        finish();
    }
    public void login (View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
        finish();
    }

}
