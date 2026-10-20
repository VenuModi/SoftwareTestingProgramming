# 🐉 The Troll Arena

## About the Project

The Troll Arena is a text-based adventure game developed in Java as part of a programming exercise.

The player controls a Hero who must survive battles against a Goblin and a Dragon to win the game.

## 🎮 How to Play

1. Run `TrollArena.java`.
2. Enter your Hero's name.
3. Your Hero enters the arena and encounters enemies.
4. Choose between two actions:
    - **1 – Attack:** Deal random damage to the enemy.
    - **2 – Heal:** Restore the Hero's health.
5. Defeat both enemies to win the game.

If the Hero's health reaches zero, the enemy wins and the game ends.

## ⚔️ Game Characters

| Character | Starting Health | Attack Damage |
|---|---|---|
| Hero | 100 | Random: 10–25 |
| Dragon | 80 | Random: 10–30 |
| Goblin | 50 | Random: 5–15 |

Each character has its own ASCII art displayed in the terminal.

## 💻 Java Concepts Used

- **Classes and Objects:** Creating different game characters.
- **Inheritance:** Hero, Dragon, and Goblin extend the abstract Character class.
- **Abstract Classes and Methods:** Shared character properties and required methods.
- **Interfaces:** Hero and Goblin implement the Healable interface.
- **Polymorphism:** Managing different enemies using the Character superclass.
- **Method Overriding:** Each character has its own attack and picture methods.
- **Random:** Generating different attack damage values.
- **Scanner:** Reading player input.
- **Loops and Conditions:** Managing battles and game outcomes.

## 📁 Project Structure

```text
src/
├── Character.java
├── Hero.java
├── Dragon.java
├── Goblin.java
├── Healable.java
└── TrollArena.java
```

## 🏆 Winning and Losing

- The Hero wins by defeating both the Goblin and Dragon.
- The Goblin wins if it defeats the Hero in the first battle.
- The Dragon wins if it defeats the Hero in the second battle.
- The game announces the winner and displays a Game Over message.


## 📚 Purpose

This project was created to practice object-oriented programming (OOP) concepts in Java.
