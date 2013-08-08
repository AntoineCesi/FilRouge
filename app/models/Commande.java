/***********************************************************************
 * Module:  Commande.java
 * Author:  antoi_000
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import java.util.*;

/** @pdOid 6f5ce6f3-0bdc-4a07-a8e6-e5d29188f0b1 */
public class Commande {
   /** @pdOid 4b19e3fe-a475-4dbf-8f8f-4fcac9c1fa43 */
   public long comId;
   /** @pdOid a36a59ac-560c-4d3d-aa73-596af566a60b */
   public java.lang.String comReference;
   /** @pdOid 7c842e20-5750-4797-a450-c8427c13bdce */
   public java.lang.String comType;
   
   public java.util.Collection commandeAvoirStatut;
   public java.util.Collection compositionCommande;
   /** @pdRoleInfo migr=no name=Reception assc=recCom coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Reception> reception;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reception> getReception() {
      if (reception == null)
         reception = new java.util.HashSet<Reception>();
      return reception;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReception() {
      if (reception == null)
         reception = new java.util.HashSet<Reception>();
      return reception.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReception */
   public void setReception(java.util.Collection<Reception> newReception) {
      removeAllReception();
      for (java.util.Iterator iter = newReception.iterator(); iter.hasNext();)
         addReception((Reception)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReception */
   public void addReception(Reception newReception) {
      if (newReception == null)
         return;
      if (this.reception == null)
         this.reception = new java.util.HashSet<Reception>();
      if (!this.reception.contains(newReception))
         this.reception.add(newReception);
   }
   
   /** @pdGenerated default remove
     * @param oldReception */
   public void removeReception(Reception oldReception) {
      if (oldReception == null)
         return;
      if (this.reception != null)
         if (this.reception.contains(oldReception))
            this.reception.remove(oldReception);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReception() {
      if (reception != null)
         reception.clear();
   }

}