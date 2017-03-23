package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Q02 extends AppCompatActivity {

    EditText edCampoPalavra;
    TextView textPrimeiraLetra, textUltimaLetra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q02);
        edCampoPalavra =
                (EditText) findViewById(R.id.edPalavra);
        textPrimeiraLetra =
                (TextView) findViewById(R.id.textPrimeiraLetra);
        textUltimaLetra =
                (TextView) findViewById(R.id.textUltimaLetra);
    }

    public void questao2PrimeriaUltimaLetra(View view){
        String palavra = edCampoPalavra.getText().toString();
        int tamanho = palavra.length();

        if(tamanho < 5)
            Toast.makeText(Q02.this,
                    "Informe uma palava maior que 5 caracteres!",
                    Toast.LENGTH_SHORT).show();
        else{
            String primeiraLetra = ""+palavra.charAt(0);
            String ultimaLetra = ""+palavra.charAt(tamanho -1);

            //mostra para o usuário
            textPrimeiraLetra.setText("Primeira Letra: "+primeiraLetra);
            textUltimaLetra.setText("Última Letra: "+ultimaLetra);
        }
    }
}