package ui.step3_photo;

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
public final class ConfirmPhotoFragment_MembersInjector implements MembersInjector<ConfirmPhotoFragment> {
  private final Provider<ObdViewModel> obdViewModelProvider;

  public ConfirmPhotoFragment_MembersInjector(Provider<ObdViewModel> obdViewModelProvider) {
    this.obdViewModelProvider = obdViewModelProvider;
  }

  public static MembersInjector<ConfirmPhotoFragment> create(
      Provider<ObdViewModel> obdViewModelProvider) {
    return new ConfirmPhotoFragment_MembersInjector(obdViewModelProvider);
  }

  @Override
  public void injectMembers(ConfirmPhotoFragment instance) {
    injectObdViewModel(instance, obdViewModelProvider.get());
  }

  @InjectedFieldSignature("ui.step3_photo.ConfirmPhotoFragment.obdViewModel")
  public static void injectObdViewModel(ConfirmPhotoFragment instance, ObdViewModel obdViewModel) {
    instance.obdViewModel = obdViewModel;
  }
}
