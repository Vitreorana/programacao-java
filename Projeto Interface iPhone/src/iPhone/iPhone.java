package iPhone;
import Softwares.Aparelho.Aparelho;

public class iPhone {
public static void main(String[] args) throws Exception {
        Aparelho aplicativoiPhone = new Aparelho();
                     
        aplicativoiPhone.tocar();
        aplicativoiPhone.pausar();
        aplicativoiPhone.selecionarMusica(null);

        aplicativoiPhone.ligar(null);
        aplicativoiPhone.atender();
        aplicativoiPhone.iniciarCorreioVoz();

        aplicativoiPhone.exibirPagina(null);
        aplicativoiPhone.adicionarNovaAba();
        aplicativoiPhone.atualizarPagina();
    }
}
