package ui.step1_vehicles.add_vehicle;

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
public final class ObdAddVehicleFragment_MembersInjector implements MembersInjector<ObdAddVehicleFragment> {
  private final Provider<VehicleViewModel> vehicleViewModelProvider;

  public ObdAddVehicleFragment_MembersInjector(
      Provider<VehicleViewModel> vehicleViewModelProvider) {
    this.vehicleViewModelProvider = vehicleViewModelProvider;
  }

  public static MembersInjector<ObdAddVehicleFragment> create(
      Provider<VehicleViewModel> vehicleViewModelProvider) {
    return new ObdAddVehicleFragment_MembersInjector(vehicleViewModelProvider);
  }

  @Override
  public void injectMembers(ObdAddVehicleFragment instance) {
    injectVehicleViewModel(instance, vehicleViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step1_vehicles.add_vehicle.ObdAddVehicleFragment.vehicleViewModel")
  public static void injectVehicleViewModel(ObdAddVehicleFragment instance,
      VehicleViewModel vehicleViewModel) {
    instance.vehicleViewModel = vehicleViewModel;
  }
}
