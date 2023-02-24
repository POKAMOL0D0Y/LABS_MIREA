package com.example.project_start;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Ошибка";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView)findViewById(R.id.Pharmacology);
        String str = getResources().getString(R.string.app_name);
        text.setText(str);

        ImageView image = (ImageView)findViewById(R.id.imageView2);
        Drawable draw = getResources().getDrawable(R.drawable.___________2);
        image.setImageDrawable(draw);

        //Button registration = (Button)findViewById(R.id.accepted);
       // registration.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Log.i(TAG, "Accepted");
            //}
        //});
    }

    public void onMenuClick(View view) {
        Log.i(TAG, "Accepted");
    }
}