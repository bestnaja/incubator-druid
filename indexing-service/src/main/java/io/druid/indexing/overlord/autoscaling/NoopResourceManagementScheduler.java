/*
 * Druid - a distributed column store.
 * Copyright 2012 - 2015 Metamarkets Group Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.druid.indexing.overlord.autoscaling;

import com.metamx.common.logger.Logger;

/**
 */
public class NoopResourceManagementScheduler extends ResourceManagementScheduler
{
  private static final Logger log = new Logger(NoopResourceManagementScheduler.class);

  public NoopResourceManagementScheduler()
  {
    super(null, null, null, null);
  }

  @Override
  public void start()
  {
    log.info("Autoscaling is disabled.");
  }

  @Override
  public void stop()
  {
    // do nothing
  }

  @Override
  public ScalingStats getStats()
  {
    return new ScalingStats(0);
  }
}