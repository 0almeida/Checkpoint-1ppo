package teste;

public class PessoaJuridica extends Cliente{
     private Integer id;
     private String cnpj;

     public PessoaJuridica(Integer id, String nome, String email, String telefone) {
          super(id, nome, email, telefone);
     }
}
