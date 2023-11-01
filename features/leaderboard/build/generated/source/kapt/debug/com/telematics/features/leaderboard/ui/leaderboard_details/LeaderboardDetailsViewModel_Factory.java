package com.telematics.features.leaderboard.ui.leaderboard_details;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LeaderboardDetailsViewModel_Factory implements Factory<LeaderboardDetailsViewModel> {
  @Override
  public LeaderboardDetailsViewModel get() {
    return newInstance();
  }

  public static LeaderboardDetailsViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LeaderboardDetailsViewModel newInstance() {
    return new LeaderboardDetailsViewModel();
  }

  private static final class InstanceHolder {
    private static final LeaderboardDetailsViewModel_Factory INSTANCE = new LeaderboardDetailsViewModel_Factory();
  }
}
