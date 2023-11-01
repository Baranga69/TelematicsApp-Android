package com.telematics.features.reward.streaks;

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
public final class StreaksFragment_MembersInjector implements MembersInjector<StreaksFragment> {
  private final Provider<StreaksViewModel> streaksViewModelProvider;

  public StreaksFragment_MembersInjector(Provider<StreaksViewModel> streaksViewModelProvider) {
    this.streaksViewModelProvider = streaksViewModelProvider;
  }

  public static MembersInjector<StreaksFragment> create(
      Provider<StreaksViewModel> streaksViewModelProvider) {
    return new StreaksFragment_MembersInjector(streaksViewModelProvider);
  }

  @Override
  public void injectMembers(StreaksFragment instance) {
    injectStreaksViewModel(instance, streaksViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.reward.streaks.StreaksFragment.streaksViewModel")
  public static void injectStreaksViewModel(StreaksFragment instance,
      StreaksViewModel streaksViewModel) {
    instance.streaksViewModel = streaksViewModel;
  }
}
