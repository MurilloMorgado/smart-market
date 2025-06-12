package morgado.com.br.smart_market.framework.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  public ResponseEntity<List<Supermercado>> listarSupermercados() {

    List<Supermercado> listaDeSupermercado = supermercadoInput.listarSupermercado();

    return ResponseEntity.ok().body(listaDeSupermercado);
  }

  @GetMapping("/{idSupermercado}")
  public ResponseEntity<Supermercado> buscarSupermercado(@PathVariable Long idSupermercado) {

    Supermercado supermercado = supermercadoInput.buscarSupermercado(idSupermercado);

    return ResponseEntity.ok().body(supermercado);
  }

  @PostMapping
  public ResponseEntity<Long> criarSupermercado(@RequestBody Supermercado supermercado) {

    Long idSupermercado = supermercadoInput.criarSupermercado(supermercado).getId();

    return ResponseEntity.ok().body(idSupermercado);
  }

  @PutMapping("/{idSupermercado}")
  public ResponseEntity<Void> atualizarSupermercado(@PathVariable Long idSupermercado,
      @RequestBody Supermercado supermercado) {

    supermercadoInput.atualizarSupermercado(idSupermercado, supermercado);

    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{idSupermercado}")
  public ResponseEntity<Void> deletarSupermercado(@PathVariable Long idSupermercado) {

    supermercadoInput.deletarSupermercado(idSupermercado);

    return ResponseEntity.ok().build();
  }

}
