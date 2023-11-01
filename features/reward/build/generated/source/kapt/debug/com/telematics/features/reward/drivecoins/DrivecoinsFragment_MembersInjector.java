package com.telematics.features.reward.drivecoins;

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
public final class DrivecoinsFragment_MembersInjector implements MembersInjector<DrivecoinsFragment> {
  private final Provider<DriveCoinsViewModel> driveCoinsViewModelProvider;

  public DrivecoinsFragment_MembersInjector(
      Provider<DriveCoinsViewModel> driveCoinsViewModelProvider) {
    this.driveCoinsViewModelProvider = driveCoinsViewModelProvider;
  }

  public static MembersInjector<DrivecoinsFragment> create(
      Provider<DriveCoinsViewModel> driveCoinsViewModelProvider) {
    return new DrivecoinsFragment_MembersInjector(driveCoinsViewModelProvider);
  }

  @Override
  public void injectMembers(DrivecoinsFragment instance) {
    injectDriveCoinsViewModel(instance, driveCoinsViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.reward.drivecoins.DrivecoinsFragment.driveCoinsViewModel")
  public static void injectDriveCoinsViewModel(DrivecoinsFragment instance,
      DriveCoinsViewModel driveCoinsViewModel) {
    instance.driveCoinsViewModel = driveCoinsViewModel;
  }
}
