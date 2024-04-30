import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { CompanyComponent } from "./company.component";
import { CompanyNavBarComponent } from "./company-nav-bar/company-nav-bar.component";
import { CompanyServicesComponent } from "./company-services/company-services.component";

const companyRoutes: Routes = [
  { path: "company", component: CompanyComponent },
];

@NgModule({
  declarations: [
    CompanyServicesComponent,
    CompanyNavBarComponent,
    CompanyComponent,
  ],
  imports: [CommonModule, FormsModule, RouterModule.forChild(companyRoutes)],
  providers: [],
})
export class CompanyModule {}
