package com.taller.servicio.enums;

public enum Cargos {
    DIRECTOR_TALENTO_HUMANO("DIRECTOR TALENTO HUMANO");

    ;
    private String cargo;

    Cargos(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
