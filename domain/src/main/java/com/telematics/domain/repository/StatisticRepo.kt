package com.telematics.domain.repository

import com.telematics.domain.model.leaderboard.LeaderboardMemberData
import com.telematics.domain.model.leaderboard.LeaderboardType
import com.telematics.domain.model.on_demand.DashboardOnDemandJob
import com.telematics.domain.model.statistics.*

interface StatisticRepo {
    suspend fun getDriveCoins(): DriveCoins
    suspend fun getUserStatisticsIndividualData(): UserStatisticsIndividualData
    suspend fun getDrivingDetails(): List<DrivingDetailsData>
    suspend fun getUserStatisticsScoreData(): UserStatisticsScoreData
    suspend fun getMainEcoScoring(): StatisticEcoScoringMain
    suspend fun getEcoScoringStatisticsData(type: Int): StatisticEcoScoringTabData
    suspend fun getLeaderboard(type: LeaderboardType): List<LeaderboardMemberData>?
    suspend fun getOnDemandCompletedData(job: DashboardOnDemandJob): Pair<UserStatisticsIndividualData, UserStatisticsScoreData>
}