package ui.step1_vehicles.add_vehicle;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import use_case.VehicleUseCase;

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
public final class VehicleViewModel_Factory implements Factory<VehicleViewModel> {
  private final Provider<VehicleUseCase> vehicleUseCaseProvider;

  public VehicleViewModel_Factory(Provider<VehicleUseCase> vehicleUseCaseProvider) {
    this.vehicleUseCaseProvider = vehicleUseCaseProvider;
  }

  @Override
  public VehicleViewModel get() {
    return newInstance(vehicleUseCaseProvider.get());
  }

  public static VehicleViewModel_Factory create(Provider<VehicleUseCase> vehicleUseCaseProvider) {
    return new VehicleViewModel_Factory(vehicleUseCaseProvider);
  }

  public static VehicleViewModel newInstance(VehicleUseCase vehicleUseCase) {
    return new VehicleViewModel(vehicleUseCase);
  }
}
