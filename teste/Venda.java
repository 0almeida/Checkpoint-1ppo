package teste;

import java.util.Date;

public class Venda {
    private Integer id;
    private Cliente cliente;
    private  Curso curso;
    private Date datCad;

    public Venda(Integer id, Cliente cliente, Curso curso, Date datCad) {
        this.id = id;
        this.cliente = cliente;
        this.curso = curso;
        this.datCad = datCad;
    }

    public Venda() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDatCad() {
        return datCad;
    }

    public void setDatCad(Date datCad) {
        this.datCad = datCad;
    }
}
