package ru.chris.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chris.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
