package teste;

public class Detalhes {
    private Integer id;
    private Integer cargaHoraria;
    private String categoria;

    public Detalhes(Integer id, Integer cargaHoraria, String categoria) {
        this.id = id;
        this.cargaHoraria = cargaHoraria;
        this.categoria = categoria;
    }

    public Detalhes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
