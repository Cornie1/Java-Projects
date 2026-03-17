/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceinvaders;

/**
 *
 * @author ajkil
 */
class EnemyShip extends Entity {
    public boolean blnAlive = true; //(W3Schools, 2025)

    public EnemyShip(int x, int y) { // (Farrell, 2022)
        super(x, y, 'M'); // Enemy represented by 'M'
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Java For Loop (no date). Available at: https://www.w3schools.com/java/java_for_loop.asp (Accessed: September 4, 2025).

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]
*/