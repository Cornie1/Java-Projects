/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceinvaders;

/**
 *
 * @author ajkil
 */
class Bullet extends Entity {
    public boolean blnActive = true;
    public int intDirection; // -1 for up (player bullet), 1 for down (enemy bullet)

    public Bullet(int x, int y, int direction) {
        super(x, y, '|'); // Bullet represented by '|'
        this.intDirection = direction; //(W3Schools, 2025)
    }

    public void update() { // (Farrell, 2022)
        y += intDirection;
        if (y < 0 || y >= SpaceInvaders.intHeight) {
            blnActive = false;
        }
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Java For Loop (no date). Available at: https://www.w3schools.com/java/java_for_loop.asp (Accessed: September 4, 2025).
*/