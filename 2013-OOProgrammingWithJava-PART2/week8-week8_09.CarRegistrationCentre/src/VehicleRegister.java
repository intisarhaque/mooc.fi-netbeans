/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
import java.util.*;
public class VehicleRegister {
     private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
     
     public boolean add(RegistrationPlate plate, String owner)
     {
         if (owners.containsKey(plate))
         {
             return false;
         }
         else
         {
             owners.put(plate, owner);
             return true;
         }
     }
     public String get(RegistrationPlate plate)
     {
         if (owners.containsKey(plate))
         {
             return owners.get(plate);
         }
         else
         {
             return null;
         }
     }
     public boolean delete(RegistrationPlate plate)
     {
         if (owners.containsKey(plate))
         {
             owners.remove(plate);
             return true;
         }
         else
         {
             return false;
         }
     }
     public void printRegistrationPlates()
     {
         for (RegistrationPlate x: owners.keySet())
         {
             System.out.println(x.getregCode());
         }
     }
     public void printOwners()
     {
         ArrayList<String> ownernames = new ArrayList<String>();
         for (RegistrationPlate x: owners.keySet())
         {
             if (!ownernames.contains(owners.get(x)))
             {
                 ownernames.add(owners.get(x));
             }
         }
         for (String x: ownernames)
         {
             System.out.println(x);
         }
     }
}
