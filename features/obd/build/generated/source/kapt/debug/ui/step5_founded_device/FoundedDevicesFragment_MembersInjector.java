package ui.step5_founded_device;

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
public final class FoundedDevicesFragment_MembersInjector implements MembersInjector<FoundedDevicesFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public FoundedDevicesFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<FoundedDevicesFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new FoundedDevicesFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(FoundedDevicesFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step5_founded_device.FoundedDevicesFragment.obdViewModel")
  public static void injectObdViewModel(FoundedDevicesFragment instance,
      ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
