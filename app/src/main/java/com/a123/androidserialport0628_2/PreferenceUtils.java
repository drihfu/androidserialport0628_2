/*
 * Copyright 2019 maoqiqi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.a123.androidserialport0628_2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * 存储数据
 */
class PreferenceUtils {

    private static PreferenceUtils instance;

    private SharedPreferences preferences;

    private PreferenceUtils() {
        preferences = PreferenceManager.getDefaultSharedPreferences(App.getInstance());
    }

    static PreferenceUtils getInstance() {
        if (instance == null) {
            synchronized (PreferenceUtils.class) {
                if (instance == null) {
                    instance = new PreferenceUtils();
                }
            }
        }
        return instance;
    }

    String getDevice() {
        return preferences.getString("device", "");
    }


}