package morgado.com.br.smart_market.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoMarca {

  private Long id;
  private Long marca;
  private Long produto;

  public ProdutoMarca toDomain() {

    return new ProdutoMarca(
        this.id,
        this.marca,
        this.produto);
  }
}
