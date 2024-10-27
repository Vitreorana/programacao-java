

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user") // tb_user é o nome da tabela 
public class User<Account, Card, News, Feature> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    private String name;

    
    @OneToOne(cascade = CascadeType.ALL) // temos um relacionamento OneToOne (um para um)
    // e o cascade vai formalizar essa ligação, ou seja, se o usuário for excluído, a conta tbm é, por exemplo
    private Account account;
    
    @OneToOne(cascade = CascadeType.ALL) // a mesma coisa aqui, só que entre a conta e o cartão
    private Card card;
  
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // aqui o relacionamento é de 1 usuário para muitas features
    // Featch Eager significa que toda vez que eu for buscar um usuário no banco, eu gostaria
    // que ele trouxesse a lista de features dele junto
    private List<Feature> features;

    

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // a mesma coisa com o news
    private List<News> news;

    
    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
