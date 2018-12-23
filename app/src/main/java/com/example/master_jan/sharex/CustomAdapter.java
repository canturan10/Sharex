package com.example.master_jan.sharex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<BeanClass> beanClassArrayList;


    public CustomAdapter(Context context, ArrayList<BeanClass> beanClassArrayList) {
        this.context = context;
        this.beanClassArrayList = beanClassArrayList;


    }

    @Override
    public int getCount() {
        return beanClassArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return beanClassArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHoder viewHoder;
        if (convertView == null) {

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_listview_messages, parent, false);

            viewHoder = new ViewHoder();


            viewHoder.image = convertView.findViewById(R.id.iv_icon);
            viewHoder.title = convertView.findViewById(R.id.tv_msg_name);
            viewHoder.description = convertView.findViewById(R.id.tv_msg_des);


            convertView.setTag(viewHoder);

        } else {
            viewHoder = (ViewHoder) convertView.getTag();
        }


        BeanClass beanClass = (BeanClass) getItem(position);

        viewHoder.title.setText(beanClass.getTitle());

        return convertView;

    }


    private class ViewHoder {

        ImageView image;
        TextView title;
        TextView description;


    }


}


