/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceinvaders;

/**
 *
 * @author ajkil
 */
abstract class Entity {
    public int x, y; //(W3Schools, 2025)
    public char symbol; //(W3Schools, 2025)

    public Entity(int x, int y, char symbol) { // (Farrell, 2022)
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Java For Loop (no date). Available at: https://www.w3schools.com/java/java_for_loop.asp (Accessed: September 4, 2025).
*/