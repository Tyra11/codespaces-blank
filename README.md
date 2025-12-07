Programming Fundamentals I — Lab X

Basketball Stats Tracker
Due date: December 7,2025 11:59 p.m.

Purpose:
- This lab focuses on building a Basketball Stats Tracker program that allows users to enter and track a team’s player statistics, including points, rebounds, and assists.

This lab emphasizes the following concepts:
- Method abstraction and stepwise refinement
- Making arrays to store and process data
- Passing arrays as arguments to methods
- Collecting and displaying statistics

In-Class X
 - In this lab, you will construct a program that allows a user to input player names and their corresponding game statistics. The program will store these values in arrays, use methods to process the arrays, and display the results in a readable format.

Key goals include:
- Practicing method abstraction
- Working with arrays and array processing
- Organizing program logic for clarity and reusability

Lab Task: Basketball Stats Tracker
- Create a project called BasketballStats_FirstName_LastName. Include comments describing the purpose of the program and each method used.

Methods Required
The following methods must be implemented:
- main method
- Handles user input for player names and statistics
- Calls other methods to store and display data

AddPlayers method
- Takes an array of Strings as input
- Prompts the user to enter player names
- Stores the names in the array

 RecordStats method
- Takes arrays for points, rebounds, and assists as input
- Prompts the user to enter stats for each player
- Stores the stats in the respective arrays

DisplayStats method
- Takes the player names array and stats arrays as input
- Displays a table or formatted list showing each player’s statistics

Step 1 — Implement addPlayers
- In the addPlayers method, create a String array with a length equal to the number of players on the team (5 in this case). Prompt the user to input each player’s name and store it in the array.

Step 2 — Implement recordStats
- In the recordStats method, create three integer arrays (points, rebounds, assists). For each player, prompt the user to input their stats for the game. Store these values in the corresponding arrays.

Step 3 — Implement displayStats
- In the displayStats method, iterate over all players and print their name and statistics in a clear, readable format. For example:

Player: Tyra
Points: 30
Rebounds: 10
Assists: 8

Step 4 — Implement the main method

In the main method:
- Call addPlayers to input player names.
- Call recordStats to input each player’s game stats.
- Call displayStats to show the statistics of all players.
