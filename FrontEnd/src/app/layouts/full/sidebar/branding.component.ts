import { Component } from '@angular/core';

@Component({
  selector: 'app-branding',
  template: `
   <div class="branding d-flex justify-content-center">
  <a href="/">
    <img
      src="./assets/images/logos/loguito.png"
      class="m-2"
      alt="logo"
      style="width: 150px; margin-right: 10px;"
    />
  </a>
</div>

  `,
})
export class BrandingComponent {
  constructor() {}
}
