import { Component, Input } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { RechargeService } from 'src/app/services/recharge.service';
import { Recharge } from 'src/domain/recharge';

@Component({
  selector: 'app-add-recharge-component',
  templateUrl: './add-recharge-component.component.html',
  styleUrls: ['./add-recharge-component.component.scss']
})
export class AddRechargeComponentComponent {

  recharge: Recharge = new Recharge();
maxCharacter: 30;

@Input() childMessage: string;
// En tu constructor
constructor(private rechargeService: RechargeService, private enrutador: Router, private _snackBar: MatSnackBar) {
this.recharge = new Recharge();
}


onSubmit(){
  if (!this.recharge.value || !this.recharge.number || !this.recharge.operator || !this.recharge.typeRecharge || !this.recharge.seller) {
    this.goHere();
    this._snackBar.open('Por favor completa todos los campos', 'Cerrar', {
      duration: 2000,
    });
  }else{
    this.saveCourse();
    this._snackBar.open('Recarga exitosa', 'Cerrar', {
      duration: 2000,
    });
  }
}
saveCourse() {
  this.rechargeService.addRecharge(this.recharge).subscribe(
    {
      next: (datos) => {
        this._snackBar.open('Recarga exitosa', 'Cerrar', {
          duration: 2000,
        });
        this.goListCourse();
      },
      error: (error: any) => {
        this.goHere();

      }
    });
}
goListCourse(){
  this.enrutador.navigate(['/ui-components/consultar-Recarga']);
}
goHere(){
  this.enrutador.navigate(['/ui-components/recarga']);
}

}
