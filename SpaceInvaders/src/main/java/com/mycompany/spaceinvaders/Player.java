/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceinvaders;

/**
 *
 * @author ajkil
 */
class Player extends Entity { // (Farrell, 2022)
    public Player(int x, int y) {
        super(x, y, 'A'); // Player represented by 'A'
    }

    public void moveLeft(int minX) {
        if (x > minX) x--; //(W3Schools, 2025)
    }

    public void moveRight(int maxX) {
        if (x < maxX) x++;
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Java For Loop (no date). Available at: https://www.w3schools.com/java/java_for_loop.asp (Accessed: September 4, 2025).
*/