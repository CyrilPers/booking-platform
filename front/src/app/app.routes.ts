import { Routes } from "@angular/router";
import { map } from "rxjs/operators";
import { HomeComponent } from "./home/home.component";
import { CompanyComponent } from "./company/company.component";
export const routes: Routes = [
  {
    path: "",
    loadComponent: () => HomeComponent,
  },
  {
    path: "company",
    loadComponent: () => CompanyComponent,
  },
];