import { BanksDetails } from './bank';

export class Cheque
{
    cheque_id :number;
    account_id :number;
    amount:number;
    issued_date:Date;
    bank_name :String;
    ifsc :String;
    chequeAccountNo:number;
    transId:number;
    accId:number;
    type:string;
    dateOfTrans:string;
}