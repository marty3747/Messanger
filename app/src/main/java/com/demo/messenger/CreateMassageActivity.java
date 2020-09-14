package com.demo.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMassageActivity extends AppCompatActivity {

    private EditText editTextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMsg = findViewById(R.id.editTextMessage); // создали доступ к Edittext, и можем получить сообщение пользователя
    }

    public void onClickSendMag(View view) {
        String msg = editTextMsg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND); // сказали Андроид что нам нужна активность для передачи сообщений
        intent.setType("text/plain"); // установили тип передаваемого сообщения(передаем простой текст)
        intent.putExtra(Intent.EXTRA_TEXT, msg); // определение того, какая будет у нас информация
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(chosenIntent);
//        Intent intent = new Intent(this, ReceivedMassageActivity.class);
//        intent.putExtra("msg", msg); // теперь CreateMassageActivity отправляет не просто интент, а сообщение
//        startActivity(intent);
    }
}
