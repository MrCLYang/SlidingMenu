package com.example.yangchenglei.twelfday_slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private SlidingMenu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu= (SlidingMenu) findViewById(R.id.sm);
    }
    public void clickTab(View view){
        String text = ((TextView) view).getText().toString();
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();

        menu.toggle();
    }
    public void clickback(View view){
        menu.toggle();
    }
}
