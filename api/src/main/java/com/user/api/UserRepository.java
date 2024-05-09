package com.user.api;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Override
    List<User> findAllById(Iterable<Integer> integers);
}


