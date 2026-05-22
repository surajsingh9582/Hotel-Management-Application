package com.idce.user.Repositories;

import com.idce.user.Model.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<userEntity,Integer> {
    Optional<userEntity> getByEmail(String email);
}
