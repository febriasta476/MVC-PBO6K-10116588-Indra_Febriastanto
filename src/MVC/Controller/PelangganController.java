/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Controller;

import javax.swing.JOptionPane;
import MVC.View.PelangganView;
import MVC.model.PelangganModel;

/**
 *
 * @author Indra F
 */
public class PelangganController {
     private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
        
    }
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("")&& email.equals("")&& noTlp.equals("")) {
            
        }else{
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih kosong");        
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih kosong");   
        }else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp masih kosong");
                
            }else {
               model.simpanForm();
        }      
    } 

    
}
