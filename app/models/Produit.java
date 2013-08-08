/***********************************************************************
 * Module:  Produit.java
 * Author:  antoi_000
 * Purpose: Defines the Class Produit
 ***********************************************************************/

import java.util.*;

/** @pdOid 16c48530-f06e-43f4-a5bc-9b7508f68d08 */
public class Produit {
   /** @pdOid 743e4b05-d21b-4068-a956-bbd19fd51e7b */
   public long proId;
   /** @pdOid 50ed8e62-4f8c-4af0-8a77-1375c911d41e */
   public java.lang.String proNom;
   /** @pdOid 4dd5377e-7995-49d0-8c36-b3b6af34140d */
   public java.lang.String proReference;
   /** @pdOid 97410917-5f5e-411c-acb7-dd64fd6df1c4 */
   public java.lang.String proUnite;
   /** @pdOid 9082b14c-a528-470f-aba1-af9a7c2160d3 */
   public float proQuantiteStock = 0;
   /** @pdOid 5cf660e6-163c-4e71-9043-6c15e8d7b1ba */
   public float proSeuilQteMin = 0;
   /** @pdOid f7b000ee-97b3-4da2-b91a-d0d9c829fa29 */
   public float proSeuilQteMax = 0;
   /** @pdOid 292f9076-58b2-42de-8ce8-0213335ba556 */
   public float proQteMaxEmp = 0;
   /** @pdOid 045ed1f9-92f5-429f-84ea-5c597d901592 */
   public float proPrixUnitaire = 0;
   /** @pdOid 00551139-9964-47ec-a2f8-d5c32174aa8e */
   public java.lang.String proCouleur;
   /** @pdOid 00a6c0f8-63c9-4196-81c3-7064a7aa9937 */
   public boolean proActif = 1;
   
   public java.util.Collection compositionCommande;
   /** @pdRoleInfo migr=no name=Reception assc=recPro coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Reception> reception;
   /** @pdRoleInfo migr=no name=Fabrication assc=fabPro coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Fabrication> fabrication;
   /** @pdRoleInfo migr=no name=Lot assc=proComposeLot coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Lot> lot;
   
   
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
   /** @pdGenerated default getter */
   public java.util.Collection<Fabrication> getFabrication() {
      if (fabrication == null)
         fabrication = new java.util.HashSet<Fabrication>();
      return fabrication;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFabrication() {
      if (fabrication == null)
         fabrication = new java.util.HashSet<Fabrication>();
      return fabrication.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFabrication */
   public void setFabrication(java.util.Collection<Fabrication> newFabrication) {
      removeAllFabrication();
      for (java.util.Iterator iter = newFabrication.iterator(); iter.hasNext();)
         addFabrication((Fabrication)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFabrication */
   public void addFabrication(Fabrication newFabrication) {
      if (newFabrication == null)
         return;
      if (this.fabrication == null)
         this.fabrication = new java.util.HashSet<Fabrication>();
      if (!this.fabrication.contains(newFabrication))
         this.fabrication.add(newFabrication);
   }
   
   /** @pdGenerated default remove
     * @param oldFabrication */
   public void removeFabrication(Fabrication oldFabrication) {
      if (oldFabrication == null)
         return;
      if (this.fabrication != null)
         if (this.fabrication.contains(oldFabrication))
            this.fabrication.remove(oldFabrication);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFabrication() {
      if (fabrication != null)
         fabrication.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Lot> getLot() {
      if (lot == null)
         lot = new java.util.HashSet<Lot>();
      return lot;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLot() {
      if (lot == null)
         lot = new java.util.HashSet<Lot>();
      return lot.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLot */
   public void setLot(java.util.Collection<Lot> newLot) {
      removeAllLot();
      for (java.util.Iterator iter = newLot.iterator(); iter.hasNext();)
         addLot((Lot)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLot */
   public void addLot(Lot newLot) {
      if (newLot == null)
         return;
      if (this.lot == null)
         this.lot = new java.util.HashSet<Lot>();
      if (!this.lot.contains(newLot))
         this.lot.add(newLot);
   }
   
   /** @pdGenerated default remove
     * @param oldLot */
   public void removeLot(Lot oldLot) {
      if (oldLot == null)
         return;
      if (this.lot != null)
         if (this.lot.contains(oldLot))
            this.lot.remove(oldLot);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLot() {
      if (lot != null)
         lot.clear();
   }

}