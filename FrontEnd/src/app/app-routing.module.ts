import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditViewComponent } from './edit-view/edit-view.component';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { FileCheckComponent } from './file-check/file-check.component';


const routes: Routes = [
  {
    path: 'file-check',
    component: FileCheckComponent
  },
  {
    path: "file-upload",
    component: FileUploadComponent
  }, {
    path: 'edit-view/:serialnumber',
    component: EditViewComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
