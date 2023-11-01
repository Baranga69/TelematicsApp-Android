package ui.step2_wizard;

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
public final class VehicleWizardFragment_MembersInjector implements MembersInjector<VehicleWizardFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public VehicleWizardFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<VehicleWizardFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new VehicleWizardFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(VehicleWizardFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step2_wizard.VehicleWizardFragment.obdViewModel")
  public static void injectObdViewModel(VehicleWizardFragment instance, ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
