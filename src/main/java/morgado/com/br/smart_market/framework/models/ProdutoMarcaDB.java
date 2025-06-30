package morgado.com.br.smart_market.framework.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.domain.models.ProdutoMarca;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUTO_MARCA")
public class ProdutoMarcaDB {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRODUTO_MARCA")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "ID_MARCA")
  private MarcaDB marca;

  @ManyToOne
  @JoinColumn(name = "ID_PRODUTO")
  private ProdutoDB produto;

  public ProdutoMarca toDomain() {

    return new ProdutoMarca(
        this.id,
        this.marca != null ? this.marca.getId() : null,
        this.produto != null ? this.produto.getId() : null);
  }
}