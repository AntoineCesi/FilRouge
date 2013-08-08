/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  antoi_000
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

import java.util.*;

/** @pdOid f9f30f3c-47dc-4849-ad42-907b6243be4c */
public class Utilisateur {
   /** @pdOid 4fe0c3b0-9320-4936-9f4b-d82d9987c77e */
   public long utiId;
   /** @pdOid e08197f1-c106-43d7-b078-6c5882de3f20 */
   public java.lang.String utiIdentifiant;
   /** @pdOid 8bfe94e4-30c6-4dd8-8e37-f252d8c19e9f */
   public java.lang.String utiMdp;
   
   /** @pdRoleInfo migr=no name=Role assc=attributionRole coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
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
         newRole.addUtilisateur(this);      
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
            oldRole.removeUtilisateur(this);
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
            oldRole.removeUtilisateur(this);
         }
      }
   }

}