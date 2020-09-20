import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { MarketComponent } from './market/market.component';
import { UserComponent } from './user/user.component';
import { SellComponent } from './sell/sell.component';
import { InsuranceComponent } from './insurance/insurance.component';


const routes: Routes = [{path: '',redirectTo: '/welcome', pathMatch: 'full'},
{path: 'welcome', component: WelcomeComponent},
{path: 'user', component: UserComponent},
{path: 'sell', component: SellComponent},
{path: 'market', component: MarketComponent},
{path: 'insurance', component: InsuranceComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
