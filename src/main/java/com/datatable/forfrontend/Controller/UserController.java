package com.datatable.forfrontend.Controller;

import com.datatable.forfrontend.Entity.Masteruser;
import com.datatable.forfrontend.Entity.MyNewTransaction;
import com.datatable.forfrontend.Service.TransServices;
import com.datatable.forfrontend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private TransServices transServices;

    @PostMapping("/save")
    public String bankingSave(@RequestBody Masteruser masteruser) {
        return userService.saveUser(masteruser);
    }

    @GetMapping("/allusers")
    public ResponseEntity<List<Masteruser>> getAllUsers() {
        List<Masteruser> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/addtransactions")
    public String transactionSave(@RequestBody MyNewTransaction myNewTransaction) {
        return transServices.saveTransaction(myNewTransaction);
    }

    // JSON formatted dummy data is available in scratches folder
    //Sample url("http://localhost:8080/user/alltransactions")
    @GetMapping("/alltransactions")
    public ResponseEntity<List<MyNewTransaction>> getAllTrans() {
        List<MyNewTransaction> transactions = transServices.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    //Sample url("http://localhost:8080/user/filter-by-bank?bankId=bank456")
    @GetMapping("/filter-by-bank")
    public ResponseEntity<List<MyNewTransaction>> getTransactionsByBankId(@RequestParam("bankId") String bankId) {
        List<MyNewTransaction> transactions = transServices.getTransactionsByBankId(bankId);
        return ResponseEntity.ok(transactions);
    }
}
