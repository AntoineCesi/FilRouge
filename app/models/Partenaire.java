/***********************************************************************
 * Module:  Partenaire.java
 * Author:  antoi_000
 * Purpose: Defines the Class Partenaire
 ***********************************************************************/

import java.util.*;

/** @pdOid 38718f44-ae59-4191-be4f-df999c07d9b1 */
public class Partenaire {
   /** @pdOid e9d95380-eab7-484f-b8fb-0610ba11ad3f */
   public long parId;
   /** @pdOid 9d7572d0-bb5b-43fd-9f2b-70852b0415c8 */
   public java.lang.String parNom;
   /** @pdOid 7acfaa99-d977-473e-be73-bd0619b5133b */
   public java.lang.String parNoSIRET;
   /** @pdOid 6a951127-8594-42f0-ae45-65999fb5c478 */
   public int parCapital;
   /** @pdOid 6cceb67e-f440-411a-8648-9147df70e987 */
   public boolean parActif = 1;
   /** @pdOid f37a07f5-1ce7-427b-bcdd-ade98630506e */
   public java.lang.String parReference;
   /** @pdOid b9d5d230-976c-4cc2-9b9b-f9e4cbe9692e */
   public java.lang.String parType;
   
   /** @pdRoleInfo migr=no name=Commande assc=parPasseCom coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Commande> commande;
   /** @pdRoleInfo migr=no name=CoordonneePostale assc=perMorPossedeCooPos coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<CoordonneePostale> coordonneePostale;
   /** @pdRoleInfo migr=no name=Contact assc=perMorAvoirCont coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Contact> contact;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Commande> getCommande() {
      if (commande == null)
         commande = new java.util.HashSet<Commande>();
      return commande;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCommande() {
      if (commande == null)
         commande = new java.util.HashSet<Commande>();
      return commande.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommande */
   public void setCommande(java.util.Collection<Commande> newCommande) {
      removeAllCommande();
      for (java.util.Iterator iter = newCommande.iterator(); iter.hasNext();)
         addCommande((Commande)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommande */
   public void addCommande(Commande newCommande) {
      if (newCommande == null)
         return;
      if (this.commande == null)
         this.commande = new java.util.HashSet<Commande>();
      if (!this.commande.contains(newCommande))
         this.commande.add(newCommande);
   }
   
   /** @pdGenerated default remove
     * @param oldCommande */
   public void removeCommande(Commande oldCommande) {
      if (oldCommande == null)
         return;
      if (this.commande != null)
         if (this.commande.contains(oldCommande))
            this.commande.remove(oldCommande);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommande() {
      if (commande != null)
         commande.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<CoordonneePostale> getCoordonneePostale() {
      if (coordonneePostale == null)
         coordonneePostale = new java.util.HashSet<CoordonneePostale>();
      return coordonneePostale;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCoordonneePostale() {
      if (coordonneePostale == null)
         coordonneePostale = new java.util.HashSet<CoordonneePostale>();
      return coordonneePostale.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCoordonneePostale */
   public void setCoordonneePostale(java.util.Collection<CoordonneePostale> newCoordonneePostale) {
      removeAllCoordonneePostale();
      for (java.util.Iterator iter = newCoordonneePostale.iterator(); iter.hasNext();)
         addCoordonneePostale((CoordonneePostale)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCoordonneePostale */
   public void addCoordonneePostale(CoordonneePostale newCoordonneePostale) {
      if (newCoordonneePostale == null)
         return;
      if (this.coordonneePostale == null)
         this.coordonneePostale = new java.util.HashSet<CoordonneePostale>();
      if (!this.coordonneePostale.contains(newCoordonneePostale))
         this.coordonneePostale.add(newCoordonneePostale);
   }
   
   /** @pdGenerated default remove
     * @param oldCoordonneePostale */
   public void removeCoordonneePostale(CoordonneePostale oldCoordonneePostale) {
      if (oldCoordonneePostale == null)
         return;
      if (this.coordonneePostale != null)
         if (this.coordonneePostale.contains(oldCoordonneePostale))
            this.coordonneePostale.remove(oldCoordonneePostale);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCoordonneePostale() {
      if (coordonneePostale != null)
         coordonneePostale.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Contact> getContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContact */
   public void setContact(java.util.Collection<Contact> newContact) {
      removeAllContact();
      for (java.util.Iterator iter = newContact.iterator(); iter.hasNext();)
         addContact((Contact)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContact */
   public void addContact(Contact newContact) {
      if (newContact == null)
         return;
      if (this.contact == null)
         this.contact = new java.util.HashSet<Contact>();
      if (!this.contact.contains(newContact))
         this.contact.add(newContact);
   }
   
   /** @pdGenerated default remove
     * @param oldContact */
   public void removeContact(Contact oldContact) {
      if (oldContact == null)
         return;
      if (this.contact != null)
         if (this.contact.contains(oldContact))
            this.contact.remove(oldContact);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContact() {
      if (contact != null)
         contact.clear();
   }

}