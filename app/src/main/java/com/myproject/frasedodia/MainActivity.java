package com.myproject.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNewPhrase(View view){
        String[] frases = {
                "'Não se desespere quando a caminhada estiver difícil, é sinal de que você está no caminho certo.' \n Autor desconhecido",
                "'Seus sonhos não precisam de plateia, eles só precisam de você.' \n Daniel Duarte",
                "'As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.'\n Zig Ziglar",
                "'Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.'\n Dalai Lama",
                "'Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.' \n Tumblr",
                "'Imagine uma nova história para sua vida e acredite nela.'\n Paulo Coelho"
        };
        TextView text = findViewById(R.id.textResult);
        text.setText(frases[new Random().nextInt(frases.length)]);
    }
}