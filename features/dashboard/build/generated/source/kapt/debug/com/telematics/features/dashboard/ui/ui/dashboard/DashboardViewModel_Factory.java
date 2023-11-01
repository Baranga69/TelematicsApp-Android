package com.telematics.features.dashboard.ui.ui.dashboard;

import com.telematics.data.model.tracking.MeasuresFormatter;
import com.telematics.data.tracking.TrackingUseCase;
import com.telematics.domain.repository.OnDemandRepo;
import com.telematics.domain.repository.RewardRepo;
import com.telematics.domain.repository.SettingsRepo;
import com.telematics.domain.repository.StatisticRepo;
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
public final class DashboardViewModel_Factory implements Factory<DashboardViewModel> {
  private final Provider<StatisticRepo> statisticRepoProvider;

  private final Provider<TrackingUseCase> trackingUseCaseProvider;

  private final Provider<SettingsRepo> settingsRepoProvider;

  private final Provider<RewardRepo> rewardRepoProvider;

  private final Provider<OnDemandRepo> onDemandRepoProvider;

  private final Provider<MeasuresFormatter> measuresFormatterProvider;

  public DashboardViewModel_Factory(Provider<StatisticRepo> statisticRepoProvider,
      Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<SettingsRepo> settingsRepoProvider, Provider<RewardRepo> rewardRepoProvider,
      Provider<OnDemandRepo> onDemandRepoProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider) {
    this.statisticRepoProvider = statisticRepoProvider;
    this.trackingUseCaseProvider = trackingUseCaseProvider;
    this.settingsRepoProvider = settingsRepoProvider;
    this.rewardRepoProvider = rewardRepoProvider;
    this.onDemandRepoProvider = onDemandRepoProvider;
    this.measuresFormatterProvider = measuresFormatterProvider;
  }

  @Override
  public DashboardViewModel get() {
    return newInstance(statisticRepoProvider.get(), trackingUseCaseProvider.get(), settingsRepoProvider.get(), rewardRepoProvider.get(), onDemandRepoProvider.get(), measuresFormatterProvider.get());
  }

  public static DashboardViewModel_Factory create(Provider<StatisticRepo> statisticRepoProvider,
      Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<SettingsRepo> settingsRepoProvider, Provider<RewardRepo> rewardRepoProvider,
      Provider<OnDemandRepo> onDemandRepoProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider) {
    return new DashboardViewModel_Factory(statisticRepoProvider, trackingUseCaseProvider, settingsRepoProvider, rewardRepoProvider, onDemandRepoProvider, measuresFormatterProvider);
  }

  public static DashboardViewModel newInstance(StatisticRepo statisticRepo,
      TrackingUseCase trackingUseCase, SettingsRepo settingsRepo, RewardRepo rewardRepo,
      OnDemandRepo onDemandRepo, MeasuresFormatter measuresFormatter) {
    return new DashboardViewModel(statisticRepo, trackingUseCase, settingsRepo, rewardRepo, onDemandRepo, measuresFormatter);
  }
}
