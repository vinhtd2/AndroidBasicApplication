package com.example.jake.androidbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView)findViewById(R.id.listView);

        final ArrayList<UserAccount> userList = new ArrayList<UserAccount>();
        userList.add(new UserAccount("Vinh", "Front-end developer"));
        userList.add(new UserAccount("Big Khiem", "Android developer"));
        userList.add(new UserAccount("Small Khiem", "Front-end developer"));
        userList.add(new UserAccount("Dat", "Full-stack developer"));
        userList.add(new UserAccount("Hao", "Business Analyst"));
        userList.add(new UserAccount("Nhat", "Designer"));
        userList.add(new UserAccount("Phong", "Tester Enginer"));
        userList.add(new UserAccount("Link", "CEO"));
        userList.add(new UserAccount("Gab", "CTO"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));
        userList.add(new UserAccount("Hara", "Captain America"));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                UserAccount userAccount = (UserAccount) adapterView.getItemAtPosition(i);
//                Log.i("WTF", "name = " + userAccount.getUserName())

                Intent intent = new Intent(MainActivity.this, UserDetailActivity.class);
                UserAccount userAccount = (UserAccount) adapterView.getItemAtPosition(i);
                intent.putExtra("hello name", userAccount.getUserName());
                intent.putExtra("hello job", userAccount.getUserJob());
                startActivity(intent);
            }
        });

        CustomAdapter customAdapter = new CustomAdapter(userList, this);
        listView.setAdapter(customAdapter);
    }
}
