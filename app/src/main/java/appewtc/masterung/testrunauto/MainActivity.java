package appewtc.masterung.testrunauto;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int timeAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runLoop();

    }   // Main Method

    private void runLoop() {

        Log.d("Test", "Time ==> " + addTime());

        Loop();

    }

    private void Loop() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                runLoop();
            }
        }, 1000);
    }

    private String addTime() {

        timeAnInt += 1;

        return Integer.toString(timeAnInt);
    }

}   // Main Class
