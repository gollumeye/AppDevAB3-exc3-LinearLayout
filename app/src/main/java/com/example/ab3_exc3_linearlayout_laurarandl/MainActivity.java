package com.example.ab3_exc3_linearlayout_laurarandl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int display_height = displayMetrics.heightPixels;
        int display_width = displayMetrics.widthPixels;

        LinearLayout linearLayout1 = findViewById(R.id.LinearLayoutHorizontal1);
        linearLayout1.getLayoutParams().height=display_height/3-3*50;
        linearLayout1.requestLayout();

        LinearLayout linearLayout2 = findViewById(R.id.LinearLayoutHorizontal2);
        linearLayout2.getLayoutParams().height=50;
        linearLayout2.requestLayout();

        LinearLayout linearLayout3 = findViewById(R.id.LinearLayoutHorizontal3);
        linearLayout3.getLayoutParams().height=display_height/3-3*50;
        linearLayout3.requestLayout();

        LinearLayout linearLayout4 = findViewById(R.id.LinearLayoutHorizontal4);
        linearLayout4.getLayoutParams().height=50;
        linearLayout4.requestLayout();

        LinearLayout linearLayout5 = findViewById(R.id.LinearLayoutHorizontal5);
        linearLayout5.getLayoutParams().height=display_height/3-3*50;
        linearLayout5.requestLayout();

        LinearLayout linearLayout6 = findViewById(R.id.LinearLayoutHorizontal6);
        linearLayout6.getLayoutParams().height=50;
        linearLayout6.requestLayout();

        ImageView image1 = findViewById(R.id.imageView);
        image1.getLayoutParams().height=display_height/3-3*50;
        image1.getLayoutParams().width=display_width/3;
        image1.requestLayout();

        ImageView image2 = findViewById(R.id.imageView2);
        image2.getLayoutParams().height=display_height/3-3*50;
        image2.getLayoutParams().width=display_width/3;
        image2.requestLayout();

        ImageView image3 = findViewById(R.id.imageView3);
        image3.getLayoutParams().height=display_height/3-3*50;
        image3.getLayoutParams().width=display_width/3;
        image3.requestLayout();

        ImageView image4 = findViewById(R.id.imageView4);
        image4.getLayoutParams().height=display_height/3-3*50;
        image4.getLayoutParams().width=display_width/3;
        image4.requestLayout();

        ImageView image5 = findViewById(R.id.imageView5);
        image5.getLayoutParams().height=display_height/3-3*50;
        image5.getLayoutParams().width=display_width/3;
        image5.requestLayout();

        ImageView image6 = findViewById(R.id.imageView6);
        image6.getLayoutParams().height=display_height/3-3*50;
        image6.getLayoutParams().width=display_width/3;
        image6.requestLayout();

        ImageView image7 = findViewById(R.id.imageView7);
        image7.getLayoutParams().height=display_height/3-3*50;
        image7.getLayoutParams().width=display_width/3;
        image7.requestLayout();

        ImageView image8 = findViewById(R.id.imageView8);
        image8.getLayoutParams().height=display_height/3-3*50;
        image8.getLayoutParams().width=display_width/3;
        image8.requestLayout();

        ImageView image9 = findViewById(R.id.imageView9);
        image9.getLayoutParams().height=display_height/3-3*50;
        image9.getLayoutParams().width=display_width/3;
        image9.requestLayout();

        TextView textView1 = findViewById(R.id.textView);
        textView1.setWidth(display_width/3);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setWidth(display_width/3);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setWidth(display_width/3);
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setWidth(display_width/3);
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setWidth(display_width/3);
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setWidth(display_width/3);
        TextView textView7 = findViewById(R.id.textView7);
        textView7.setWidth(display_width/3);
        TextView textView8 = findViewById(R.id.textView8);
        textView8.setWidth(display_width/3);
        TextView textView9 = findViewById(R.id.textView9);
        textView9.setWidth(display_width/3);
    }
}