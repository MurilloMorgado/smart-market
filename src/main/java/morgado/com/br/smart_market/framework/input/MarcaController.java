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
import morgado.com.br.smart_market.application.input.MarcaInput;
import morgado.com.br.smart_market.domain.models.Marca;

@RestController
@RequiredArgsConstructor
@RequestMapping("/marcas")
public class MarcaController {

  private final MarcaInput marcaInput;

  @GetMapping
  public ResponseEntity<List<Marca>> listarMarcas() {

    List<Marca> listaDeMarcas = marcaInput.listarMarcas();

    return ResponseEntity.ok().body(listaDeMarcas);
  }

  @GetMapping(path = "/{idMarca}")
  public ResponseEntity<Marca> buscarMarca(@PathVariable Long idMarca) {

    Marca marca = marcaInput.buscarMarca(idMarca);

    return ResponseEntity.ok().body(marca);
  }

  @PostMapping()
  public ResponseEntity<Long> criarMarca(@RequestBody Marca marca) {

    Long idMarca = marcaInput.criarMarca(marca);

    return ResponseEntity.ok().body(idMarca);
  }

  @PutMapping(path = "/{idMarca}")
  public ResponseEntity<Void> atualizarMarca(@PathVariable Long idMarca, @RequestBody Marca marca) {

    marcaInput.atualizarMarca(marca, idMarca);

    return ResponseEntity.ok().build();
  }

  @DeleteMapping(path = "/{idMarca}")
  public ResponseEntity<Void> deletarMarca(@PathVariable Long idMarca) {

    marcaInput.deletarMarca(idMarca);

    return ResponseEntity.ok().build();
  }

}
