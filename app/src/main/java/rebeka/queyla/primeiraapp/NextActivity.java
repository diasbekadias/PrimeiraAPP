package rebeka.queyla.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); // obtém o intente que criou na tela anterior

        String textoDigitado = i.getStringExtra("texto"); //  pega o texto que foi criado na primeira tela dentro do intent

        TextView tvTexto  = findViewById(R.id.tv_texto);
        tvTexto.setText(textoDigitado); // faz aparece p texto
    }
}