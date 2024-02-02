import { Routes } from '@angular/router';

// ui
import {AddRechargeComponentComponent  } from 'src/app/recharges-component/add-recharge-component/add-recharge-component.component';
import { ReadRechargeComponentComponent } from 'src/app/recharges-component/read-recharge-component/read-recharge-component.component';

import { AppBadgeComponent } from './badge/badge.component';
import { AppChipsComponent } from './chips/chips.component';
import { AppListsComponent } from './lists/lists.component';
import { AppMenuComponent } from './menu/menu.component';
import { AppTooltipsComponent } from './tooltips/tooltips.component';

export const UiComponentsRoutes: Routes = [
  {
    path: '',
    children: [
      {
        path: 'recarga',
        component: AddRechargeComponentComponent,
      },
      {
        path: 'consultar-Recarga',
        component: ReadRechargeComponentComponent,
      },

    ],
  },
];
