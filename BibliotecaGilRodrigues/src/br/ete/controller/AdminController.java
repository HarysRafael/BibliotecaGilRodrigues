package br.ete.controller;

import br.ete.dao.AdminDao;
import br.ete.dto.AdminDto;
import br.ete.model.Admin;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AdminController {

    public AdminController() {
    }

    private AdminDao adminDao = new AdminDao();
    private AdminDto adminDto = new AdminDto();
    private Admin admin = new Admin();

    public AdminDto salvar(AdminDto adminDto) {
        Admin admin = converterDtoEmAdmin(adminDto);
        adminDao.criar(admin);
        return adminDto;
    }

    public AdminDto editar(AdminDto adminDto) {
        Admin admin = converterDtoEmAdmin(adminDto);
        adminDao.editar(admin);
        return adminDto;
    }

    public AdminDto buscarPorLoginSenha(String login, String senha) {
        Admin admin = adminDao.buscarLoginSenha(login, senha);
        AdminDto adminDto = converterAdminEmDto(admin);
        return adminDto;
    }
    

    public ArrayList<AdminDto> buscarTodos() {
        return (ArrayList<AdminDto>) adminDao.listarTodos().stream()
                .map(admin -> {
                    return converterAdminEmDto(admin);
                })
                .collect(Collectors.toList());
    }

    public void deletar(Long id) {
        adminDao.deletar(id);

    }

    public AdminDto converterAdminEmDto(Admin admin) {
        AdminDto adminDto = new AdminDto();
        adminDto.setId(admin.getId());
        adminDto.setLogin(admin.getLogin());
        adminDto.setSenha(admin.getSenha());
        return adminDto;
    }

    public Admin converterDtoEmAdmin(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setId(adminDto.getId());
        admin.setLogin(adminDto.getLogin());
        admin.setSenha(adminDto.getSenha());
        return admin;

    }

}
