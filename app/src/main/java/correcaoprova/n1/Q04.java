package correcaoprova.n1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.laboratorio.ciclodevida.R;

public class Q04 extends AppCompatActivity {

    RadioButton rbHomem, rbMulher;
    EditText altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q04);
        rbHomem = (RadioButton) findViewById(R.id.rbHomem);
        rbMulher = (RadioButton) findViewById(R.id.rbMulher);
        altura = (EditText) findViewById(R.id.edAltura);
    }

    public void calcularPesoIdeal(View view){
        int a = Integer.parseInt(altura.getText().toString());
        if(rbHomem.isChecked())
            mensagem("Peso ideal: "+formulaLorentz(a,4));
        else if(rbMulher.isChecked())
            mensagem("Peso ideal: "+formulaLorentz(a,2));
    }

    private void mensagem(String msg) {
        Toast.makeText(Q04.this, msg, Toast.LENGTH_SHORT).show();
    }

    private int formulaLorentz(int altura,int s){
        return (altura - 100) - (altura -150)/s;
    }
}
