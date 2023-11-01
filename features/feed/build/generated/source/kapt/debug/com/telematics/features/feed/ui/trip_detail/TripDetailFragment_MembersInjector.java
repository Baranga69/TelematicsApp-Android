package com.telematics.features.feed.ui.trip_detail;

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
public final class TripDetailFragment_MembersInjector implements MembersInjector<TripDetailFragment> {
  private final Provider<TripDetailViewModel> tripDetailViewModelProvider;

  public TripDetailFragment_MembersInjector(
      Provider<TripDetailViewModel> tripDetailViewModelProvider) {
    this.tripDetailViewModelProvider = tripDetailViewModelProvider;
  }

  public static MembersInjector<TripDetailFragment> create(
      Provider<TripDetailViewModel> tripDetailViewModelProvider) {
    return new TripDetailFragment_MembersInjector(tripDetailViewModelProvider);
  }

  @Override
  public void injectMembers(TripDetailFragment instance) {
    injectTripDetailViewModel(instance, tripDetailViewModelProvider.get());
  }

  @InjectedFieldSignature("com.telematics.features.feed.ui.trip_detail.TripDetailFragment.tripDetailViewModel")
  public static void injectTripDetailViewModel(TripDetailFragment instance,
      TripDetailViewModel tripDetailViewModel) {
    instance.tripDetailViewModel = tripDetailViewModel;
  }
}
