package com.datatable.forfrontend.Repo;

import com.datatable.forfrontend.Entity.MyNewTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransRepo extends JpaRepository<MyNewTransaction, Long> {
    List<MyNewTransaction> findByBankId(String bankId);
}
