package com.telematics.features.leaderboard.ui.leaderboard_details.page;

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
public final class LeaderboardDetailsPageFragment_MembersInjector implements MembersInjector<LeaderboardDetailsPageFragment> {
  private final Provider<LeaderboardDetailsPageViewModel> leaderboardDetailsPageViewModelProvider;

  public LeaderboardDetailsPageFragment_MembersInjector(
      Provider<LeaderboardDetailsPageViewModel> leaderboardDetailsPageViewModelProvider) {
    this.leaderboardDetailsPageViewModelProvider = leaderboardDetailsPageViewModelProvider;
  }

  public static MembersInjector<LeaderboardDetailsPageFragment> create(
      Provider<LeaderboardDetailsPageViewModel> leaderboardDetailsPageViewModelProvider) {
    return new LeaderboardDetailsPageFragment_MembersInjector(leaderboardDetailsPageViewModelProvider);
  }

  @Override
  public void injectMembers(LeaderboardDetailsPageFragment instance) {
    injectLeaderboardDetailsPageViewModel(instance, leaderboardDetailsPageViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.leaderboard.ui.leaderboard_details.page.LeaderboardDetailsPageFragment.leaderboardDetailsPageViewModel")
  public static void injectLeaderboardDetailsPageViewModel(LeaderboardDetailsPageFragment instance,
      LeaderboardDetailsPageViewModel leaderboardDetailsPageViewModel) {
    instance.leaderboardDetailsPageViewModel = leaderboardDetailsPageViewModel;
  }
}
