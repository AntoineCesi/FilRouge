/***********************************************************************
 * Module:  Module.java
 * Author:  antoi_000
 * Purpose: Defines the Class Module
 ***********************************************************************/

import java.util.*;

/** @pdOid ce4dd886-27a8-4add-9a58-50471f8818b6 */
public class Module {
   /** @pdOid 05264376-a9ec-46b3-a4a5-186d155af12f */
   public long modId;
   /** @pdOid 960f81b2-be33-4ed0-8a37-e4b8b32ee68b */
   public java.lang.String modLibelle;
   
   /** @pdRoleInfo migr=no name=Role assc=droit coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Role> role;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Role> getRole() {
      if (role == null)
         role = new java.util.HashSet<Role>();
      return role;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRole() {
      if (role == null)
         role = new java.util.HashSet<Role>();
      return role.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRole */
   public void setRole(java.util.Collection<Role> newRole) {
      removeAllRole();
      for (java.util.Iterator iter = newRole.iterator(); iter.hasNext();)
         addRole((Role)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRole */
   public void addRole(Role newRole) {
      if (newRole == null)
         return;
      if (this.role == null)
         this.role = new java.util.HashSet<Role>();
      if (!this.role.contains(newRole))
      {
         this.role.add(newRole);
         newRole.addModule(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRole */
   public void removeRole(Role oldRole) {
      if (oldRole == null)
         return;
      if (this.role != null)
         if (this.role.contains(oldRole))
         {
            this.role.remove(oldRole);
            oldRole.removeModule(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRole() {
      if (role != null)
      {
         Role oldRole;
         for (java.util.Iterator iter = getIteratorRole(); iter.hasNext();)
         {
            oldRole = (Role)iter.next();
            iter.remove();
            oldRole.removeModule(this);
         }
      }
   }

}