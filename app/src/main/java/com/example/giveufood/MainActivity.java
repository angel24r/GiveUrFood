package com.example.giveufood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.giveufood.dao.Usuario;
import com.example.giveufood.dao.daoUsuario;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        }catch (Exception e){

        }

        setContentView(R.layout.activity_main);
        Button btnlogin = findViewById(R.id.btnlogin);
        TextView signup = findViewById(R.id.signup);
        TextView signupsec = findViewById(R.id.tvsignupsec);
        signup.setOnClickListener(onClickSign());
        signupsec.setOnClickListener(onClickSign());
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IniciarSesion();
            }
        });
    }
    private void IniciarSesion()
    {
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        daoUsuario daoUsuario = new daoUsuario();
        Usuario usuario = new Usuario();
        usuario.setCorreo(email.getText().toString());
        usuario.setPassword(password.getText().toString());
        daoUsuario.Validar(usuario);
        Toast.makeText(this,usuario.isValido() ? usuario.getNombres() : "Usuario y/o Contraseña invalido.",Toast.LENGTH_SHORT).show();
        if (usuario.isValido())
        {
            Intent intent = new Intent(MainActivity.this,Home.class);
            MainActivity.this.startActivity(intent);
            finish();
        }
    }

    private View.OnClickListener onClickSign()    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        };
    }
}