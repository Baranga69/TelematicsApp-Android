package com.telematics.features.account.use_case;

import com.telematics.domain.repository.AuthenticationRepo;
import com.telematics.domain.repository.UserRepo;
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
public final class LoginUseCase_Factory implements Factory<LoginUseCase> {
  private final Provider<AuthenticationRepo> authenticationRepoProvider;

  private final Provider<UserRepo> userRepoProvider;

  public LoginUseCase_Factory(Provider<AuthenticationRepo> authenticationRepoProvider,
      Provider<UserRepo> userRepoProvider) {
    this.authenticationRepoProvider = authenticationRepoProvider;
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public LoginUseCase get() {
    return newInstance(authenticationRepoProvider.get(), userRepoProvider.get());
  }

  public static LoginUseCase_Factory create(Provider<AuthenticationRepo> authenticationRepoProvider,
      Provider<UserRepo> userRepoProvider) {
    return new LoginUseCase_Factory(authenticationRepoProvider, userRepoProvider);
  }

  public static LoginUseCase newInstance(AuthenticationRepo authenticationRepo, UserRepo userRepo) {
    return new LoginUseCase(authenticationRepo, userRepo);
  }
}
