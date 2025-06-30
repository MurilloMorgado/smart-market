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
import morgado.com.br.smart_market.domain.models.Produto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class ProdutoDB {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRODUTO")
  private Long id;

  @Column(name = "NOME_PRODUTO")
  private String nome;

  @Column(name = "CATEGORIA_PRODUTO")
  private String categoria;

  @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ProdutoMarcaDB> produtoMarcas;

  public Produto toDomain() {

    return new Produto(
        id,
        nome,
        categoria,
        null);
  }
}
