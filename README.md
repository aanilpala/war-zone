war-zone
========

A 2D Multi-player robot-fight game

There is a config.xml file that can be modified in order to change some specifiacitons of 
the simulation/game and customize it. (For instance, assigning different keys to different players)
Anything in this file can be changed provided it is replaced by value that is of same type -integer, float or String- as in original file.
config.txt specifications (In the config.xml, there are numbers in place of explanations below that starts with '//')
#WarZone
//Width of the competition area //Height of the competition area
//Width of the legend //Height of the legend
//Number of clutters to be scattered on competition area
//Lower limit for strength of weak clutters //Upper limit strength of for weak clutters //Radius of weak clutters
//Lower limit for strength of sturdy clutters //Upper limit strength of for sturdy clutters //Radius of sturdy clutters
//Number of steps needed to fire periodical events (such as strategy change)
//Projectile maxiumum speed coefficient(this denotes how many times faster can a projectile move than a robofighter at most)
//Basic fighter's initial strength value //Human fighter's initial strength value
//Strength threshold for low-damaged state //Strength threshold for medium-damaged state  //Strength threshold for high-damaged state
//Radius of projectiles
#RoboFighters
//Name of the SimpleFighter //0 // Radius of fighter //Ammunition of fighter
//Name of the HumanControlledFighter //1 // Radius of fighter //Ammunition of fighter //Increase Direction Angle KeyId //Decrese Direction Angle KeyId //Move in opposite ddrection command keyId //Move straight command keyId //Fire projectiles keyId


Extentions:
1.Human Controlled Agents (Keyboard Profiles can be customized by the the user)
2.Collision detection (Robots cannot move outside the competition area, nor inside legend or through each other)
3.Robots collapses as they get damaged
4.(Almost) fully customizible WarZone objects

How to compile the sourceCode and run the simulation:
1. dir ./Source
2. javac ./*.java
3. java SimulationRunner
