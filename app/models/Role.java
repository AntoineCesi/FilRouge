/***********************************************************************
 * Module:  Role.java
 * Author:  antoi_000
 * Purpose: Defines the Class Role
 ***********************************************************************/

import java.util.*;

/** @pdOid bf48bb5a-5940-45a0-919a-246726a6004a */
public class Role {
   /** @pdOid 42382262-1687-4e9a-9ada-aa1f213ff73f */
   public long rolId;
   /** @pdOid a0b4c172-b55f-4603-929a-70325b3a549c */
   public java.lang.String rolLibelle;
   
   /** @pdRoleInfo migr=no name=Utilisateur assc=attributionRole coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Utilisateur> utilisateur;
   /** @pdRoleInfo migr=no name=Module assc=droit coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Module> module;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Utilisateur> getUtilisateur() {
      if (utilisateur == null)
         utilisateur = new java.util.HashSet<Utilisateur>();
      return utilisateur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUtilisateur() {
      if (utilisateur == null)
         utilisateur = new java.util.HashSet<Utilisateur>();
      return utilisateur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUtilisateur */
   public void setUtilisateur(java.util.Collection<Utilisateur> newUtilisateur) {
      removeAllUtilisateur();
      for (java.util.Iterator iter = newUtilisateur.iterator(); iter.hasNext();)
         addUtilisateur((Utilisateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUtilisateur */
   public void addUtilisateur(Utilisateur newUtilisateur) {
      if (newUtilisateur == null)
         return;
      if (this.utilisateur == null)
         this.utilisateur = new java.util.HashSet<Utilisateur>();
      if (!this.utilisateur.contains(newUtilisateur))
      {
         this.utilisateur.add(newUtilisateur);
         newUtilisateur.addRole(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUtilisateur */
   public void removeUtilisateur(Utilisateur oldUtilisateur) {
      if (oldUtilisateur == null)
         return;
      if (this.utilisateur != null)
         if (this.utilisateur.contains(oldUtilisateur))
         {
            this.utilisateur.remove(oldUtilisateur);
            oldUtilisateur.removeRole(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUtilisateur() {
      if (utilisateur != null)
      {
         Utilisateur oldUtilisateur;
         for (java.util.Iterator iter = getIteratorUtilisateur(); iter.hasNext();)
         {
            oldUtilisateur = (Utilisateur)iter.next();
            iter.remove();
            oldUtilisateur.removeRole(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Module> getModule() {
      if (module == null)
         module = new java.util.HashSet<Module>();
      return module;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorModule() {
      if (module == null)
         module = new java.util.HashSet<Module>();
      return module.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newModule */
   public void setModule(java.util.Collection<Module> newModule) {
      removeAllModule();
      for (java.util.Iterator iter = newModule.iterator(); iter.hasNext();)
         addModule((Module)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newModule */
   public void addModule(Module newModule) {
      if (newModule == null)
         return;
      if (this.module == null)
         this.module = new java.util.HashSet<Module>();
      if (!this.module.contains(newModule))
      {
         this.module.add(newModule);
         newModule.addRole(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldModule */
   public void removeModule(Module oldModule) {
      if (oldModule == null)
         return;
      if (this.module != null)
         if (this.module.contains(oldModule))
         {
            this.module.remove(oldModule);
            oldModule.removeRole(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllModule() {
      if (module != null)
      {
         Module oldModule;
         for (java.util.Iterator iter = getIteratorModule(); iter.hasNext();)
         {
            oldModule = (Module)iter.next();
            iter.remove();
            oldModule.removeRole(this);
         }
      }
   }

}