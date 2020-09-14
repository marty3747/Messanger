package com.demo.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMassageActivity extends AppCompatActivity {
    private TextView textViewReceivedMsg; // создание ссылки для получения доступа к элементу формы
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_massage);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg); // получили доступ к элементу формы
        Intent intent = getIntent(); // получили интент, который вызвал данную активность
        String msg = intent.getStringExtra("msg"); // получение содержимого строки по ключу от CreateMassageActivity
        textViewReceivedMsg.setText(msg); // отправка нашего текста в TextView
    }
}
