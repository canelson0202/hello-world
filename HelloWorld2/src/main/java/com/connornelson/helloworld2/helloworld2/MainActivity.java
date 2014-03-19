package com.connornelson.helloworld2.helloworld2;

import android.content.res.ColorStateList;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button worldClass, ohMyDays, bikeIt;
    TextView textView;
    public int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect button to xml
        worldClass = (Button) findViewById(R.id.button);
        ohMyDays = (Button) findViewById(R.id.button2);
        bikeIt = (Button) findViewById(R.id.button3);

        worldClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonOnClick(view);
            }
        });

        ohMyDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2OnClick(view);
            }
        });

        bikeIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3OnClick(view);
            }
        });

    }

    @Override
    //not important
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    //not important
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void buttonOnClick(View v) {

        Button b = (Button) v;

        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(Integer.toString(++total));

        MediaPlayer mp = MediaPlayer.create(this, R.raw.world_class);

        try {
            mp.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void button2OnClick(View v) {

        Button b = (Button) v;

        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(Integer.toString(++total));

        MediaPlayer mp = MediaPlayer.create(this, R.raw.oh_my_days);

        try {
            mp.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void button3OnClick(View v) {

        Button b = (Button) v;

        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText(Integer.toString(++total));

        MediaPlayer mp = MediaPlayer.create(this, R.raw.bicycle_kick);

        try {
            mp.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
