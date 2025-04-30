package morgado.com.br.smart_market.framework.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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

  @Column(name = "VALOR_PRODUTO")
  private Double valor;

  @Column(name = "ID_SUPERMERCADO")
  private Long idSupermercado;
}
