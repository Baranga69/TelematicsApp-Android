package use_case;

import com.telematics.domain.repository.CarServiceRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class VehicleUseCase_Factory implements Factory<VehicleUseCase> {
  private final Provider<CarServiceRepo> carServiceRepoProvider;

  public VehicleUseCase_Factory(Provider<CarServiceRepo> carServiceRepoProvider) {
    this.carServiceRepoProvider = carServiceRepoProvider;
  }

  @Override
  public VehicleUseCase get() {
    return newInstance(carServiceRepoProvider.get());
  }

  public static VehicleUseCase_Factory create(Provider<CarServiceRepo> carServiceRepoProvider) {
    return new VehicleUseCase_Factory(carServiceRepoProvider);
  }

  public static VehicleUseCase newInstance(CarServiceRepo carServiceRepo) {
    return new VehicleUseCase(carServiceRepo);
  }
}
