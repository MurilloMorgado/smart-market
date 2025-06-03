package morgado.com.br.smart_market.framework.mapper;

import org.springframework.stereotype.Component;

import morgado.com.br.smart_market.domain.models.Supermercado;
import morgado.com.br.smart_market.framework.models.SupermercadoDB;

@Component
public class SupermercadoMapper {

  public Supermercado toDomain(SupermercadoDB supermercadoDB) {

    return new Supermercado(
        supermercadoDB.getId(),
        supermercadoDB.getNome());

  }
}
