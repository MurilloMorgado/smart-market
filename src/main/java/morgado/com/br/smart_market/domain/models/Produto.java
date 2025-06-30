package morgado.com.br.smart_market.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

  private Long id;
  private String nome;
  private String categoria;
  private List<ProdutoMarca> produtoMarcas;
}
