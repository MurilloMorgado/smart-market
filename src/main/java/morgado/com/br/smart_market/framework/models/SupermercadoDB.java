package morgado.com.br.smart_market.framework.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import morgado.com.br.smart_market.domain.models.Supermercado;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "supermercado")
public class SupermercadoDB {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_SUPERMERCADO")
  private Long id;

  @Column(name = "NOME_SUPERMERCADO")
  private String nome;

  public SupermercadoDB(Supermercado supermercado) {
    this.id = supermercado.getId();
    this.nome = supermercado.getNome();
  }
}
