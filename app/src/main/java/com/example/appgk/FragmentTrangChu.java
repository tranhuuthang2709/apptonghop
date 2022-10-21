package com.example.appgk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentTrangChu extends Fragment {
        private ListView listView;
        private User_Adapter adapter;
        private ArrayList<User> userList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_trang_chu,container,false);
        listView= view.findViewById(R.id.listview);
        userList = new ArrayList<>();
        userList.add(new User("Nguyễn Cẩm Tú",R.drawable.c,"Địa chỉ: Hà Nội","Số điện thoại:01365486889","Email:nguyencamtu@gmail.com"));
        userList.add(new User("Trần Thảo Ngọc",R.drawable.b,"Địa chỉ:Hải Phòng","Số điện thoại:0168298486","Email:tranthaongoc@gmail.com"));
        userList.add(new User("Trần Ngọc Thảo",R.drawable.a,"Địa chỉ:Hà Giang","Số điện thoại:016842466879","Email:tranngocthao@gmail.com"));
        userList.add(new User("Đỗ Thảo Nguyên",R.drawable.d,"Địa chỉ:Quảng Trị","Số điện thoại:06846468466","Email:dothaonguyen@gmail.com"));
        userList.add(new User("Trần Thu Trang",R.drawable.e,"Địa chỉ:Quảng Bình","Số điện thoại:065416846324","Email:tranthutrang@gmail.com"));
        userList.add(new User("Lê Kim Chi",R.drawable.f,"Địa chỉ:Nghệ An","Số điện thoại:0068418781","Email:lekimchi@gmail.com"));
        userList.add(new User("Trần Phúc Ngân",R.drawable.g,"Địa chỉ:Hà Tĩnh","Số điện thoại:06761268764","Email:tranphucngan@gmail.com"));
        adapter= new User_Adapter(getContext(),R.layout.custom_item,userList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTa.class);
                intent.putExtra("key1",userList.get(i).getImg());
                intent.putExtra("key2",userList.get(i).getTen());
                intent.putExtra("key3",userList.get(i).getDiachi());
                intent.putExtra("key4",userList.get(i).getSdt());
                intent.putExtra("key5",userList.get(i).getEmail());
                startActivity(intent);
            }
        });



        return view;
    }
}