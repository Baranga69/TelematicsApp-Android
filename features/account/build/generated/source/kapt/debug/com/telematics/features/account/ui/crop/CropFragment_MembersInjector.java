package com.telematics.features.account.ui.crop;

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
public final class CropFragment_MembersInjector implements MembersInjector<CropFragment> {
  private final Provider<CropViewModel> viewModelProvider;

  public CropFragment_MembersInjector(Provider<CropViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CropFragment> create(Provider<CropViewModel> viewModelProvider) {
    return new CropFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CropFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.account.ui.crop.CropFragment.viewModel")
  public static void injectViewModel(CropFragment instance, CropViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
