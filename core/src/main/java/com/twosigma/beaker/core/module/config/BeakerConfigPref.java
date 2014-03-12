/*
 *  Copyright 2014 TWO SIGMA INVESTMENTS, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.twosigma.beaker.core.module.config;

import java.util.Map;

/**
 * BeakerConfigPref
 * keeps the user preferences that will be used to assist in creating configurations used
 * by beaker. Note the default value of individual preference settings should be null. It's
 * up to the BeakerConfig implementation (which take BeakerConfigPref as input) to provide
 * the real default value upon getting null preferences.
 */
public interface BeakerConfigPref {
  public Boolean getUseKerberos();
  public Integer getPortBase();
  public String getDefaultNotebookUrl();
  public Map<String, String> getPluginOptions();
}
