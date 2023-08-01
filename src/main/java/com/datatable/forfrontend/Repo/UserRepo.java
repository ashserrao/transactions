package com.datatable.forfrontend.Repo;

import com.datatable.forfrontend.Entity.Masteruser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Masteruser, Integer> {
}
