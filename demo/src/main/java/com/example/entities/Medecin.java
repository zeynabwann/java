package com.example.entities;
import lombok.Data;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;



   
    
@Data
public class Medecin {
    private int id;
    private String nom;
    private String prenom;
    private int IdRv;
    private String Date;
    private String Heure;
    public void setId(String nextLine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
    public void setIdRv(String nextLine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIdRv'");
    }
}
 
