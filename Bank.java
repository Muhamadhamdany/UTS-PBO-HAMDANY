/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author hp
 */
public class Bank {
    int saldo;
    Bank ( int saldo) {
    this.saldo = saldo;
    }
    void getsaldo(){
        System.out.println("Selamat Datang Di Bank");
        System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
    }
    int simpanUang ( int saldo){
        this.saldo += saldo;
        System.out.println("Simpan uang : Rp." + saldo);
        System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
        return this.saldo;
    }
    int ambilUang(int saldo){
    System.out.println("Ambil uang : Rp," + saldo);
    if(this.saldo >= saldo) {
        this.saldo -= saldo;
        System.out.println("Saldo saat ini : Rp." + this.saldo);
}else {
        System.out.println("Saldo Anda Tidak Mencukupi");
        
    }
    return this.saldo;
    }
}


    

    
    

