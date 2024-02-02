import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Recharge } from '../../domain/recharge';

const urlBase = "http://localhost:8081/api";
@Injectable({
  providedIn: 'root'

})
export class RechargeService {


  constructor(private http: HttpClient) {}


    getAll():Observable<Recharge[]>{
      return this.http.get<Recharge[]>(`${urlBase}/recharges/consult`)
    }

    addRecharge(recharge: Recharge): Observable<Object>{
      return this.http.post(`${urlBase}/recharges/create`, recharge)
    }

    }

