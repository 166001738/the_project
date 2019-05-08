package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.*;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class addressAdapter extends ArrayAdapter<address>
{
    private int resourceId;
    public addressAdapter(final  Context context, int textViewResourceId,final List<address> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position ,View convertView , ViewGroup parent){
        address man =getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView manImage = (ImageView)  view.findViewById(R.id.address_image);
        TextView manName = (TextView) view.findViewById(R.id.address_name);
        TextView manPhone = (TextView) view.findViewById(R.id.address_phone);
        manImage.setImageResource(man.getImageID());
        manName.setText(man.getName());
        manPhone.setText(man.getPhone_number());

        return  view;
        }
}
