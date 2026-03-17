/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.spaceinvaders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceInvadersTest {

        @BeforeEach
        public void setUp() { //(Junit5, 2025)
            SpaceInvaders.initGame();
            SpaceInvaders.clearGrid();
        }

        @Test
        public void testPlayerInitialization() { //(Junit5, 2025)
            assertNotNull(SpaceInvaders.player);
            assertEquals(SpaceInvaders.intWidth / 2, SpaceInvaders.player.x);
            assertEquals(SpaceInvaders.intHeight - 1, SpaceInvaders.player.y);
        }

        @Test
        public void testEnemyInitialization() { //(Junit5, 2025)
            assertNotNull(SpaceInvaders.enemies);
            assertEquals(10, SpaceInvaders.enemies.length);
            for (EnemyShip enemy : SpaceInvaders.enemies) {
                assertTrue(enemy.blnAlive);
            }
        }
        @Test
        public void testShootBullet() {//(Junit5, 2025)
            SpaceInvaders.shootBullet();
            boolean bulletFound = false;
            for (Bullet bullet : SpaceInvaders.bullets) {// (Farrell, 2022)
                if (bullet != null && bullet.blnActive) {
                    bulletFound = true;
                    assertEquals(SpaceInvaders.player.x, bullet.x);
                    assertEquals(SpaceInvaders.player.y - 1, bullet.y);
                }
            }
            assertTrue(bulletFound, "Bullet should be created and active");
        }

        @Test
        public void testUpdateBulletsMovesUp() {//(Junit5, 2025)
            SpaceInvaders.shootBullet();
            Bullet bullet = null;
            for (Bullet b : SpaceInvaders.bullets) {// (Farrell, 2022)
                if (b != null && b.blnActive) bullet = b;
            }
            assertNotNull(bullet);
            int startY = bullet.y;
            SpaceInvaders.updateBullets();
            assertEquals(startY - 1, bullet.y, "Bullet should move upward by 1");
        }
        @Test
        public void testEnemyMovesSideways() {// (Farrell, 2022)
            int startX = SpaceInvaders.enemies[0].x;
            SpaceInvaders.intEnemyDirection = 1; // right
            SpaceInvaders.updateEnemies();
            assertEquals(startX + 1, SpaceInvaders.enemies[0].x);
        }

        @Test
        public void testEnemyDropsDownAtEdge() {//(Junit5, 2025)
            // Place one enemy at right edge
            SpaceInvaders.enemies[0].x = SpaceInvaders.intWidth - 1;
            SpaceInvaders.intEnemyDirection = 1; // moving right
            int startY = SpaceInvaders.enemies[0].y;

            SpaceInvaders.updateEnemies();// (Farrell, 2022)
            assertEquals(startY + 1, SpaceInvaders.enemies[0].y, "Enemy should drop down when at edge");
            assertEquals(-1, SpaceInvaders.intEnemyDirection, "Direction should reverse");
        }
        @Test
        public void testBulletHitsEnemy() {//(Junit5, 2025)
            // Place enemy above player
            SpaceInvaders.enemies[0].x = SpaceInvaders.player.x;
            SpaceInvaders.enemies[0].y = SpaceInvaders.player.y - 2;

            SpaceInvaders.shootBullet();
            SpaceInvaders.updateBullets();
            SpaceInvaders.checkCollisions();

            assertFalse(SpaceInvaders.enemies[0].blnAlive, "Enemy should die when hit by bullet");
        }

        @Test
        public void testAllEnemiesDead() {//(Junit5, 2025)
            for (EnemyShip enemy : SpaceInvaders.enemies) {// (Farrell, 2022)
                enemy.blnAlive = false;
            }
            assertTrue(SpaceInvaders.allEnemiesDead(), "Should return true when all enemies are dead");
        }

        @Test
        public void testEnemyReachedBottom() {//(Junit5, 2025)
            SpaceInvaders.enemies[0].y = SpaceInvaders.intHeight - 1;
            assertTrue(SpaceInvaders.enemyReachedBottom(), "Should detect enemy at bottom");
        }

        @Test
        public void testPlayerHitByEnemy() {//(Junit5, 2025)
            SpaceInvaders.enemies[0].x = SpaceInvaders.player.x;
            SpaceInvaders.enemies[0].y = SpaceInvaders.player.y;
            assertTrue(SpaceInvaders.playerHitByEnemy(), "Should detect player hit by enemy");
        }
    }



/*
Reference list:

JUnit 5 User Guide (n.d.) *JUnit 5 documentation*. Available at: https://junit.org/junit5/docs/current/user-guide/ (Accessed: 11 June 2025).

Farrell, J. (2022) *Java Programming*. 10th edn. Boston, MA: Cengage Learning. [source code]
*/