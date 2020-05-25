import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChequecreditComponent } from './chequecredit/chequecredit.component';
import { ChequedebitComponent } from './chequedebit/chequedebit.component';
import { FormsModule }   from '@angular/forms';


const routes: Routes = [
{path:'chequecredit',component:ChequecreditComponent},
{path:'chequedebit',component:ChequedebitComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
