package uz.pdp.task_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)  // KIM TOMINIDAN BAJARILGANLIGINI BILISH UCHUN
public class DepositInATM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer   id;

    private Integer     currency;         // 1 - söm ;  2 - dollar

    private String      bankNote;         // 1000, 5000, 10 000, 50 000, 100 000

    private Integer     amount;

    private LocalDate   date;

    @ManyToOne(cascade = CascadeType.ALL)
    private  Atm         bankomat;

    @OneToOne(cascade = CascadeType.ALL)
    private  BankCard    bankCard;          // BIR VAQTNI ÖZIDA FAQAT 1 TA CARDTADAN B.DI



    @CreatedBy
    private Integer createdBy;

    @LastModifiedBy
    private Integer updatedBy;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;
}
