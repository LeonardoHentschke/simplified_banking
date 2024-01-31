package com.simplified_banking.services;

import com.simplified_banking.domain.user.User;
import com.simplified_banking.domain.user.UserType;
import com.simplified_banking.dtos.UserDTO;
import com.simplified_banking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == null) {
            throw new Exception("Usuário sem tipo não está autorizado a realizar transação");
        }

        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuário to tipo Lojista não está autorizado a realizar transação");
        }

        if (sender.getBalance().compareTo(amount) < 0 ){
            throw new Exception("Saldo insuficiente");
        }

    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    public User createUser(UserDTO data) {
        final User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

    public void saveUser(User user) {
        this.repository.save(user);
    }
}
