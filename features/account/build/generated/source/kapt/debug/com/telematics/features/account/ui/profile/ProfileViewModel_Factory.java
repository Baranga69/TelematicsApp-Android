package com.telematics.features.account.ui.profile;

import com.telematics.features.account.use_case.LoginUseCase;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  public ProfileViewModel_Factory(Provider<LoginUseCase> loginUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(loginUseCaseProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<LoginUseCase> loginUseCaseProvider) {
    return new ProfileViewModel_Factory(loginUseCaseProvider);
  }

  public static ProfileViewModel newInstance(LoginUseCase loginUseCase) {
    return new ProfileViewModel(loginUseCase);
  }
}
