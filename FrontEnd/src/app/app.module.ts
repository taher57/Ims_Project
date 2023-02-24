import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from "@angular/common/http"
import { FileService } from './services/file.service';
import { FileCheckComponent } from './file-check/file-check.component';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { FormsModule } from '@angular/forms';
import { EditViewComponent } from './edit-view/edit-view.component';
import { FileFilterPipePipe } from './file-filter-pipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    FileCheckComponent,
    FileUploadComponent,
    EditViewComponent,
    FileFilterPipePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [FileService],
  bootstrap: [AppComponent]
})
export class AppModule { }
