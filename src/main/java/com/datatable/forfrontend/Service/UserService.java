package com.datatable.forfrontend.Service;

import com.datatable.forfrontend.Entity.Masteruser;
import com.datatable.forfrontend.Repo.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String saveUser(Masteruser masteruser){
        userRepo.save(masteruser);
        return "User saved";
    }

    public List<Masteruser> getAllUsers(){
        return userRepo.findAll();
    }
}
