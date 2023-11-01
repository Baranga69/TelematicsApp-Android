package com.telematics.features.leaderboard.ui.leaderboard_summary;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LeaderboardSummaryFragment_MembersInjector implements MembersInjector<LeaderboardSummaryFragment> {
  private final Provider<LeaderboardSummaryViewModel> leaderboardViewModelProvider;

  public LeaderboardSummaryFragment_MembersInjector(
      Provider<LeaderboardSummaryViewModel> leaderboardViewModelProvider) {
    this.leaderboardViewModelProvider = leaderboardViewModelProvider;
  }

  public static MembersInjector<LeaderboardSummaryFragment> create(
      Provider<LeaderboardSummaryViewModel> leaderboardViewModelProvider) {
    return new LeaderboardSummaryFragment_MembersInjector(leaderboardViewModelProvider);
  }

  @Override
  public void injectMembers(LeaderboardSummaryFragment instance) {
    injectLeaderboardViewModel(instance, leaderboardViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.leaderboard.ui.leaderboard_summary.LeaderboardSummaryFragment.leaderboardViewModel")
  public static void injectLeaderboardViewModel(LeaderboardSummaryFragment instance,
      LeaderboardSummaryViewModel leaderboardViewModel) {
    instance.leaderboardViewModel = leaderboardViewModel;
  }
}
