package br.com.lucasramon.lrbiblioteca.builders;

import java.time.LocalDate;
import java.util.List;
import br.com.lucasramon.lrbiblioteca.models.Obra;
import br.com.lucasramon.lrbiblioteca.models.Emprestimo;

public class EmprestimoBuilder {

    private Emprestimo emprestimo;

    public static EmprestimoBuilder builder() {
        var builder = new EmprestimoBuilder();
        var cliente = ClienteBuilder.builder().build();
        var autor = AutorBuilder.builder().build();
        var obra = ObraBuilder.builder(autor).build();
        var emprestimo = new Emprestimo();
        var dataEmprestimo = LocalDate.now();
        var dataDevolucao = dataEmprestimo.plusDays(3);
        emprestimo.setCliente(cliente);
        emprestimo.setId(1L);
        emprestimo.setLivros(List.of(obra));
        emprestimo.setDataEmprestimo(dataEmprestimo);
        emprestimo.setDataDevolucao(dataDevolucao);
        builder.emprestimo = emprestimo;
        return builder;
    }

    public EmprestimoBuilder dataDevolucao(LocalDate localDate){
        this.emprestimo.setDataDevolucao(localDate);
        return this;
    }
    public Emprestimo build(){
        return emprestimo;
    }
    
}
