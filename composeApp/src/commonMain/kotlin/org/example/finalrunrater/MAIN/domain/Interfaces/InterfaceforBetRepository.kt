package org.example.finalrunrater.MAIN.domain.Interfaces

/**
 **Important Notes**
THIS IS THE 3rd STEP IN DEFINING THE INTERFACES

In RunRater, the BetRepository is like your special toy box where you keep all the bets you've made during the cricket game.
Each bet is like a different toy, and here's how it works:

Place a Bet:
When you decide to place a new bet, it’s like getting a new toy and adding it to the box!
You say, “I want to place a bet on this match!” and it gets stored in the BetRepository for safekeeping.

Get a Bet:
If you want to check on a specific bet, just look for its name tag or ID. It’s like finding a specific toy in the box.
You can easily fetch the details about your bet by its unique identifier.

Get All Bets:
Sometimes, you might want to see all the bets you’ve placed—just like checking all your toys in the box.
The BetRepository will show you a list of all your bets, whether they’re still open or have been settled.

Update Bet Status:
Just like how you might decide that a toy is no longer fun or needs fixing, you can update the status of a bet in the BetRepository.
You can mark a bet as “pending,” “won,” “lost,” or even “canceled” depending on how things are going.

So, the BetRepository is like your super organized toy box, but instead of toys, it keeps track of all your bets and ensures everything is neat and easy to find!
It helps you stay on top of all your cricket betting adventures in RunRater! 🏏✨
 * **/

import org.example.finalrunrater.MAIN.domain.Entities.BetEntity
import org.example.finalrunrater.MAIN.domain.Enums.EnumforBetStatus

interface InterfaceforBetRepository {
    suspend fun placeBet(bet: BetEntity): Result<BetEntity>
    suspend fun getBet(betId: String): Result<BetEntity>
    suspend fun getAllBets(userId: String): Result<List<BetEntity>>
    suspend fun updateBetStatus(betId: String, status: EnumforBetStatus): Result<Boolean>
}