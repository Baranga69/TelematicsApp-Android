// Generated by Dagger (https://dagger.dev).
package com.telematics.features.reward.drivecoins;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
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
