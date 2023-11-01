package com.telematics.features.feed.ui.feed;

import com.telematics.data.model.tracking.MeasuresFormatter;
import com.telematics.data.tracking.TrackingUseCase;
import com.telematics.domain.repository.SettingsRepo;
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
public final class FeedViewModel_Factory implements Factory<FeedViewModel> {
  private final Provider<TrackingUseCase> trackingUseCaseProvider;

  private final Provider<MeasuresFormatter> measuresFormatterProvider;

  private final Provider<SettingsRepo> settingsRepoProvider;

  public FeedViewModel_Factory(Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider,
      Provider<SettingsRepo> settingsRepoProvider) {
    this.trackingUseCaseProvider = trackingUseCaseProvider;
    this.measuresFormatterProvider = measuresFormatterProvider;
    this.settingsRepoProvider = settingsRepoProvider;
  }

  @Override
  public FeedViewModel get() {
    return newInstance(trackingUseCaseProvider.get(), measuresFormatterProvider.get(), settingsRepoProvider.get());
  }

  public static FeedViewModel_Factory create(Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider,
      Provider<SettingsRepo> settingsRepoProvider) {
    return new FeedViewModel_Factory(trackingUseCaseProvider, measuresFormatterProvider, settingsRepoProvider);
  }

  public static FeedViewModel newInstance(TrackingUseCase trackingUseCase,
      MeasuresFormatter measuresFormatter, SettingsRepo settingsRepo) {
    return new FeedViewModel(trackingUseCase, measuresFormatter, settingsRepo);
  }
}
