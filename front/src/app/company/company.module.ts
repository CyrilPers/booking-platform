import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { CompanyComponent } from "./company.component";

const companyRoutes: Routes = [
  { path: "company", component: CompanyComponent },
];

@NgModule({
  declarations: [
    CompanyComponent
  ],
  imports: [CommonModule, FormsModule, RouterModule.forChild(companyRoutes)],
  providers: [],
})
export class CompanyModule {}
