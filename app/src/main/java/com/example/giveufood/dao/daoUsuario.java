package com.example.giveufood.dao;

import java.util.ArrayList;
import java.util.List;

public class daoUsuario {
    List<Usuario> lstUsuario= new ArrayList<>();

    public daoUsuario(){
        lstUsuario.add(new Usuario(1,46100000,"Oscar Zamora","osc98@gmail.com","12345"));
        lstUsuario.add(new Usuario(2,46100000,"Mich Zamora","michtec@gmail.com","12345"));
        lstUsuario.add(new Usuario(3,46100000,"Angel Yañez","angel2403@gmail.com","12345"));
        lstUsuario.add(new Usuario(4,46100000,"Daniela Monterrosa","damon99@gmail.com","12345"));

    }
    public void Validar(Usuario usuario)
    {
        for (Usuario user: lstUsuario)
            if (user.getCorreo().equals(usuario.getCorreo())&& user.getPassword().equals(usuario.getPassword())){
                usuario.setValido(true);
                usuario.setNombres(user.getNombres());
            }
    }
}
