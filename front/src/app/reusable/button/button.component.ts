import { Component, Input } from '@angular/core';

@Component({
    selector: 'app-button',
    templateUrl: './button.component.html',
    styleUrl: './button.component.scss',
    standalone: true
})
export class ButtonComponent {
    @Input() label: String = "Bouton"
    @Input() fontSize: String = "1rem"
    @Input() padding: String = "0.5rem 1rem"
    // white-btn or black-btn
    @Input() color: String = "white"
    @Input() disabled: boolean = false
}
