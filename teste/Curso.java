package teste;

public class Curso {
    private Integer id;
    private Detalhes detalhes;
    private Double preco;

    public void  calcularPreco(){};


    public Curso(Integer id, Detalhes detalhes, Double preco) {
        this.id = id;
        this.detalhes = detalhes;
        this.preco = preco;
    }

    public Curso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Detalhes getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Detalhes detalhes) {
        this.detalhes = detalhes;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
