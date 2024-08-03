package br.edu.iftm.agenda.logic;

import br.edu.iftm.agenda.dao.PermissaoDAO;
import br.edu.iftm.agenda.entity.Permissao;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author danilo
 */
public class PermissaoLogic implements GenericLogic<Permissao> {
    @Inject
    private PermissaoDAO dao;
    
    @Override
    public void salvar(Permissao entidade) {
        dao.salvar(entidade);
    }

    @Override
    public void deletar(Permissao entidade) {
        dao.deletar(entidade.getId());
    }

    @Override
    public List<Permissao> listar() {
        return dao.listar();
    }

    
        
}