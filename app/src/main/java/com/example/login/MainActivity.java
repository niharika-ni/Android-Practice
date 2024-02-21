package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String orders= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Bundle mbundle=new Bundle();
        mbundle.putString("text",text.getText().toString());*/
        FragmentManager fragmag = getSupportFragmentManager();
        FragmentTransaction fragtran = fragmag.beginTransaction();
      //  frag.setArguments(mbundle);
        fragtran.add(R.id.framelayout, new Fragment_login());
        fragtran.commit();
    }
   /* public void menu(View v){
        //Bundle mbundle=new Bundle();
        //  mbundle.putString("text",text.getText().toString());
        FragmentManager fragmag = getSupportFragmentManager();
        FragmentTransaction fragtran = fragmag.beginTransaction();
        //  frag.setArguments(mbundle);
        fragtran.replace(R.id.hello, new Fragment_menu());
        fragtran.commit();*/


    public void ordercola(View view){
        orders = orders+"cola";
    }

    public void orderjuice(View view){
        orders = orders+"juice";
    }

    public void ordertea(View view){
        orders = orders+"tea";
    }

    public void orderchocolate(View view){
        orders = orders+"chocolate pastry";
    }

    public void orderstrawberry(View view){
        orders = orders+"strawberry pastry";
    }

    public void orderbutter(View view){
        orders = orders+"butterscotch pastry";
    }


    public void orderfruits(View view){
        orders = orders+"fruits";
    }

    public void orderfritters(View view){
        orders = orders+"fritters";
    }

    public void orderprotein(View view){
        orders = orders+"protein";
    }






}
