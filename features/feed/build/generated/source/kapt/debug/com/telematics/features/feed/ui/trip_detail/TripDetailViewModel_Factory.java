// Generated by Dagger (https://dagger.dev).
package com.telematics.features.feed.ui.trip_detail;

import com.telematics.data.model.tracking.MeasuresFormatter;
import com.telematics.data.tracking.TrackingUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TripDetailViewModel_Factory implements Factory<TripDetailViewModel> {
  private final Provider<TrackingUseCase> trackingUseCaseProvider;

  private final Provider<MeasuresFormatter> formatterProvider;

  public TripDetailViewModel_Factory(Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<MeasuresFormatter> formatterProvider) {
    this.trackingUseCaseProvider = trackingUseCaseProvider;
    this.formatterProvider = formatterProvider;
  }

  @Override
  public TripDetailViewModel get() {
    return newInstance(trackingUseCaseProvider.get(), formatterProvider.get());
  }

  public static TripDetailViewModel_Factory create(
      Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<MeasuresFormatter> formatterProvider) {
    return new TripDetailViewModel_Factory(trackingUseCaseProvider, formatterProvider);
  }

  public static TripDetailViewModel newInstance(TrackingUseCase trackingUseCase,
      MeasuresFormatter formatter) {
    return new TripDetailViewModel(trackingUseCase, formatter);
  }
}
