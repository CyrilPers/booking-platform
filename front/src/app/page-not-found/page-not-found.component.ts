import { Component } from "@angular/core";

@Component({
  selector: "page-404",
  template: `
    <div class="center">
      <h1>Hey, cette page n'existe pas !</h1>
      <a routerLink="">
        Retourner à l' accueil
      </a>
    </div>
  `,
})
export class PageNotFoundComponent {}
