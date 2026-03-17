/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Equals {

    private String identifier;
    private String name;

    public Equals(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;

    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(this instanceof Equals)) {
            return false;
        }
        Equals object = (Equals) compared;
        if (this.identifier.equals(object.identifier)) {
            return true;
        }

        return false;
    }
    @Override
    public String toString (){
    return this.identifier + ": " + this.name;
    }

}
