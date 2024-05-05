import { Routes } from "@angular/router";
import { map } from "rxjs/operators";
import { HomeComponent } from "./home/home.component";
import { CompanyComponent } from "./company/company.component";
import { SignInComponent } from "./sign-in/sign-in.component";
export const routes: Routes = [
  {
    path: "",
    loadComponent: () => HomeComponent,
  },
  {
    path: "company",
    loadComponent: () => CompanyComponent,
  },
  {
    path: "sign-in",
    loadComponent: () => SignInComponent,
  },
  {
    path: "**",
    loadComponent: () => HomeComponent,
  },
];