package morgado.com.br.smart_market.framework.output.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import morgado.com.br.smart_market.framework.models.CompraDB;

public interface CompraRepository extends JpaRepository<CompraDB, Long>{
  
}
