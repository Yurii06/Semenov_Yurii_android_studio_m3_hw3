package com.geektech.semenov_yurii_android_studio_m3_hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geektech.semenov_yurii_android_studio_m3_hw3.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListNames = new ArrayList<>();

    ContactAdapter adapter;

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        contactName();
        adapterContact();
    }

    private void contactName() {
        arrayListNames.add("Семёнов Юрий");
        arrayListNames.add("Заиров Николай");
        arrayListNames.add("Майснер Кирилл");
        arrayListNames.add("Мищенко Максим");
        arrayListNames.add("Балабанов Сергей");
        arrayListNames.add("Осипов Артём");
        arrayListNames.add("Цетиев Дени");
        arrayListNames.add("Джакыпов Эльдар");
        arrayListNames.add("Гайдина Марина");
        arrayListNames.add("Ибрагимова Алина");
        arrayListNames.add("Шевченко Кристина");
        arrayListNames.add("Кошкина Яна");
    }

    private void adapterContact(){
        adapter = new ContactAdapter(arrayListNames);
        recyclerView.setAdapter(adapter);
    }

    private void findView(){
        recyclerView = findViewById(R.id.recyclerView);
    }
}