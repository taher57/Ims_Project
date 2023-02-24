import { Pipe, PipeTransform } from '@angular/core';
import { File } from './model/file';

@Pipe({
  name: 'fileFilterPipe'
})
export class FileFilterPipePipe implements PipeTransform {

  transform(list: File[], searchText: string): any {
    if (!list)
      return [];
    if (!searchText)
      return list;
    searchText = searchText.toLocaleLowerCase();

    list = list.filter(s => {
      return s.serialnumber.toLocaleLowerCase().includes(searchText);
    });
    return list;

  }

}
