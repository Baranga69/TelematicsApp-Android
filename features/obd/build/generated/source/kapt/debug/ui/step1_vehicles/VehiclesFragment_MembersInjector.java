package ui.step1_vehicles;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import ui.ObdViewModel;

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
public final class VehiclesFragment_MembersInjector implements MembersInjector<VehiclesFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public VehiclesFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<VehiclesFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new VehiclesFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(VehiclesFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step1_vehicles.VehiclesFragment.obdViewModel")
  public static void injectObdViewModel(VehiclesFragment instance, ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
