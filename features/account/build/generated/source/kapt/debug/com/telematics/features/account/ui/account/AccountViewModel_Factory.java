package com.telematics.features.account.ui.account;

import com.telematics.features.account.use_case.LoginUseCase;
import com.telematics.features.account.use_case.VehicleUseCase;
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
public final class AccountViewModel_Factory implements Factory<AccountViewModel> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<VehicleUseCase> vehicleUseCaseProvider;

  public AccountViewModel_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<VehicleUseCase> vehicleUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.vehicleUseCaseProvider = vehicleUseCaseProvider;
  }

  @Override
  public AccountViewModel get() {
    return newInstance(loginUseCaseProvider.get(), vehicleUseCaseProvider.get());
  }

  public static AccountViewModel_Factory create(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<VehicleUseCase> vehicleUseCaseProvider) {
    return new AccountViewModel_Factory(loginUseCaseProvider, vehicleUseCaseProvider);
  }

  public static AccountViewModel newInstance(LoginUseCase loginUseCase,
      VehicleUseCase vehicleUseCase) {
    return new AccountViewModel(loginUseCase, vehicleUseCase);
  }
}
