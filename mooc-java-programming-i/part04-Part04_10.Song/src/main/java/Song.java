/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Song {

    private String name;
    private int lengthinSeconds;

    public Song(String name, int length) {
        this.name = name;
        this.lengthinSeconds = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.lengthinSeconds;
    }

}
