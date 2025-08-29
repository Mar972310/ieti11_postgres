package org.adaschool.datapostgres.ieti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.adaschool.datapostgres.ieti.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
