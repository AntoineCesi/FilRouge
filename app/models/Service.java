/***********************************************************************
 * Module:  Service.java
 * Author:  antoi_000
 * Purpose: Defines the Class Service
 ***********************************************************************/

import java.util.*;

/** @pdOid 849b5759-1891-47dd-b2d1-3b0f5db7c82f */
public class Service {
   /** @pdOid a3a64c0c-1f88-4917-80ae-8f995b365707 */
   public long serId;
   /** @pdOid 6416c678-1477-4e6c-b932-e419e13827ab */
   public java.lang.String serLibelle;
   
   /** @pdRoleInfo migr=no name=Salarie assc=empTravailSer coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Salarie> salarie;
   /** @pdRoleInfo migr=no name=Alerte assc=aleConcerneSer coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Alerte> alerte;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Salarie> getSalarie() {
      if (salarie == null)
         salarie = new java.util.HashSet<Salarie>();
      return salarie;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSalarie() {
      if (salarie == null)
         salarie = new java.util.HashSet<Salarie>();
      return salarie.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSalarie */
   public void setSalarie(java.util.Collection<Salarie> newSalarie) {
      removeAllSalarie();
      for (java.util.Iterator iter = newSalarie.iterator(); iter.hasNext();)
         addSalarie((Salarie)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSalarie */
   public void addSalarie(Salarie newSalarie) {
      if (newSalarie == null)
         return;
      if (this.salarie == null)
         this.salarie = new java.util.HashSet<Salarie>();
      if (!this.salarie.contains(newSalarie))
         this.salarie.add(newSalarie);
   }
   
   /** @pdGenerated default remove
     * @param oldSalarie */
   public void removeSalarie(Salarie oldSalarie) {
      if (oldSalarie == null)
         return;
      if (this.salarie != null)
         if (this.salarie.contains(oldSalarie))
            this.salarie.remove(oldSalarie);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSalarie() {
      if (salarie != null)
         salarie.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Alerte> getAlerte() {
      if (alerte == null)
         alerte = new java.util.HashSet<Alerte>();
      return alerte;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAlerte() {
      if (alerte == null)
         alerte = new java.util.HashSet<Alerte>();
      return alerte.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAlerte */
   public void setAlerte(java.util.Collection<Alerte> newAlerte) {
      removeAllAlerte();
      for (java.util.Iterator iter = newAlerte.iterator(); iter.hasNext();)
         addAlerte((Alerte)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAlerte */
   public void addAlerte(Alerte newAlerte) {
      if (newAlerte == null)
         return;
      if (this.alerte == null)
         this.alerte = new java.util.HashSet<Alerte>();
      if (!this.alerte.contains(newAlerte))
         this.alerte.add(newAlerte);
   }
   
   /** @pdGenerated default remove
     * @param oldAlerte */
   public void removeAlerte(Alerte oldAlerte) {
      if (oldAlerte == null)
         return;
      if (this.alerte != null)
         if (this.alerte.contains(oldAlerte))
            this.alerte.remove(oldAlerte);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAlerte() {
      if (alerte != null)
         alerte.clear();
   }

}