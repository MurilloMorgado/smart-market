package morgado.com.br.smart_market.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoMarca {

  private Long id;
  private Marca marca;
  private Produto produto;
}
