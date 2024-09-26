package com.example.repository.database;
import com.example.repository.database.DatabaseImpl;

import com.example.entities.Medecin;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedecinRepositoryBDImpl {
    public void insert(Medecin medecin) {
        Statement stm;
        Connection connect;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Devoirjava", "root", "root");
            String sql = "INSERT INTO `Medecin` (`nom`, `prenom`, `date`, `heure`,) VALUES(?,?,?)";
            stm = connect.createStatement();
            stm.setString(medecin.getNom());
            stm.setString(medecin.getPrenom());
            stm.setString(medecin.getDate());
            stm.setString(medecin.getHeure());

            stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {

            }
            System.err.println("Connection à la base etablie");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement du fichier");
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données");
        }

    }
}
