package com.example.myapplication;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<address> addressList = new ArrayList<address>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initaddress();//初始化,传入数据
        updata();
        Button button_add = (Button) findViewById(R.id.button_Add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Add_Address_Activity.class);
                startActivityForResult(intent,1);
            }
        });

        Button button_find = (Button) findViewById(R.id.button_Find);
        button_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Find_Address_Activity.class);
                startActivity(intent);
            }
        });


    }

    private void initaddress() {
        // return;
        //for (int i)
        address one = new address("One", R.drawable.one, "123456");
        address two = new address("Two", R.drawable.two, "123321");
        address three = new address("Three", R.drawable.three, "76865678");
        address four = new address("Four", R.drawable.four, "456345346");
        address five = new address("Five", R.drawable.five, "55555555");
        addressList.add(one);
        addressList.add(two);
        addressList.add(three);
        addressList.add(four);
        addressList.add(five);
        return;
    }

    @Override
    protected void  onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case  1:
            if(resultCode == RESULT_OK) {
                 updata();
                 Log.d("MainActivity","yes");
                 System.out.println("get message = =!!");
                 break;
            }
                default:
        }

    }
//    public static  Handler mHandler = new Handler() {
//
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            switch (msg.what) {
//                case 0:
//                    //完成主界面更新,拿到数据
//                    address data = (address) msg.obj;
//                    addressList.add(data);
//                    updata();
//                    break;
//                default:
//                    break;
//            }
//        }
//
//    };
    private void updata() {
        addressAdapter MyAdapter = new addressAdapter(MainActivity.this, R.layout.address_item, addressList);
        //addressAdapter adapter = new addressAdapter(MainActivity.this,R.layout.address_item,addressList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(MyAdapter);
        //setContentView(R.layout.activity_main);
    }


}
