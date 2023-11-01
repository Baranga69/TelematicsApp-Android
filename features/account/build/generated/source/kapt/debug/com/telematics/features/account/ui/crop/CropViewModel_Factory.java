package com.telematics.features.account.ui.crop;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class CropViewModel_Factory implements Factory<CropViewModel> {
  @Override
  public CropViewModel get() {
    return newInstance();
  }

  public static CropViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CropViewModel newInstance() {
    return new CropViewModel();
  }

  private static final class InstanceHolder {
    private static final CropViewModel_Factory INSTANCE = new CropViewModel_Factory();
  }
}
