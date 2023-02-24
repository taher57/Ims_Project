import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { File } from '../model/file';
import { Response } from '../response';
import { FileService } from '../services/file.service';

@Component({
  selector: 'app-edit-view',
  templateUrl: './edit-view.component.html',
  styleUrls: ['./edit-view.component.css']
})
export class EditViewComponent implements OnInit {

  serialnumber: string;
  file = new File();
  showAlert = false;

  constructor(private route: ActivatedRoute, private fileService: FileService) { }

  ngOnInit() {
    this.serialnumber = this.route.snapshot.params.serialnumber;
    this.fileService.getById(this.serialnumber).subscribe((data : File) => {
      this.file = data;
    });
  }
  updateFile() {
    this.fileService.updateFile(this.file).subscribe((response) => {
      this.showAlert = true;
      console.log(response);
    });
  }
  closeAlert() {
    this.showAlert = false;
  }



}
