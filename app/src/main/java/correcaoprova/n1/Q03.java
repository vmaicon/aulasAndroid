package correcaoprova.n1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laboratorio.ciclodevida.R;

public class Q03 extends AppCompatActivity {

    EditText qtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        qtd = (EditText) findViewById(R.id.edQtdLivros);
    }

    public void analisarCriterio(View view){
        int qtdLivros = Integer.parseInt(qtd.getText().toString());
        float criterioA = (qtdLivros * 0.25f) + 7.50f;
        float criterioB = (qtdLivros * 0.5f) + 2.50f;

        if(criterioA <= criterioB)
            mensagem("A");
        else
            mensagem("B");
    }

    private void mensagem(String msg) {
        Toast.makeText(Q03.this,
                "Critério "+msg+" tem o melhor desconto",
                Toast.LENGTH_SHORT).show();
    }
}
