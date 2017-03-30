package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Q03 extends AppCompatActivity {

    RadioGroup rgEstadoCivil, rgEscolaridade;
    EditText edIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q03);

        edIdade = (EditText) findViewById(R.id.edIdade);
        rgEstadoCivil = (RadioGroup) findViewById(R.id.rgEstadoCivil);
        rgEscolaridade = (RadioGroup) findViewById(R.id.rgEscolaridade);

        List<RadioGroup> radioGroupList = new ArrayList<>();
        radioGroupList.add(rgEstadoCivil);
        radioGroupList.add(rgEscolaridade);

        for(RadioGroup r : radioGroupList)
            for(int i=0; i< r.getChildCount(); i++){
                r.getChildAt(i).
                        setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        selecionado(v);
                    }
                });
            }
    }

    public void avaliar(View view){
        if(edIdade.getText().toString().equals(""))
            mensagem("Informe a idade do candidato");
        else{
            int idade = Integer.valueOf(edIdade.getText().toString());
            if(idade > 20 &&
                    rgEstadoCivil.getCheckedRadioButtonId() ==
                            R.id.rbSolteiro &&
                    rgEscolaridade.getCheckedRadioButtonId() ==
                            R.id.segundograu)
                mensagem("Aprovado");
            else
                mensagem("Não aprovado!");
                
        }

    }

    public void selecionado(View view) {
        mensagem(((RadioButton)view ).
                getText().toString() + " foi selecionado");
    }

    private void mensagem(String s) {
        Toast.makeText(Q03.this, s, Toast.LENGTH_SHORT).show();
        Log.i("App",s);
    }
}
