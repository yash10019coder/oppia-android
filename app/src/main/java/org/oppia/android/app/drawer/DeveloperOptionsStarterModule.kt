package org.oppia.android.app.drawer

import dagger.Binds
import dagger.Module

/** Provides dependencies corresponding to implementation of DeveloperOptionsStarter. */
@Module
interface DeveloperOptionsStarterModule {
  @Binds
  fun bindsDeveloperOptionsStarter(
    impl: DeveloperOptionsStarterImpl
  ): DeveloperOptionsStarter
}
