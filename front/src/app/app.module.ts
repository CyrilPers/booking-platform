import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { PageNotFoundComponent } from "./page-not-found/page-not-found.component";
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { CompanyModule } from "./company/company.module";
import { HomeModule } from "./home/home.module";
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { FooterComponent } from './footer/footer.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { ButtonComponent } from './reusable/button/button.component';

@NgModule({
  declarations: [AppComponent, PageNotFoundComponent, FooterComponent, NavBarComponent, ButtonComponent],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    CompanyModule,
    HomeModule,
    AppRoutingModule,
  ],
  exports: [ButtonComponent],
  providers: [
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
