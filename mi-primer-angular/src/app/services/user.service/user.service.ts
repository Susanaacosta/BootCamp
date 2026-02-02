import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient){ }
  //funcion para  traer lista de usuario
  getUsers(){
    return this.http.get<any[]>('Users.json');
    //return this.http.get<any[]>('https://jsonplaceholder.typicode.com/users');

  }
}
