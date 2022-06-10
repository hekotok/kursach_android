package com.example.kyrsach2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class medovyx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medovyx);
    }
    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void polez(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("Очищает организм от токсинов.\n" +
                "Способствует укреплению иммунной системы.\n" +
                "Является эффективным профилактическим средством против сердечно-сосудистых патологий.\n" +
                "Обладает противовоспалительными и антибактериальными свойствами.\n" +
                "Оказывает легкое седативное (успокаивающее) действие, считается хорошим средством от стресса и его негативных последствий, а также от невроза.\n" +
                "Улучшает обменные процессы, что способствует избавлению от лишних килограммов.\n" +
                "Снимает отечность и улучшает кровообращение.\n" +
                "Устраняет мышечные боли.\n" +
                "Оказывает жаропонижающее действие.");
    }

    public void info(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("В старину, задолго до появления водки и других крепких спиртных напитков, на Руси были распространены хмельные напитки из меда. И хотя само слово «медовуха» появилось сравнительно недавно, традиции приготовления этого напитка уходят корнями в глубокую древность.");
    }

    public void vred(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("Несмотря на то, что медовуха – это напиток на натуральной основе, она имеет ряд противопоказаний. Ее нельзя употреблять:\n" +
                "\n" +
                "при сахарном диабете – из-за высокого содержания сахаров;\n" +
                "беременности и лактации – из-за воздействия на состояние здоровья малыша;\n" +
                "наличии аллергических реакций на мед и другие компоненты;\n" +
                "заболеваниях печени и почек.\n" +
                "Не стоит также увлекаться медовухой тем, кто страдает хроническим гастритом и панкреатитом (а при острой форме заболевания этот напиток полностью противопоказан).\n" +
                "\n" +
                "Разумеется, в каждом конкретном случае стоит проконсультироваться с врачом, чтобы в дальнейшем не было неприятных сюрпризов.");
    }
}