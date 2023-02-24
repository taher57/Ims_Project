import { Component, OnInit } from '@angular/core';
import { File } from '../model/file';
import { FileService } from '../services/file.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-file-check',
  templateUrl: './file-check.component.html',
  styleUrls: ['./file-check.component.css']
})
export class FileCheckComponent implements OnInit {


  file: File[];
searchText: any;
  constructor(private fileService: FileService, private _router:Router) { }

  ngOnInit() {
    this.fileService.getAll().subscribe((response: File[]) => {
      this.file = response;
    });
  }

}
