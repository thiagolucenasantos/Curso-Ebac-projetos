package dao;

import main.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public Boolean salvar(Cliente cliente) {

        return true;
    }

    @Override
    public Cliente buscarCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
