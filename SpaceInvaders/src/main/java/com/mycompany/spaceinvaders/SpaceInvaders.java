/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spaceinvaders;

import java.util.Scanner;

public class SpaceInvaders { 
    public static final int intWidth = 20;
    public static final int intHeight = 15;
    public static char[][] grid = new char[intHeight][intWidth]; //(W3Schools, 2025)

    public static Player player; //(W3Schools, 2025)
    public static EnemyShip[] enemies; //(W3Schools, 2025)
    public static Bullet[] bullets; //(W3Schools, 2025)

    public static int intMaxBullets = 5; //(StackOverflow, 2014)
    public static Scanner scanner = new Scanner(System.in);
    public static int intEnemyDirection = 1; // 1 = right, -1 = left


    public static void main(String[] args) {
        initGame();

        boolean blnRunning = true;
        int intTick = 0;

        while (blnRunning) { //(W3Schools, 2025)
            clearGrid();
            placeEntity(player);

            for (EnemyShip enemy : enemies) { //(W3Schools, 2025)
                if (enemy != null && enemy.blnAlive) placeEntity(enemy);
            }

            for (Bullet bullet : bullets) { //(W3Schools, 2025)
                if (bullet != null && bullet.blnActive) placeEntity(bullet);
            }

            printGrid();

            System.out.print("Enter command (a=left, d=right, s=shoot, q=quit, enter=skip): ");
            String strInput = scanner.nextLine().trim().toLowerCase();

            switch (strInput) { //(StackOverflow, 2025)
                case "a": player.moveLeft(0); break;
                case "d": player.moveRight(intWidth - 1); break;
                case "s": shootBullet(); break;
                case "q": blnRunning = false; break;
                default: /* skip turn */ break;
            }

            updateBullets();
            checkCollisions();

            if (intTick % 5 == 0) { // How many turns per downward movement of enemies
                updateEnemies();
            }
            
            if (allEnemiesDead()) {
                System.out.println("You win!");
                break;
            }

            if (enemyReachedBottom() || playerHitByEnemy()) {
                System.out.println("Game Over!");
                break;
            }

            intTick++;
        }
    }

    public static void initGame() {
        player = new Player(intWidth / 2, intHeight - 1);

        enemies = new EnemyShip[10];
        int intStartX = 3;
        int intStartY = 2;
        for (int i = 0; i < enemies.length; i++) { //(W3Schools, 2025)
            enemies[i] = new EnemyShip(intStartX + i, intStartY);
        }

        bullets = new Bullet[intMaxBullets];
    }

    public static void clearGrid() {
        for (int i = 0; i < intHeight; i++) { //(W3Schools, 2025)
            for (int j = 0; j < intWidth; j++) {
                grid[i][j] = ' '; //(W3Schools, 2025)
            }
        }
    }

    public static void placeEntity(Entity e) {
        if (e.x >= 0 && e.x < intWidth && e.y >= 0 && e.y < intHeight) {
            grid[e.y][e.x] = e.symbol; //(W3Schools, 2025)
        }
    }

    public static void printGrid() {
        System.out.println("-".repeat(intWidth + 2));
        for (int i = 0; i < intHeight; i++) { //(W3Schools, 2025)
            System.out.print("|");
            for (int j = 0; j < intWidth; j++) {
                System.out.print(grid[i][j]); //(W3Schools, 2025)
            }
            System.out.println("|");
        }
        System.out.println("-".repeat(intWidth + 2));
    }
    //Spawns bullets from player
    public static void shootBullet() {
        for (int i = 0; i < bullets.length; i++) { //(W3Schools, 2025)
            if (bullets[i] == null || !bullets[i].blnActive) { //(W3Schools, 2025)
                bullets[i] = new Bullet(player.x, player.y - 1, -1); //(W3Schools, 2025)
                break;
            }
        }
    }
    //Updates bullets movement up by 1
    public static void updateBullets() {
        for (int i = 0; i < bullets.length; i++) { //(W3Schools, 2025)
            if (bullets[i] != null && bullets[i].blnActive) { //(W3Schools, 2025)
                bullets[i].update();
            }
        }
    }
    //Moves enemies down 1 tile
    public static void updateEnemies() {
        boolean atEdge = false;

        // Check if any enemy will go out of bounds in current direction
        for (EnemyShip enemy : enemies) {
            if (enemy != null && enemy.blnAlive) {
                if ((intEnemyDirection == 1 && enemy.x >= intWidth - 1) ||
                    (intEnemyDirection == -1 && enemy.x <= 0)) {
                    atEdge = true;
                    break;
                }
            }
        }

        if (atEdge) {
            // Drop all enemies down 1 and reverse direction
            for (EnemyShip enemy : enemies) {
                if (enemy != null && enemy.blnAlive) {
                    enemy.y += 1;
                }
            }
            intEnemyDirection *= -1; // switch direction
        } else {
            // Move sideways
            for (EnemyShip enemy : enemies) {
                if (enemy != null && enemy.blnAlive) {
                    enemy.x += intEnemyDirection;
                }
            }
        }
    }

    //Checks if enemie is hit by bullet
    public static void checkCollisions() { // (Martin, 2019)
        for (Bullet bullet : bullets) { //(W3Schools, 2025)
            if (bullet != null && bullet.blnActive && bullet.intDirection == -1) {
                for (EnemyShip enemy : enemies) {
                    if (enemy != null && enemy.blnAlive && bullet.x == enemy.x && bullet.y == enemy.y) {
                        enemy.blnAlive = false;
                        bullet.blnActive = false;
                        System.out.println("Enemy hit!");
                    }
                }
            }
        }
    }
    //Win Condition for Player
    public static boolean allEnemiesDead() { //(W3Schools, 2025)
        for (EnemyShip enemy : enemies) { //(W3Schools, 2025)
            if (enemy != null && enemy.blnAlive) return false;
        }
        return true;
    }
    //Win Condition for enemies
    public static boolean enemyReachedBottom() { //(W3Schools, 2025)
        for (EnemyShip enemy : enemies) { //(W3Schools, 2025)
            if (enemy != null && enemy.blnAlive && enemy.y >= intHeight - 1) return true;
        }
        return false;
    }
    //Win Condition for enemies
    public static boolean playerHitByEnemy() { // (Farrell, 2022)
        for (EnemyShip enemy : enemies) {//(W3Schools, 2025)
            if (enemy != null && enemy.blnAlive && enemy.x == player.x && enemy.y == player.y) {
                return true;
            }
        }
        return false;
    }
}

/*
References

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]

Martin, R.C. (2019) *Best practice on how to organize methods*, 10 March. Stack Overflow.[source code] Available at: https://stackoverflow.com/questions/38846698/best-practice-on-how-to-organize-methods (Accessed: 11 June 2025).

StackOverflow. (2014) *What do I have to return for public static int?*. Available at:https://stackoverflow.com/questions/27336712/what-do-i-have-to-return-for-public-static-int (Accessed: 02 September 2025).

Java For Loop (no date). Available at: https://www.w3schools.com/java/java_for_loop.asp (Accessed: September 4, 2025).

Java While Loop (no date). Available at: https://www.w3schools.com/java/java_while_loop.asp (Accessed: September 4, 2025).

Java Arrays (no date). Available at: https://www.w3schools.com/java/java_arrays.asp (Accessed: September 4, 2025).

c - Switch Statements Using String Input - Stack Overflow (no date). Available at: https://stackoverflow.com/questions/41469864/switch-statements-using-string-input (Accessed: September 4, 2025).
*/
