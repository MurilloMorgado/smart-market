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
import morgado.com.br.smart_market.domain.models.Marca;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "marca")
public class MarcaDB {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_MARCA")
  private Long id;

  @Column(name = "NOME")
  private String nome;

  public MarcaDB(Marca marca) {
    this.id = marca.getId();
    this.nome = marca.getNome();
  }

  public Marca toDomain() {
    return new Marca(
      this.id,
      this.nome);
  }

}
