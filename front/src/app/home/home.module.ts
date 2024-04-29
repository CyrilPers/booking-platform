import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { HomeComponent } from "./home.component";

const homeRoutes: Routes = [
  { path: "", component: HomeComponent },
];

@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [CommonModule, FormsModule, RouterModule.forChild(homeRoutes)],
  providers: [],
})
export class HomeModule {}
