import { Component } from '@angular/core';
import { ButtonComponent } from '../reusable/button/button.component';

@Component({
    selector: 'app-nav-bar',
    templateUrl: './nav-bar.component.html',
    styleUrl: './nav-bar.component.css',
    standalone: true,
    imports:[ButtonComponent],
})
export class NavBarComponent {

}
