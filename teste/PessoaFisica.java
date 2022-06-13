package teste;

public class PessoaFisica extends  Cliente{
    private Integer id;
    private String cpf;

    public PessoaFisica(Integer id, String nome, String email, String telefone) {
        super(id, nome, email, telefone);
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }
}
