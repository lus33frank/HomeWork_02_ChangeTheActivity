package tw.com.frankchang.houli.homework_02_changetheactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBMW, btnBENZ, btnCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //建立findViewById
        findviewer();
    }

    //findViewById 和 關聯監聽器
    void findviewer(){
        btnBMW = (Button) findViewById(R.id.button);
        btnBMW.setOnClickListener(btnOnClicker);

        btnBENZ = (Button) findViewById(R.id.button2);
        btnBENZ.setOnClickListener(btnOnClicker);

        btnCar = (Button) findViewById(R.id.button3);
        btnCar.setOnClickListener(btnOnClicker);
    }

    //建立監聽器
    View.OnClickListener btnOnClicker = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //建立意圖物件
            Intent it = new Intent();
            //設定切換的頁面
            switch (v.getId()){
                case R.id.button:
                    //BMW
                    it.setClass(MainActivity.this, BMWActivity.class);  //指定
                    break;

                case R.id.button2:
                    //BENZ
                    it.setClass(MainActivity.this, BENZActivity.class); //指定
                    break;

                case R.id.button3:
                    //Car
                    it.setAction("tw.com.frankchang.houli.homework_02_changetheactivity.Car");  //廣播
                    break;

            }
            //執行切換
            startActivity(it);
        }
    };
}
