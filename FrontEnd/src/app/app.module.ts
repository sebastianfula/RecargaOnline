import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import{AddRechargeComponentComponent} from './recharges-component/add-recharge-component/add-recharge-component.component'
import{ReadRechargeComponentComponent} from './recharges-component/read-recharge-component/read-recharge-component.component'


import{ConfirmationDialogComponent} from './confirmation-dialog/confirmation-dialog.component'

// icons
import { TablerIconsModule } from 'angular-tabler-icons';
import * as TablerIcons from 'angular-tabler-icons/icons';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
//Import all material modules
import { MaterialModule } from './material.module';
import { FormsModule, ReactiveFormsModule, NgModel } from '@angular/forms';

//Import Layouts
import { FullComponent } from './layouts/full/full.component';
import { BlankComponent } from './layouts/blank/blank.component';
import { MatSnackBar } from '@angular/material/snack-bar';

// Vertical Layout
import { SidebarComponent } from './layouts/full/sidebar/sidebar.component';
import { HeaderComponent } from './layouts/full/header/header.component';
import { BrandingComponent } from './layouts/full/sidebar/branding.component';
import { AppNavItemComponent } from './layouts/full/sidebar/nav-item/nav-item.component';
import { MatDialogModule } from '@angular/material/dialog';

@NgModule({
  declarations: [
    AppComponent,
    FullComponent,
    BlankComponent,
    HeaderComponent,
    BrandingComponent,
    SidebarComponent,
    AppNavItemComponent,
    ConfirmationDialogComponent,
    AddRechargeComponentComponent,
    ReadRechargeComponentComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MatDialogModule,
    MatInputModule,
    MatFormFieldModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    TablerIconsModule.pick(TablerIcons),

  ],
  exports: [TablerIconsModule  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
