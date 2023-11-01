package com.telematics.features.account.ui.profile;

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
public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<ProfileViewModel> profileViewModelProvider;

  public ProfileFragment_MembersInjector(Provider<ProfileViewModel> profileViewModelProvider) {
    this.profileViewModelProvider = profileViewModelProvider;
  }

  public static MembersInjector<ProfileFragment> create(
      Provider<ProfileViewModel> profileViewModelProvider) {
    return new ProfileFragment_MembersInjector(profileViewModelProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    injectProfileViewModel(instance, profileViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.account.ui.profile.ProfileFragment.profileViewModel")
  public static void injectProfileViewModel(ProfileFragment instance,
      ProfileViewModel profileViewModel) {
    instance.profileViewModel = profileViewModel;
  }
}
