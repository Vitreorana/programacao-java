package com.gabriela;
public class ServicoEnvioEmail {

    private PlataformaDeEnvio plataforma;

    public PlataformaDeEnvio getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformaDeEnvio plataforma) {
        this.plataforma = plataforma;
    }

    void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if(formatoHtml) {
            email = new Email(enderecoEmail, mensagem, formato.HTML);
        }else{
            email = new Email(enderecoEmail, mensagem, formato.TEXTO);
        }

        plataforma.enviaEmail(email);
    }
}