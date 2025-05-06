package morgado.com.br.smart_market.framework.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compra")
public class CompraDB {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_COMPRA")
  private Long id;

  @Column(name = "ID_PRODUTO_SUPERMERCADO")
  private Long idProdutoSupermercado;
  
  @Column(name = "DATA_COMPRA")
  private LocalDateTime data;
  
  @Column(name = "VALOR_PRODUTO")
  private Double valorProduto;
}
