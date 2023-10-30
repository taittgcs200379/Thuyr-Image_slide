package com.example.uimage_show_cw2;
import static com.example.uimage_show_cw2.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView img;
    private static  Button previous, next;
    private int image=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img= findViewById(R.id.show_image);
        next=findViewById(R.id.button2);
        previous=findViewById(R.id.button);

        setImageResource(image);
        previousClick();
        nextClick();
    }

    private void previousClick() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image<4)
                {
                    image++;
                    setImageResource(image);
                }

            }
        });

    }
    private void nextClick() {
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image>1) {
                    image--;
                    setImageResource(image);
                }
            }
        });
    }


    private void setImageResource(int index) {

        switch (index) {
            case 1:
                img.setImageResource(R.drawable.image1);
                break;
            case 2:
                img.setImageResource(R.drawable.image2);
                break;
            case 3:
                img.setImageResource(R.drawable.image3);
                break;
            case 4:
                img.setImageResource(R.drawable.image4);
                break;

        }
    }

}