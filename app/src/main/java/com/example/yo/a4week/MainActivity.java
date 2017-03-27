package com.example.yo.a4week;

import android.graphics.Color;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    LinearLayout groud,l1,l2;
    ImageView chick, spa;
    TextView t1, t2;
    Matrix matrix;
    int turn = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        groud = (LinearLayout)findViewById(R.id.groud);
        l1 = (LinearLayout)findViewById(R.id.l1);
        l2 = (LinearLayout)findViewById(R.id.l2);
        chick = (ImageView)findViewById(R.id.chick);
        spa = (ImageView)findViewById(R.id.spa);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.manu1,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mnuBlue:
                groud.setBackgroundColor(Color.BLUE);
                break;
            case R.id.mnuRed:
                groud.setBackgroundColor(Color.RED);
                break;
            case R.id.mnuYellow:
                groud.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.mnuturn:
                chick.setRotation(turn);
                spa.setRotation(turn);
                turn = turn +30;
                if(turn == 360){
                    turn = 0;
                }

                break;
            case R.id.mnuname:

                if(item.isChecked()){
                    t1.setVisibility(View.INVISIBLE);
                    t2.setVisibility(View.INVISIBLE);
                    item.setChecked(false);
                }
                else{
                    t1.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);
                    item.setChecked(true);
                }

                break;
            case R.id.mnubig:
                if(item.isChecked() == false) {
                    chick.setScaleX(2);
                    chick.setScaleY(2);
                    spa.setScaleX(2);
                    spa.setScaleY(2);
                    item.setChecked(true);
                }
                else{
                    chick.setScaleX(1);
                    chick.setScaleY(1);
                    spa.setScaleX(1);
                    spa.setScaleY(1);
                    item.setChecked(false);
                }
                break;

            case R.id.mnuspa:
                l1.setVisibility(View.GONE);
                l2.setVisibility(View.VISIBLE);
                item.setChecked(true);
                break;
            case R.id.mnuchick:
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                item.setChecked(true);

                break;



        }
        return super.onOptionsItemSelected(item);
    }
}
