package com.example.project_start;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Ошибка";

    @Override //запускается при запуске программы
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast TT=Toast.makeText(getApplicationContext(),"Программа начала работу, т.е. запуск активити!(onCreate)",Toast.LENGTH_LONG);
        TT.show();
        Log.i(TAG, "onCreate");
    }

    @Override //работает после восстановление
    protected void onStart() {
        super.onStart();
        Toast TT=Toast.makeText(getApplicationContext(),"Программа снова запустилась (onStart)!",Toast.LENGTH_LONG);
        TT.show();
        Log.d(TAG, "onStart");
    }

    @Override //после функции пауза
    protected void onResume() {
        super.onResume();
        Toast TT=Toast.makeText(getApplicationContext(),"Программа восстановила работу (onResume)!",Toast.LENGTH_SHORT);
        TT.show();
        Log.e(TAG, "onResume");
    }

    @Override // пауза
    protected void onPause() {
        super.onPause();
        Toast TT=Toast.makeText(getApplicationContext(),"Программа поставилась на паузу (onPause)!",Toast.LENGTH_LONG);
        TT.show();
        Log.v(TAG, "onPause");
    }

    @Override //если человек вышел на рабочий стол и свернул приложение
    protected void onStop() {
        super.onStop();
        Toast TT=Toast.makeText(getApplicationContext(),"Программа остановилась (onStop)!",Toast.LENGTH_LONG);
        TT.show();
        Log.w(TAG, "onStop");
        if(isFinishing())
            finish();
    }

    @Override // если человек зашел обратно в приложение
    protected void onRestart() {
        super.onRestart();
        Toast TT=Toast.makeText(getApplicationContext(),"Программа перезапустилась (onRestart)!",Toast.LENGTH_LONG);
        TT.show();
        Log.i(TAG, "onRestart");
    }

    @Override //при закрытии приложения
    protected void onDestroy() {
        Toast TT=Toast.makeText(getApplicationContext(),"Программа закончила работу!",Toast.LENGTH_LONG);
        TT.show();
        Log.e(TAG, "onDestroy");
        super.onDestroy();
    }
}