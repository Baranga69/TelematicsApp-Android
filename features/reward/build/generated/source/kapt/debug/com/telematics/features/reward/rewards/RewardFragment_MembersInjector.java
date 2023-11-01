package com.telematics.features.reward.rewards;

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
public final class RewardFragment_MembersInjector implements MembersInjector<RewardFragment> {
  private final Provider<RewardViewModel> rewardViewModelProvider;

  public RewardFragment_MembersInjector(Provider<RewardViewModel> rewardViewModelProvider) {
    this.rewardViewModelProvider = rewardViewModelProvider;
  }

  public static MembersInjector<RewardFragment> create(
      Provider<RewardViewModel> rewardViewModelProvider) {
    return new RewardFragment_MembersInjector(rewardViewModelProvider);
  }

  @Override
  public void injectMembers(RewardFragment instance) {
    injectRewardViewModel(instance, rewardViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.reward.rewards.RewardFragment.rewardViewModel")
  public static void injectRewardViewModel(RewardFragment instance,
      RewardViewModel rewardViewModel) {
    instance.rewardViewModel = rewardViewModel;
  }
}
