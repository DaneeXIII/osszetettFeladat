/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszetettfeladat;

/**
 *
 * @author szark
 */
import java.util.Scanner;
public class OsszetettFeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     *  1. Hozz létre két tömböt: szamok1, szamok2 néven!
        2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
        3. Az elemek a -50 és +50 értéktartományba essenek.
        4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
        6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
        7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
        8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
        9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
     */
    System.out.println("\t Összetett feladat\n\t   Szarka Dániel\n\t    2020.12.03.");
 
    Scanner bemenet=new Scanner(System.in);
    char valasz=0;
    
      do{
        int darabszam=(int) (Math.random()*10)+30; 
        int szamElso[]=new int[darabszam];
        int szamMaso[]=new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamElso[i] = (int) (Math.random()*-50)+50;
            szamMaso[i] = (int) (Math.random()*-50)+50;
        }
        
        System.out.println("\nAz első tömb elemei:");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamElso[i])+" ");
        }
        
        System.out.println("");
        System.out.println("\nA második tömb elemei:");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamMaso[i])+" ");
        }
        System.out.println("");
        
        int ujTomb[]=new int[darabszam];
        int ujTombdb=0;
        
        for (int i = 0; i < darabszam; i++) {
            if (szamElso[i] % 5==0) {
                ujTomb[ujTombdb++]=szamElso[i];
            }
            if (szamMaso[i] % 5==0) {
                ujTomb[ujTombdb++]=szamMaso[i];
            }
        }
        
        System.out.println("\nAz új tömb elemei:");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i])+" ");
        }
          System.out.println("");
        System.out.println("\nA legnagyobb szám: "+ujTomb[ujTombdb-1]);
        System.out.println("\nA legkisebb szám: "+ujTomb[0]);
         
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i]==0) {
                System.out.println("Az új tömb tartalmaz 0-t");
            }
        }
        
        int legnagyobb=szamElso[0];
        int legkisebb=szamElso[0];
        
        for (int i = 0; i < darabszam; i++) {
            if (szamElso[i]>legnagyobb) {
                legnagyobb=szamElso[i];
            }
            
        }
        for (int i = 0; i < darabszam; i++) {
            if (szamElso[i]<legkisebb) {
                legkisebb=szamElso[i];
            }
        }
        
        if (legnagyobb%legkisebb==0) {
            System.out.println("\nAz első tömb legnagyobb eleme a legkisebb többszöröse");
        }
        else {
            System.out.println("\nAz első tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
        
        int legnagyobb2=szamMaso[0];
        int legkisebb2=szamMaso[0];
        
        for (int i = 0; i < darabszam; i++) {
            if (szamElso[i]>legnagyobb2) {
                legnagyobb2=szamElso[i];
            }
        }
        
        for (int i = 0; i < darabszam; i++) {
            if (szamElso[i]<legkisebb2) {
                legkisebb2=szamElso[i];
            }
        }
        
        if (ujTomb[ujTombdb-1]%ujTomb[0]==0) {
            System.out.println("\nAz új tömb legnagyobb eleme a legkisebb többszöröse");
        }
        else {
            System.out.println("\nAz új tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
        
            System.out.println("\nSzeretné újra lefuttatni a programot? i/n (i=Igen, n=Nem)");
            valasz=bemenet.next().charAt(0);
    } while ((valasz=='i') || (valasz=='I'));
      
  }
}