package com.telematics.features.account.ui.account.vehicle;

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
public final class VehicleFragment_MembersInjector implements MembersInjector<VehicleFragment> {
  private final Provider<VehicleViewModel> vehicleViewModelProvider;

  public VehicleFragment_MembersInjector(Provider<VehicleViewModel> vehicleViewModelProvider) {
    this.vehicleViewModelProvider = vehicleViewModelProvider;
  }

  public static MembersInjector<VehicleFragment> create(
      Provider<VehicleViewModel> vehicleViewModelProvider) {
    return new VehicleFragment_MembersInjector(vehicleViewModelProvider);
  }

  @Override
  public void injectMembers(VehicleFragment instance) {
    injectVehicleViewModel(instance, vehicleViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.account.ui.account.vehicle.VehicleFragment.vehicleViewModel")
  public static void injectVehicleViewModel(VehicleFragment instance,
      VehicleViewModel vehicleViewModel) {
    instance.vehicleViewModel = vehicleViewModel;
  }
}
