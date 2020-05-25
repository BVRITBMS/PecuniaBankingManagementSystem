import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Cheque } from '../model/cheque';
import { TransactionsResponse } from '../model/transaction-response';

@Injectable({
  providedIn: 'root'
})
export class TransactionService
 {

    
  client:HttpClient ;
  constructor(client:HttpClient ){
  this.client=client;
  }

   baseUrl="http://localhost:9000";
   
  public creditUsingCheque(cheque:Cheque): Observable<TransactionsResponse>{
    let url=this.baseUrl+"/creditusingcheque";
    /* let headers = new HttpHeaders();
        headers = headers.set('Content-Type', 'application/json'); */
    let result:Observable<TransactionsResponse>= this.client.post<TransactionsResponse>(url,cheque);
    return result;
   }
  
 public debitUsingCheque(cheque:Cheque): Observable<TransactionsResponse>{
    let url=this.baseUrl+"/debitusingcheque";
    
    let result:Observable<TransactionsResponse>= this.client.post<TransactionsResponse>(url,cheque);
    return result;
   }
}
