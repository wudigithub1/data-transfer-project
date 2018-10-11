/*
 * Copyright 2018 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.datatransferproject.auth.oauth1;

import java.util.List;
import java.util.Map;

public interface OAuth1Config {

  String getServiceName();

  String getRequestTokenUrl();

  String getAuthorizeUrl();

  String getAccessTokenUrl();

  Map<String, List<String>> getExportScopes();

  Map<String, List<String>> getImportScopes();
}
