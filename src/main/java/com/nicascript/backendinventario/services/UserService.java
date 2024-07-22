package com.nicascript.backendinventario.services;

import com.nicascript.backendinventario.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<UserEntity> store = new ArrayList<>();

    public UserService() {
        store.add(new UserEntity(UUID.randomUUID().toString(), "Bhushan", "bhushan@gmail.com"));
        store.add(new UserEntity(UUID.randomUUID().toString(), "Ramesh", "ramesh@gmail.com"));
        store.add(new UserEntity(UUID.randomUUID().toString(), "Suresh", "suresh@gmail.com"));
        store.add(new UserEntity(UUID.randomUUID().toString(), "Paresh", "paresh@gmail.com"));
    }

    public List<UserEntity> getUsers() {
        return this.store;
    }
}
