package com.gabriela;

public class Email {

    private String enderecoEmail;

    private String mensagem;

    private String formato;

    public Email(String enderecoEmail, String mensagem, String formato) {
        this.enderecoEmail = enderecoEmail;
        this.mensagem = mensagem;
        this.formato = formato;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getFormato() {
        return formato;
    }
}