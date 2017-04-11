package correcaoprova.n1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laboratorio.ciclodevida.R;

public class Q02 extends AppCompatActivity {
    EditText p1, p2, p3, exame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        p1 = (EditText) findViewById(R.id.edN1);
        p2 = (EditText) findViewById(R.id.edN2);
        p3 = (EditText) findViewById(R.id.edN3);
        exame = (EditText) findViewById(R.id.edExame);
    }

    public void analisar(View view){
        float n1 = Float.parseFloat(p1.getText().toString());
        float n2 = Float.parseFloat(p2.getText().toString());
        float n3 = Float.parseFloat(p3.getText().toString());
        float media = (n1 + n2 + n3)/3;
        if(media >=7)
            mensagem("Aprovado!");
        else{
            mensagem("Você está de final, informe a nota de exame");
            float ex = Float.parseFloat(exame.getText().toString());
            float nFinal = (media + ex)/2;
            if(nFinal >= 5)
                mensagem("Aprovado!");
            else
                mensagem("Reprovado!");
        }
    }

    private void mensagem(String msg) {
        Toast.makeText(Q02.this, msg, Toast.LENGTH_SHORT).show();
    }
}
