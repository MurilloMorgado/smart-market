package morgado.com.br.smart_market.domain.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

  private Long id;
  private Long idProdutoSupermercado;
  private LocalDateTime data;
  private Double valorProduto;
}
