import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { PageEvent } from '@angular/material/paginator';
import { Router } from '@angular/router';
import { ConfirmationDialogComponent } from 'src/app/confirmation-dialog/confirmation-dialog.component';
import { RechargeService } from 'src/app/services/recharge.service';
import { Recharge } from 'src/domain/recharge';

@Component({
  selector: 'app-read-recharge-component',
  templateUrl: './read-recharge-component.component.html',
  styleUrls: ['./read-recharge-component.component.scss']
})
export class ReadRechargeComponentComponent {

  recharges: Recharge[] = [];
  filteredRecharges: Recharge[] = [];
  filterOperator: string = '';
  filterSeller: string = '';
  showFilter = false;
  pageSize = 5;
  from:number = 0;
  to:number = 5;
  constructor(public dialog: MatDialog, private rechargeService: RechargeService, private enrutador: Router) {
    this.getAllRecharges();
  }

  cambiarPagina(event: PageEvent) {
    console.log(event);
    this.pageSize = event.pageSize;
    this.from = event.pageIndex * event.pageSize;
    this.to = this.from + event.pageSize;
  }

  ngOnit() {
    this.getAllRecharges();
  }

  reset() {
    this.filterOperator = '';
    this.filterSeller = '';
    this.applyFilters();
  }

  getAllRecharges() {
    this.rechargeService.getAll().subscribe((data) => {
      console.log(data);
      this.recharges = data;
      this.applyFilters();
      this.filteredRecharges = data.sort((a, b) => {
        return new Date(b.transactionDate).getTime() - new Date(a.transactionDate).getTime();
      });
    });
  }

  applyFilters() {
    this.filteredRecharges = this.recharges.filter(recharge =>
      recharge.operator.toLowerCase().includes(this.filterOperator.toLowerCase()) &&
      recharge.seller.toLowerCase().includes(this.filterSeller.toLowerCase())
    );
  }

  mostrarOcultarFiltro() {
    this.showFilter = !this.showFilter;
  }
}
