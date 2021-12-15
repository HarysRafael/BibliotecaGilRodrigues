package br.ete.view;

import br.ete.dao.AdminDao;
import br.ete.dao.EmprestimoDao;
import br.ete.model.Admin;
import br.ete.model.Emprestimo;

public class teste {
    public static void main(String[] args){
        /*AdminDao adminDao = new AdminDao();        
        Admin admin = new Admin();               
        admin.setLogin("admin");
        admin.setSenha("admin");
        adminDao.criar(admin);
        System.out.print(admin.toString() + admin.getId());
        admin = adminDao.buscarLoginSenha("admin", "admin");
        */
        
        EmprestimoDao emprestimoDao = new EmprestimoDao();
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataDeEmprestimo("20/11/2021");
        emprestimo.setDataDeDevolucaoPrevista("28/11/2021");       
        emprestimo.setIdLivro(10L);
        emprestimo.setMatricula("321345");
        emprestimo.setTituloLivro("Sitio do pica pau amarelo");
        emprestimo.setNomeAluno("Thiago Santos");
        emprestimoDao.criar(emprestimo);
        emprestimoDao.atualizaStatusEmprestimo();        
        
        
        
    }
    
}
