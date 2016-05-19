# Snake
Snake Game - Made as the final end of year project by the MERHS AP-CS 15-16 course.

The Classes:

Location:
	-Will have instance variables r and c, respectively 
	representing a row and column in the SnakeWorld
	-Will have methods to return r and c

SnakeWorld:
	-Will have an ArrayList of Blocks
	-Will have a method that can return a block at parameter 	Location

Block:
	-Will have a Location

FoodBlock: (extended from Block)

SnakeBlock: (extended from Block)

EdgeBlock: (extended from Block)

Snake: 
	-Has an ArrayList of SnakeBlock objects
	-The "head" of the snake will be whichever SnakeBlock object is 	first in the ArrayList, and the "tail" will be whichever block 
	is in at the end of the ArrayList
	-The way it will move is to have is to have the "tail" move the 	front of the ArrayList in whichever direction the snake is 
	currently travelling