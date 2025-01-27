package org.example.finalrunrater.MAIN.domain.Entities

/**
Important Notes:
THIS IS THE 1st STEP IN DEFINING THE ENTITIES

 Alright, little buddy! So, imagine you have a special box where you keep all your toys.
 Each toy has its own spot, and you know exactly which toys you have and where they are.

 * Now, think of the User as a person who has a similar special box, but instead of toys,
   they keep track of their games and the fun stuff they do with their friends.

   * Name: This is like the label on the box that tells everyone whose toys they are.
            So, if the User's name is Alex, it says “Alex’s Box” on it.

   * Balance: This is like the number of candies Alex has to spend on games.
              If Alex has 10 candies, they can use some to play games with friends.

   * Bet History: Imagine if Alex wrote down every time they played a game or made a bet with their friends.
                This list tells Alex what games they played before—like a fun diary!

   * Transactions: This is like keeping track of when Alex got new candies or when they gave some away.
                   It helps them remember how many they have.

   * Created At and Updated At: This is like saying when Alex first got their box and when they last added a new toy or changed something inside.

So, the User is just like Alex with their special box, keeping everything organized so they can have fun! Does that help?
 * **/


data class UserEntity (
    val id: String,          // Unique identifier for the user
    val name: String,        // User's name
    val email: String,       // User's email (optional, for account management)
    val phoneNumber: String, // User's phone number
    val balance: Double,     // User's available balance for placing bets
    val betHistory: List<BetEntity>, // List of bets the user has placed in the past
    val transactionHistory: List<TransactionEntity>, // List of financial transactions
    val createdAt: Long,     // Account creation timestamp
    val updatedAt: Long      // Last profile update timestamp
)