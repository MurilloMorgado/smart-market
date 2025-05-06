package morgado.com.br.smart_market.framework.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.CompraInput;
import morgado.com.br.smart_market.domain.models.Compra;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/compras")
public class CompraController {
  
  private final CompraInput compraInput;

  @GetMapping
  public ResponseEntity<List<Compra>> listarCompras(){
    
    List<Compra> listaDeCompras = compraInput.listarCompras();

    return ResponseEntity.ok().body(listaDeCompras);
  }
}
