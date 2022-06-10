package com.example.kyrsach2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sidr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidr);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void polez(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("Пищеварительная система. Компоненты, имеющиеся в напитке, улучшают усвояемость пищи. Организм очищается от ненужных жиров и кислот, улучшается микрофлора кишечника, и все это благодаря большому содержанию пектина. При незначительном попадании в организм тяжелых металлов или токсичных веществ 100 г сидра помогут снизить степень риска распространения заражения по всему организму.\n\n" +
                "Нервная система. Еще придворные лекари открыли чудодейственное влияние напитка на состояние нервной системы. Сидр прописывали людям, страдающим депрессиями, повышенной усталостью. Ароматный и вкусный яблочный сидр помогает избавиться от хандры и усталости.\n\n" +
                "Иммунитет. Довольно большое содержание витамина C в соединении с другими витаминами и полезными элементами способствует снижению уровня заболеваемости простудными заболеваниями, а также увеличивает способность организма противостоять вредным бактериям и микробам. Рекомендуется употреблять напиток в весенний, осенний периоды, когда организм ослабевает от недостатка полезных веществ.\n\n" +
                "Сердечно-сосудистая система. Как и любой алкогольный напиток, сидр расширяет сосуды. Это благотворно влияет на проходимость крови, но не стоит этим злоупотреблять и пить его в больших количествах. Макро- и микроэлементы, присутствующие в составе, увеличивают эластичность стенок сосудов, предотвращают образование тромбов и бляшек. Умеренное употребление яблочного сидра понижает уровень холестерина.");
    }

    public void info(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("Напиток, полученный путем брожения, обладающий приятным фруктовым вкусом и ароматом, называют сидром. Его готовят из разных фруктов, итальянцы даже добавляют различные специи и травы. Классическим вариантом напитка считается именно яблочный сидр.");
    }

    public void vred(View view) {
        TextView textView = (TextView) findViewById(R.id.text_str);
        textView.setText("Сидр категорически запрещено пить детям, не достигшим 18-го возраста.\n\n" +
                "Как и все продукты, этот напиток имеет противопоказания:\n\n" +
                "хронические заболевания желудка;\n\n" +
                "период обострения панкреатита, гастрита, холецистита (из-за содержания кислот);\n\n" +
                "язва желудка;\n\n" +
                "сахарный диабет. ");
    }
}