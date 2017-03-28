package com.example.yo.a4week;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TabHost tabHost;
    EditText e1,e2,e3;
    Button b1,b2,b3;
    TextView result, result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
        tab1();
        tab2();

    }
    void init(){
        tabHost = (TabHost)findViewById(R.id.tabhost1);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("BIM계산기"));
        tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("면적 계산기"));

    }
    void tab1(){
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        result = (TextView)findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String t = e1.getText().toString();
                String w = e2.getText().toString();
                float bim = Float.parseFloat(w)/((Float.parseFloat(t)/100)*(Float.parseFloat(t)/100));
                if(bim < 18.5){
                    result.setText("체중 부족");
                }
                else if(bim <= 18.5 && bim > 22.9){
                    result.setText("정상");
                }
                else if(bim <= 23 && bim > 24.9){
                    result.setText("과체중");
                }
                else {
                    result.setText("비만");

                }
            }
        });



    }
    void tab2(){
        e3 = (EditText)findViewById(R.id.e3);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        result2 = (TextView)findViewById(R.id.result2);


    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.b2:
                String num = e3.getText().toString();
                float num1 = Float.parseFloat(num)* 3.3058f ;
                result2.setText(num1 +"제곱미터");
                break;
            case R.id.b3:
                String num2 = e3.getText().toString();
                float num3 = Float.parseFloat(num2)* 0.3025f ;
                result2.setText(num3 +"평");
                break;


        }
    }

}


