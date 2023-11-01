package com.telematics.features.leaderboard.ui.leaderboard_summary;

import com.telematics.domain.repository.LeaderboardRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LeaderboardSummaryViewModel_Factory implements Factory<LeaderboardSummaryViewModel> {
  private final Provider<LeaderboardRepo> leaderboardRepoProvider;

  public LeaderboardSummaryViewModel_Factory(Provider<LeaderboardRepo> leaderboardRepoProvider) {
    this.leaderboardRepoProvider = leaderboardRepoProvider;
  }

  @Override
  public LeaderboardSummaryViewModel get() {
    return newInstance(leaderboardRepoProvider.get());
  }

  public static LeaderboardSummaryViewModel_Factory create(
      Provider<LeaderboardRepo> leaderboardRepoProvider) {
    return new LeaderboardSummaryViewModel_Factory(leaderboardRepoProvider);
  }

  public static LeaderboardSummaryViewModel newInstance(LeaderboardRepo leaderboardRepo) {
    return new LeaderboardSummaryViewModel(leaderboardRepo);
  }
}
