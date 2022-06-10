package com.example.kyrsach2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lager);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void polez(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("помогает организму противостоять проникновению болезнетворных бактерий и вирусов;\n" +
                "стимулирует работу пищеварительной системы, вызывает аппетит;\n" +
                "в некоторой степени снижает болевые ощущения;\n" +
                "повышает настроение;\n" +
                "благотворно влияет на работу кровеносного русла;\n" +
                "повышает двигательную способность суставов, связок, сухожилий и прочность костей;\n" +
                "пенная шапка используется как омолаживающее средство от мимических морщин;\n" +
                "ополаскивания с ним прекрасно тонизируют и укрепляют волосы. ");
    }

    public void info(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("Все виды пива можно разделить на две группы: низового и верхового брожения. Лагер относится к первой группе: это пиво бродит при температуре от 5 до 15 градусов, а в некоторых случаях даже при 0, тогда как пиво верхнего бродит при 15-25.");
    }

    public void vred(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("взывает стойкую зависимость;\n" +
                "благодаря содержащимся в нем растительным гормонам может превратить мужскую фигуру в женоподобную;\n" +
                "снижает потенцию и увеличивает риск бесплодия.\n ");
    }
}