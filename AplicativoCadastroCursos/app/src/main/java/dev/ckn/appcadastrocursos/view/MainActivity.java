package dev.ckn.appcadastrocursos.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dev.ckn.appcadastrocursos.R;
import dev.ckn.appcadastrocursos.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

    }
}