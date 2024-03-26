package rebeka.queyla.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // reprensenta a tela principal , e o comportamento da tela principal

    @Override
    protected void onCreate(Bundle savedInstanceState) { // o método é chamado pelo sistema operacional d androind toda vez que a tela está sendo criada.é chamado  automaticamente. cria classe automaticamente , prenche funções que o sistema vai chamar.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // constrói a interfase gráfica da tela baseada na xml criada anteriormente

        Button btnEnviar = findViewById(R.id.btn_enviar); // obtém o botão enviar. Cada elemento da interface que criamos mo arquivo xml tem um id, que nos permite acessar esses elementos de interface aqui no código java
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // "v" é um botão
                //exemplos em sala
                //Button b=(Button) v;
                //float a =1.5f;
                //int b=(int) a;
                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui);
                String textpDigitado =etDigiteAqui.getText().toString(); //obtendo o texto que está contido de texto;
                Intent i = new Intent (MainActivity.this,NextActivity.class);

                i.putExtra( "texto" , textpDigitado);
                startActivity(i);
            }
        });
    }
}