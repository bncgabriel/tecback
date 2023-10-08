package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.CreditCard;
import br.com.fujideia.iesp.tecback.repository.CreditCardRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepository repository;

    public CreditCard salvar(CreditCard creditCard) {
        return repository.save(creditCard);
    }
    public CreditCard consultarPorCPF(String id){
        return repository.findById(id).get();
    }
    public List<CreditCard> listar(){
        return repository.findAll();
    }
    public void excluir(String CPF){
        repository.deleteById(CPF);
    }
}