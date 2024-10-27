import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // dizemos que o número da conta é único
    private String number;

   
    private String agency;

       @Column(nullable = false, scale = 13, precision = 2) 
    private BigDecimal balance;
    // o nullable como false é para evitar que valores nulos sejam enviados para a nossa tabela
    // a precisão que queremos é 2
    // a escala é a quantity de números que queremos
    // ou seja, 11 inteiros e dois decimais de precisão
    
    @Column(name = "available_limit", scale = 13, precision = 2)
    private BigDecimal limit;
    // colocamos o nome available_limit pq as vezes a palavra limit é uma
    //palavra reservada em alguns bancos de dados.
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
