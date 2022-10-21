package com.example.appgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class User_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<User> userList;

    public User_Adapter(Context context, int layout, List<User> userList) {
        this.context = context;
        this.layout = layout;
        this.userList = userList;
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);
        // anh xa
        TextView txt_tenNhac= view.findViewById(R.id.txtTen);
        TextView txt_caSi= view.findViewById(R.id.txtDiachi);
        ImageView img = view.findViewById(R.id.imgHinh);

        User user =  userList.get(i);
        txt_tenNhac.setText(user.getTen());
        txt_caSi.setText(user.getDiachi());
        img.setImageResource(user.getImg());

        return view;
    }
}
