package net.ddns.wizards.wizards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Reglamento extends AppCompatActivity {
    ImageView imageView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_reglamento);

            imageView = (ImageView)findViewById(R.id.imageView1);
            PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
            photoView.update();
        }

        public void principal(View view) {
            Intent i = new Intent(this, principal.class);
            startActivity(i);
            finish();
        }
    }