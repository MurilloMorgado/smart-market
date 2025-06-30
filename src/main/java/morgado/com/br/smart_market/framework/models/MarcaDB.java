package morgado.com.br.smart_market.framework.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import morgado.com.br.smart_market.domain.models.Marca;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "marca")
public class MarcaDB {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_MARCA")
  private Long id;

  @Column(name = "NOME")
  private String nome;

  @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
  private List<ProdutoMarcaDB> produtoMarcas;

  public MarcaDB(Marca marca) {
    this.id = marca.getId();
    this.nome = marca.getNome();
  }

  public Marca toDomain() {
    return new Marca(
      this.id,
      this.nome);
  }

}
