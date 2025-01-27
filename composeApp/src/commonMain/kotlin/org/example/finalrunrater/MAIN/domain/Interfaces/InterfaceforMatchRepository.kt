package org.example.finalrunrater.MAIN.domain.Interfaces

/**
 **Important Notes**
THIS IS THE 2nd STEP IN DEFINING THE INTERFACES


In RunRater, imagine you have a special MatchRepository that keeps track of all the cricket matches,
just like a super organized box for every match you want to know about! Here's how this magical MatchRepository works:

Get a Match:
Want to know about a specific cricket match? The MatchRepository can fetch all the details for you, such as the match score, teams playing, and match status!

Get All Matches:
If you're curious about every match, whether it's ongoing or completed, there's a button to show you a full list of matches.
This way, you never miss out on any of the action!

Get Upcoming Matches:
Excited about future games? The MatchRepository can show you all the upcoming cricket matches, so you know what’s happening next!

Update Match Winner:
Once a match is finished, you can update the winner in the MatchRepository.
It’s like closing the book after the match is over, knowing exactly who won!

Get Betting Options:
And if you're feeling lucky and want to place a bet, the MatchRepository can show you all the available betting options for a specific match.
It’s where you can find exciting challenges to guess on!

So, the MatchRepository is like your best friend for cricket matches, making it super easy to find information, place bets, and keep track of all the fun stuff in RunRater! 🏏✨
 * **/

import org.example.finalrunrater.MAIN.domain.Entities.BettingOptionEntity
import org.example.finalrunrater.MAIN.domain.Entities.MatchEntity

interface InterfaceforMatchRepository {
    suspend fun getMatch(matchId: String): Result<MatchEntity>
    suspend fun getAllMatches(): Result<List<MatchEntity>>
    suspend fun getUpcomingMatches(): Result<List<MatchEntity>>
    suspend fun updateMatchWinner(matchId: String, winner: String): Result<Boolean>
    suspend fun getBettingOptionsForMatch(matchId: String): Result<List<BettingOptionEntity>>
}


























