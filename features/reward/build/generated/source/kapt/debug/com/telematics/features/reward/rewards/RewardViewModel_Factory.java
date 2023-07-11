// Generated by Dagger (https://dagger.dev).
package com.telematics.features.reward.rewards;

import com.telematics.domain.repository.SessionRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RewardViewModel_Factory implements Factory<RewardViewModel> {
  private final Provider<SessionRepo> sessionRepoProvider;

  public RewardViewModel_Factory(Provider<SessionRepo> sessionRepoProvider) {
    this.sessionRepoProvider = sessionRepoProvider;
  }

  @Override
  public RewardViewModel get() {
    return newInstance(sessionRepoProvider.get());
  }

  public static RewardViewModel_Factory create(Provider<SessionRepo> sessionRepoProvider) {
    return new RewardViewModel_Factory(sessionRepoProvider);
  }

  public static RewardViewModel newInstance(SessionRepo sessionRepo) {
    return new RewardViewModel(sessionRepo);
  }
}
