import { Component, OnInit } from '@angular/core';
import { Cheque } from '../model/cheque';
import {TransactionsResponse} from '../model/transaction-response';
import { TransactionService } from '../Services/transaction.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { Alert } from 'selenium-webdriver';


@Component({
  selector: 'app-chequecredit',
  templateUrl: './chequecredit.component.html',
  styleUrls: ['./chequecredit.component.css']
})
export class ChequecreditComponent implements OnInit {
  service: TransactionService;
  msg: string = null;
  constructor(service: TransactionService) {
    this.service = service;
  }


  ngOnInit(): void {
  }
  cheque:Cheque;
  transactionsResponse:TransactionsResponse;
 
  creditUsingCheque(form:any){
    let details=form.value;
    let cheque_id=details.cheque_id;
    let amount=details.amount;
    let account_id=details.account_id;
    let issued_date=details.issued_date;
    let bank_name=details.bank_name;
    let ifsc=details.ifsc;
    
    this.cheque=new Cheque();
    this.cheque.cheque_id=cheque_id;
    this.cheque.amount=amount;
    this.cheque.account_id=account_id;
    this.cheque.issued_date=issued_date;
    this.cheque.bank_name=bank_name;
    this.cheque.ifsc=ifsc;
    
    let result:Observable<TransactionsResponse>=this.service.creditUsingCheque(this.cheque); // adding to the store
        result.subscribe((transactionsResponse:TransactionsResponse)=>{
        this.transactionsResponse=transactionsResponse;
     if(transactionsResponse.transactionId != null){ alert(
            'Success! Amount credited with Transaction ID: ' +
              transactionsResponse.transactionId) 
     } else{
       alert('Failed to credit the money with given cheque details. Please contact the IT desk for any queries.');
     }
    },
    err=>{
      alert('Failed to credit the money with given cheque details. Please contact the IT desk for any help.');
    console.log("err="+err);
    } );

    form.reset();
  }
}
