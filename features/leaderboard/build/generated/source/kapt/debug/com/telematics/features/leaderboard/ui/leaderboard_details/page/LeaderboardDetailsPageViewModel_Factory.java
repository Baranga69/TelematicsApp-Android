package com.telematics.features.leaderboard.ui.leaderboard_details.page;

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
public final class LeaderboardDetailsPageViewModel_Factory implements Factory<LeaderboardDetailsPageViewModel> {
  private final Provider<LeaderboardRepo> leaderboardRepoProvider;

  public LeaderboardDetailsPageViewModel_Factory(
      Provider<LeaderboardRepo> leaderboardRepoProvider) {
    this.leaderboardRepoProvider = leaderboardRepoProvider;
  }

  @Override
  public LeaderboardDetailsPageViewModel get() {
    return newInstance(leaderboardRepoProvider.get());
  }

  public static LeaderboardDetailsPageViewModel_Factory create(
      Provider<LeaderboardRepo> leaderboardRepoProvider) {
    return new LeaderboardDetailsPageViewModel_Factory(leaderboardRepoProvider);
  }

  public static LeaderboardDetailsPageViewModel newInstance(LeaderboardRepo leaderboardRepo) {
    return new LeaderboardDetailsPageViewModel(leaderboardRepo);
  }
}
