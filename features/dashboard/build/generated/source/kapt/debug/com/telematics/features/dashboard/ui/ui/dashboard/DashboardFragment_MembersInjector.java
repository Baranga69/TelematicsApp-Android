package com.telematics.features.dashboard.ui.ui.dashboard;

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
public final class DashboardFragment_MembersInjector implements MembersInjector<DashboardFragment> {
  private final Provider<DashboardViewModel> dashboardViewModelProvider;

  public DashboardFragment_MembersInjector(
      Provider<DashboardViewModel> dashboardViewModelProvider) {
    this.dashboardViewModelProvider = dashboardViewModelProvider;
  }

  public static MembersInjector<DashboardFragment> create(
      Provider<DashboardViewModel> dashboardViewModelProvider) {
    return new DashboardFragment_MembersInjector(dashboardViewModelProvider);
  }

  @Override
  public void injectMembers(DashboardFragment instance) {
    injectDashboardViewModel(instance, dashboardViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.dashboard.ui.ui.dashboard.DashboardFragment.dashboardViewModel")
  public static void injectDashboardViewModel(DashboardFragment instance,
      DashboardViewModel dashboardViewModel) {
    instance.dashboardViewModel = dashboardViewModel;
  }
}
