/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public interface DAO {
    public abstract void simpan();
    public abstract void update();
    public abstract void hapus();
    public abstract List tampil();
}