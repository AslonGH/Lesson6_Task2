package uz.pdp.task_2.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;

  @Data
  public class BankCardDto {

  @NotNull
  @Size(min = 3,  max = 50)
  private String  firstname;

  @NotNull
  @Size(min = 3,  max = 50)
  private String  lastname;

  @NotNull
  @Size(min = 16, max = 16)
  private String  number_16;

  @NotNull
  @Size(min = 3,  max = 3)
  private String  CVVCode_3;

  @NotNull
  @Size(min = 4, max = 4)
  private String   parole_4;


  private Double      balanceInSum;
  private Double      balanceInDollar;
  private String      expiredDate;
  private LocalDate   validityPeriod;
  private Integer     cardType;
  private Integer     bankId;

  }
