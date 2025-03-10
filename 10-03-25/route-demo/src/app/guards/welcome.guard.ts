import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot } from '@angular/router';
import { RoleService } from '../services/role.service';

@Injectable({
  providedIn : 'root'
})
export class WelcomeGuard implements CanActivate{
  
  constructor(private rs: RoleService){

  }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    if(route.data[0] === this.rs.role)
        return true;
    return false;
  }
};
