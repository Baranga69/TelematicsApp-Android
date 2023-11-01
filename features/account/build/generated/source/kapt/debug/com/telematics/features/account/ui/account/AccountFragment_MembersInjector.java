package com.telematics.features.account.ui.account;

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
public final class AccountFragment_MembersInjector implements MembersInjector<AccountFragment> {
  private final Provider<AccountViewModel> accountViewModelProvider;

  public AccountFragment_MembersInjector(Provider<AccountViewModel> accountViewModelProvider) {
    this.accountViewModelProvider = accountViewModelProvider;
  }

  public static MembersInjector<AccountFragment> create(
      Provider<AccountViewModel> accountViewModelProvider) {
    return new AccountFragment_MembersInjector(accountViewModelProvider);
  }

  @Override
  public void injectMembers(AccountFragment instance) {
    injectAccountViewModel(instance, accountViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.account.ui.account.AccountFragment.accountViewModel")
  public static void injectAccountViewModel(AccountFragment instance,
      AccountViewModel accountViewModel) {
    instance.accountViewModel = accountViewModel;
  }
}
