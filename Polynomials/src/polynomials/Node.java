/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomials;

public class Node {

    int data;
    Node next;
    int power;
    int coefficient;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int power, int coefficient) {
        this.power = power;
        this.coefficient = coefficient;
    }
    
    
}
