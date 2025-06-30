package morgado.com.br.smart_market.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

  private Long id;
  private String nome;
  private String categoria;;
}
