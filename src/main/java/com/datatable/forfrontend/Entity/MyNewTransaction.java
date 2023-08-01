package com.datatable.forfrontend.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "mynewtransaction")
public class MyNewTransaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "trans_id")
        private Long transId;

        @Column(name = "uid")
        private String uid;

        @Column(name = "bank_id")
        private String bankId;

        @Column(name = "sender_account_no")
        private String senderAccountNo;

        @Column(name = "receiver_account_no")
        private String receiverAccountNo;

        @Column(name = "amount")
        private Double amount;

        @Column(name = "date_time")
        private Date dateTime;

        @Column(name = "trans_type")
        private String transType; // Can be "dr" or "cr"

        @Column(name = "trans_status")
        private String transStatus;

        // Constructors, getters, and setters (omitted for brevity)

        public Long getTransId() {
            return transId;
        }

        public void setTransId(Long transId) {
            this.transId = transId;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getBankId() {
            return bankId;
        }

        public void setBankId(String bankId) {
            this.bankId = bankId;
        }

        public String getSenderAccountNo() {
            return senderAccountNo;
        }

        public void setSenderAccountNo(String senderAccountNo) {
            this.senderAccountNo = senderAccountNo;
        }

        public String getReceiverAccountNo() {
            return receiverAccountNo;
        }

        public void setReceiverAccountNo(String receiverAccountNo) {
            this.receiverAccountNo = receiverAccountNo;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public Date getDateTime() {
            return dateTime;
        }

        public void setDateTime(Date dateTime) {
            this.dateTime = dateTime;
        }

        public String getTransType() {
            return transType;
        }

        public void setTransType(String transType) {
            this.transType = transType;
        }

        public String getTransStatus() {
            return transStatus;
        }

        public void setTransStatus(String transStatus) {
            this.transStatus = transStatus;
        }
}
