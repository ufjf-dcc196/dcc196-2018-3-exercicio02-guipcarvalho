package br.ufjf.dcc196.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadEpisodioActivity extends AppCompatActivity {


    private Button btnCancelar;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_episodio);

        btnCancelar = (Button)findViewById(R.id.btnCancelarEpisodio);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSalvar = (Button)findViewById(R.id.btnSalvarEpisodio);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //salva a treta

                finish();
            }
        });

    }
}
