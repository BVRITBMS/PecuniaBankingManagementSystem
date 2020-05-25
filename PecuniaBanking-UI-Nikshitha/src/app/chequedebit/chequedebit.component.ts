import { Component, OnInit } from '@angular/core';
import { Cheque } from '../model/cheque';
import {TransactionsResponse} from '../model/transaction-response';
import { TransactionService } from '../Services/transaction.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-chequedebit',
  templateUrl: './chequedebit.component.html',
  styleUrls: ['./chequedebit.component.css']
})
export class ChequedebitComponent implements OnInit {

 service: TransactionService;
  msg: string = null;
  constructor(service: TransactionService) {
    this.service = service;
  }


 ngOnInit(): void {
  }
  cheque:Cheque;
  transactionsResponse:TransactionsResponse;
 
  debitUsingCheque(form:any){
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
    
    let result:Observable<TransactionsResponse>=this.service.debitUsingCheque(this.cheque); // adding to the store
        result.subscribe((transactionsResponse:TransactionsResponse)=>{
        this.transactionsResponse=transactionsResponse;
     if(transactionsResponse.transactionId != null){ alert(
            'Success! Amount debited with Transaction ID: ' +
              transactionsResponse.transactionId) 
     } else{
       alert('Failed to debit the money with given cheque details. Please contact the IT desk for any queries.');
     }
    },
    err=>{
      alert('Failed to debit the money with given cheque details. Please contact the IT desk for any help.');
    console.log("err="+err);
    } );

    form.reset();
  }
}
