package correcaoprova.n1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laboratorio.ciclodevida.R;

public class Q01 extends AppCompatActivity {

    EditText alcool, gasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q01);

        alcool = (EditText) findViewById(R.id.edalcool);
        gasolina = (EditText) findViewById(R.id.edgasolina);
    }

    public void calcular(View view){
        float a = Float.parseFloat(alcool.getText().toString());
        float g = Float.parseFloat(gasolina.getText().toString());

        float percentual = (a * 100)/g;

        if (percentual <= 70.0f)
            mensagem("O Alcool é o mais recomendado");
        else
            mensagem("Gasolina é o mais recomendado");

    }

    private void mensagem(String msg) {
        Toast.makeText(Q01.this, msg, Toast.LENGTH_SHORT).show();
    }
}
