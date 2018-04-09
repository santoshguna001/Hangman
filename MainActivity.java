package com.example.santosh.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn1);
    }
    public void clicked(View view){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void clickedgame(View view){
        Toast.makeText(this,"Game is being developed.\nSorry for the inconvenience",Toast.LENGTH_SHORT).show();
    }
    public void clickedIns(View view){
        Intent i=new Intent(this, Main3Activity.class);
        startActivity(i);
    }
    public void onBackPressed(){
        Intent a =new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
