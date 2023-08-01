package com.datatable.forfrontend.Service;

import com.datatable.forfrontend.Entity.MyNewTransaction;
import com.datatable.forfrontend.Repo.TransRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransServices {
    @Autowired
    TransRepo transRepo;

    public String saveTransaction(MyNewTransaction myNewTransaction){
        transRepo.save(myNewTransaction);
        return "Transaction saved";
    }

    public List<MyNewTransaction> getAllTransactions() {return transRepo.findAll();}

    public List<MyNewTransaction> getTransactionsByBankId(String bankId) {
        return transRepo.findByBankId(bankId);
    }

}
