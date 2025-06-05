package morgado.com.br.smart_market.framework.output.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import morgado.com.br.smart_market.framework.models.MarcaDB;

public interface MarcaRepository extends JpaRepository<MarcaDB, Long> {
  
}
