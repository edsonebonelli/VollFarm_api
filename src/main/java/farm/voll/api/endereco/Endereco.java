package farm.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String origem;
    private String destino;
    private String cliente;

    public Endereco(DadosCadastroEndereco dados) {
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.cep = dados.cep();
        this.origem = dados.origem();
        this.destino = dados.destino();
        this.cliente = dados.cliente();
    }

    public void atualizarInformacoes(DadosCadastroEndereco dados) {
        if (dados.logradouro() != null ){
            this.logradouro = dados.logradouro();
        }
        if (dados.numero() != null ){
            this.numero = dados.numero();
        }
        if (dados.complemento() != null ){
            this.complemento = dados.complemento();
        }
        if (dados.bairro() != null ){
            this.bairro = dados.bairro();
        }
        if (dados.cidade() != null ){
            this.cidade = dados.cidade();
        }
        if (dados.uf() != null ){
            this.uf = dados.uf();
        }
        if (dados.cep() != null ){
            this.cep = dados.cep();
        }
        if (dados.origem() != null ){
            this.origem = dados.origem();
        }
        if (dados.destino() != null ){
            this.destino = dados.destino();
        }
        if (dados.cliente() != null ){
            this.cliente = dados.cliente();
        }
    }
}
