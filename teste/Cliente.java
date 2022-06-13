package teste;

public class Cliente {
    protected Integer id;
    protected String nome;
    protected String email;
    protected String telefone;

    public Cliente() {
    }


    public void imprimirDados(){
        System.out.println("Imprimindo dados");
        System.out.println(this.id);
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.telefone);
    };


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(Integer id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}
