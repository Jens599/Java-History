/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1;

/**
 *
 * @author Jens
 */
public class Data {
    public int quantity;
    public double price;
    public String item, series,type, intendendbuyer, id;
    
    public Data(String id, int quantity, String item, String series, String type, String intendendbuyer, double price){
        this.id = id;
        this.quantity = quantity;
        this.series = series;
        this.item = item;
        this.type = type;
        this.intendendbuyer = intendendbuyer;
        this.price = price;
    }
}
