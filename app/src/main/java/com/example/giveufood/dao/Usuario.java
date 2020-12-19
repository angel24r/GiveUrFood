package com.example.giveufood.dao;

public class Usuario {
    int idUsuario,Telefono;
    String Nombres="", Correo="",Password="";
    boolean valido;

    public Usuario(){}
    public Usuario(int idUsuario, int telefono, String nombres, String correo, String password) {
        this.idUsuario = idUsuario;
        Telefono = telefono;
        Nombres = nombres;
        Correo = correo;
        Password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }
}
