package ui.step6_success;

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
public final class ObdSuccessFragment_MembersInjector implements MembersInjector<ObdSuccessFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public ObdSuccessFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<ObdSuccessFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new ObdSuccessFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(ObdSuccessFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step6_success.ObdSuccessFragment.obdViewModel")
  public static void injectObdViewModel(ObdSuccessFragment instance, ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
