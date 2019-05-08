package com.example.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.os.Handler;
import android.os.Message;

import com.example.myapplication.addressAdapter;

import java.nio.Buffer;
import java.util.zip.Inflater;

public class Add_Address_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
       // View view= LayoutInflater.from(this).inflate(resourceId,parent,false);
        Button button_submit =(Button) findViewById(R.id.button_submit);
        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,Add_Address_Activity.class);
//                startActivity(intent);
//                addressAdapter MyAdapter;
//                MyAdapter=(addressAdapter) MainActivity.listView.getAdapter();
                EditText name=(EditText) findViewById(R.id.editText_name);
                EditText phone=(EditText) findViewById(R.id.editText_phone);
                ImageView picture =(ImageView) findViewById(R.id.imageView);
                address man = new address(name.getText().toString(),R.drawable.one,phone.getText().toString());
                MainActivity.addressList.add(man);
                
                Intent intent = new Intent();
               // Intent intent1 = intent.putExtra("data_return",true );
                setResult(RESULT_OK,intent);
                System.out.println("get message!!");
                finish();
            }
        });

    }

//    private void updateWeather() {
//
//
//        new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                //耗时操作，完成之后发送消息给Handler，完成UI更新；
//                mHandler.sendEmptyMessage(0);
//
//                //需要数据传递，用下面方法；
//                Message msg =new Message();
//                msg.obj = "数据";//可以是基本类型，可以是对象，可以是List、map等；
//                mHandler.sendMessage(msg);
//            }
//
//        }).start();

//    }
}
