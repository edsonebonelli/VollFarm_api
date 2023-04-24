package farm.voll.api.controller;

import farm.voll.api.farm.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("farm")
public class FarmController {

    @Autowired
    private FarmRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFarm dados){
        repository.save(new Farm(dados));
    }

    @GetMapping
    public Page<DadosListagemFarm> listar(@PageableDefault(sort = {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemFarm::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoFarm dados){
        var farm = repository.getReferenceById(dados.id());
        farm.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var farm = repository.getReferenceById(id);
        farm.excluir();
    }
}
