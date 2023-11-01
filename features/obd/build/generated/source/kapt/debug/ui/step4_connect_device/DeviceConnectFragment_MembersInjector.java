package ui.step4_connect_device;

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
public final class DeviceConnectFragment_MembersInjector implements MembersInjector<DeviceConnectFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public DeviceConnectFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<DeviceConnectFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new DeviceConnectFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(DeviceConnectFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step4_connect_device.DeviceConnectFragment.obdViewModel")
  public static void injectObdViewModel(DeviceConnectFragment instance, ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
