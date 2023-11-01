package com.telematics.features.reward.drivecoins;

import com.telematics.data.model.tracking.MeasuresFormatter;
import com.telematics.domain.repository.RewardRepo;
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
public final class DriveCoinsViewModel_Factory implements Factory<DriveCoinsViewModel> {
  private final Provider<RewardRepo> rewardRepoProvider;

  private final Provider<MeasuresFormatter> measuresFormatterProvider;

  public DriveCoinsViewModel_Factory(Provider<RewardRepo> rewardRepoProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider) {
    this.rewardRepoProvider = rewardRepoProvider;
    this.measuresFormatterProvider = measuresFormatterProvider;
  }

  @Override
  public DriveCoinsViewModel get() {
    return newInstance(rewardRepoProvider.get(), measuresFormatterProvider.get());
  }

  public static DriveCoinsViewModel_Factory create(Provider<RewardRepo> rewardRepoProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider) {
    return new DriveCoinsViewModel_Factory(rewardRepoProvider, measuresFormatterProvider);
  }

  public static DriveCoinsViewModel newInstance(RewardRepo rewardRepo,
      MeasuresFormatter measuresFormatter) {
    return new DriveCoinsViewModel(rewardRepo, measuresFormatter);
  }
}
