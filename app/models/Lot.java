/***********************************************************************
 * Module:  Lot.java
 * Author:  antoi_000
 * Purpose: Defines the Class Lot
 ***********************************************************************/

import java.util.*;

/** @pdOid 9d8fce98-1c78-47b7-94b7-1953e099d7b8 */
public class Lot {
   /** @pdOid 9ed081b6-c7b0-4fbf-9248-a85b2346df1b */
   public long lotId;
   /** @pdOid 3056e648-5e55-4e27-8dde-3acb22b19713 */
   public java.util.Date lotDateStock;
   /** @pdOid b2614aaf-1a8d-4812-b53b-12d9706a480e */
   public java.lang.String lotReference;
   /** @pdOid 2a7a8bba-1058-4f53-a56a-cadab5884328 */
   public float lotQuantite;
   
   /** @pdRoleInfo migr=no name=Emplacement assc=empStockLot coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Emplacement> emplacement;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Emplacement> getEmplacement() {
      if (emplacement == null)
         emplacement = new java.util.HashSet<Emplacement>();
      return emplacement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEmplacement() {
      if (emplacement == null)
         emplacement = new java.util.HashSet<Emplacement>();
      return emplacement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEmplacement */
   public void setEmplacement(java.util.Collection<Emplacement> newEmplacement) {
      removeAllEmplacement();
      for (java.util.Iterator iter = newEmplacement.iterator(); iter.hasNext();)
         addEmplacement((Emplacement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEmplacement */
   public void addEmplacement(Emplacement newEmplacement) {
      if (newEmplacement == null)
         return;
      if (this.emplacement == null)
         this.emplacement = new java.util.HashSet<Emplacement>();
      if (!this.emplacement.contains(newEmplacement))
         this.emplacement.add(newEmplacement);
   }
   
   /** @pdGenerated default remove
     * @param oldEmplacement */
   public void removeEmplacement(Emplacement oldEmplacement) {
      if (oldEmplacement == null)
         return;
      if (this.emplacement != null)
         if (this.emplacement.contains(oldEmplacement))
            this.emplacement.remove(oldEmplacement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEmplacement() {
      if (emplacement != null)
         emplacement.clear();
   }

}