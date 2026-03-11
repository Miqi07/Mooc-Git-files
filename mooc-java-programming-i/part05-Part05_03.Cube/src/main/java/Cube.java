/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Cube {

    private int length;
    private int volume;

    public Cube(int edgelength) {
        this.length = edgelength;
    }

    public int volume() {
         
        volume =  this.length * this.length * this.length;
        return volume;

    }

    @Override
    public String toString() {
        return "The length of the edge is " + length + " and the volume " + volume();
    }
}
