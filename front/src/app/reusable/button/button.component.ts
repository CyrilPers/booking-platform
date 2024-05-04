import { Component, Input } from '@angular/core';

@Component({
    selector: 'app-button',
    templateUrl: './button.component.html',
    styleUrl: './button.component.scss',
    standalone: true
})
export class ButtonComponent {
    @Input() label: String = "Bouton"
    @Input() fontSize: String = "14px"
    @Input() padding: String = "0.5rem 1rem"
}
