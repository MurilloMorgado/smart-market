package morgado.com.br.smart_market.framework.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.SupermercadoInput;
import morgado.com.br.smart_market.domain.models.Supermercado;

@RestController
@RequestMapping("/v1/supermercados")
@RequiredArgsConstructor
public class SupermercadoController {
  
  private final SupermercadoInput supermercadoInput;

  @GetMapping
  public ResponseEntity<List<Supermercado>> listarSupermercados(){
    
    List<Supermercado> listaDeSupermercado = supermercadoInput.listarSupermercado();

    return ResponseEntity.ok().body(listaDeSupermercado);
  }

}
