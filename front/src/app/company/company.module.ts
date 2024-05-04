import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { CompanyComponent } from "./company.component";
import { CompanyServicesComponent } from "./company-services/company-services.component";
import { CarouselComponent } from "../reusable/carousel/carousel.component";
import { ReviewsComponent } from './reviews/reviews.component';
import { AppModule } from "../app.module";

const companyRoutes: Routes = [
  { path: "company", component: CompanyComponent },
];

@NgModule({
  declarations: [
    CarouselComponent,
    CompanyServicesComponent,
    CompanyComponent,
    ReviewsComponent,
  ],
  imports: [CommonModule, FormsModule, RouterModule.forChild(companyRoutes), AppModule],
  providers: [],
})
export class CompanyModule {}
