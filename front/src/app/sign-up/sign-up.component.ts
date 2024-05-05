import { Component, ViewChild } from '@angular/core';
import { ButtonComponent } from '../reusable/button/button.component';
import { FormsModule, NgForm} from '@angular/forms';
import { checkForm } from '../utils/checkPassword';

@Component({
  selector: 'app-sign-up',
  standalone: true,
  imports: [ButtonComponent, FormsModule],
  templateUrl: './sign-up.component.html',
  styleUrl: './sign-up.component.css'
})
export class SignUpComponent {
  passwordErrors: String [] = [];
  formSubmitted: boolean = false;
  @ViewChild('signInForm') signInForm: NgForm;

  ngOnInit(): void {
  }
  
  onSubmit = ():void => {
    this.formSubmitted = true;
    this.checkPassword()
  }

  checkPassword = () => {

    if (this.signInForm.value.password) {
      this.passwordErrors = checkForm(this.signInForm.value.password)
    } else {
      this.passwordErrors.push('Veuillez choisir un mot de passe')
    }
  }


}
