import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { File } from '../model/file';

@Injectable({
  providedIn: 'root'
})
export class FileService {

  baseUrl = "http://localhost:8080";
  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get(this.baseUrl + "/product");
  }
  getById(serialnumber : string) : Observable<File> {
    return this.http.get<File>(this.baseUrl + "/product/" + serialnumber);
  }
  // deleteStudent(serialnumber) {
  //   return this.http.delete(this.baseUrl + "/students/" + serialnumber);
  // }
  updateFile(file: File) {
    return this.http.put(this.baseUrl + "/update", file);
  }

}
