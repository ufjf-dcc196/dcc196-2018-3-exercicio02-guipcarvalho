package br.ufjf.dcc196.exercicio2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadEpisodioActivity extends AppCompatActivity {


    private Button btnCancelar;
    private Button btnSalvar;
    private EpisodioDbHelper dbHelper;

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
                String nomeSerie = ((EditText)findViewById(R.id.edtNomeSerie)).getText().toString();
                String numEpisodio = ((EditText)findViewById(R.id.edtNumeroEpisodio)).getText().toString();
                String numTemporada = ((EditText)findViewById(R.id.edtNumeroTemp)).getText().toString();

                if(nomeSerie == "" || numEpisodio == "" || numTemporada == "")
                {
                    Toast.makeText(CadEpisodioActivity.this,"Você precisa preencher todos os campos",Toast.LENGTH_LONG).show();
                    return;
                }


                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();

                values.put(EpisodioContract.Episodio.COLUMN_NAME_NOME, nomeSerie);
                values.put(EpisodioContract.Episodio.COLUMN_NAME_NUM_EP, Integer.parseInt(numEpisodio));
                values.put(EpisodioContract.Episodio.COLUMN_NAME_NUM_TEMP, Integer.parseInt(numTemporada));

                finish();
            }
        });

    }
}
