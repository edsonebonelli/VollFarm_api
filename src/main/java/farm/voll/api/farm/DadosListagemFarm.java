package farm.voll.api.farm;

public record DadosListagemFarm(
        Long id,
        String nome,
        String email,
        Especialidade especialidade
) {
    public DadosListagemFarm(Farm farm){
        this(farm.getId(), farm.getNome(), farm.getEmail(), farm.getEspecialidade());
    }
}
