package quotilius.herprogramacion.com.practicavideo2brain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ActivityNuevo.class));
            }
        });

    }

    public void mostrarAlerta(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Se a realizado el click",Toast.LENGTH_LONG);
        toast.show();
    }

    public void hacerPedido (View view)
    {
        EditText nombre = (EditText) findViewById(R.id.editTextName);

        SeekBar barra = (SeekBar) findViewById(R.id.seekBar);

        TextView resultado = (TextView)findViewById(R.id.textViewRespuesta);

        Integer cantidad = barra.getProgress();

        resultado.setText(nombre.getText() + "Quiere" + cantidad.toString() + "cafes");
    }


}
