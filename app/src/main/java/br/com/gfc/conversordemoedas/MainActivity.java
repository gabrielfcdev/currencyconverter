package br.com.gfc.conversordemoedas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editQuantidadeDolar;
    private EditText editCotacaoDolar;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editQuantidadeDolar = findViewById(R.id.editQuantidadeDolar);
        editCotacaoDolar = findViewById(R.id.editCotacaoDolar);
        textResultado = findViewById(R.id.textResultado);

    }

    public void converter(View view){

        double quantidadeDolar = Double.parseDouble(editQuantidadeDolar.getText().toString());
        double cotacaoDolar = Double.parseDouble(editCotacaoDolar.getText().toString());
        double resultado = quantidadeDolar * cotacaoDolar;

        textResultado.setText("Valor convertido em R$: " + resultado);


    }

}