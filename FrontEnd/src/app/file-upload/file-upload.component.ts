import { Component, OnInit } from '@angular/core';
import { File } from '../model/file';
import { FileService } from '../services/file.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-file-upload',
  templateUrl: './file-upload.component.html',
  styleUrls: ['./file-upload.component.css']
})
export class FileUploadComponent implements OnInit {


  fileUploadUrl="http://localhost:8080/product/upload";
  data = [];
  showAlert = false;

  constructor( private _http:HttpClient,private fileService:FileService, private router:Router ) {

   }
  ngOnInit(): void {

   }

  file: any;

  selectFile(event: any) {
    //  console.log(event);
   this.file = event.target.files[0];
   console.log(this.file);
  }


  uploadFile()
  {
    let formData = new FormData()
    formData.append("file",this.file)
    this._http.post(this.fileUploadUrl,formData).subscribe((response :any) => {
        console.log("Excel file is uploaded successfully");
        this.showAlert=true;
      }
    )
 }
  closeAlert() {
  this.showAlert = false;
 }

}
