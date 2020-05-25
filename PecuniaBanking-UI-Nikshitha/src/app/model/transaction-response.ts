import { Cheque } from './cheque';

export class TransactionsResponse {
    transactionId:number;
    accId:number;
    type:string;
    amount:number;
    cheque:Cheque;
    dateOfTrans:string;

}
