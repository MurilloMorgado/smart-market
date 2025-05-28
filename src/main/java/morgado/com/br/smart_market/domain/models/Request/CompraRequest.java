package morgado.com.br.smart_market.domain.models.Request;

import lombok.Data;

@Data
public class CompraRequest {

  private Long idProdutoSupermercado;
  private Double valorProduto;
}
