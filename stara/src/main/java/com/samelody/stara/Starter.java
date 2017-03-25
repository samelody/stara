/*
 * Copyright (c) 2017-present Samelody.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.samelody.stara;

import android.content.Intent;
import android.os.Bundle;

/**
 * The interface represents the objects that have methods to start activities.
 *
 * @author Belin Wu
 */
public interface Starter {

    /**
     * Starts the activity.
     *
     * @param intent  The description of the activity to start
     */
    void startActivity(Intent intent);

    /**
     * Starts the activity.
     *
     * @param intent  The description of the activity to start
     * @param options Additional options for how the Activity should be started
     */
    void startActivity(Intent intent, Bundle options);

    /**
     * Starts the activity for the result.
     *
     * @param intent      The description of the activity to start
     * @param requestCode The code that will be returned with onActivityResult() identifying this
     *                    request
     */
    void startActivityForResult(Intent intent, int requestCode);

    /**
     * Starts the activity for the result.
     *
     * @param intent      The description of the activity to start
     * @param requestCode The code that will be returned with onActivityResult() identifying this
     *                    request
     * @param options     Additional options for how the Activity should be started
     */
    void startActivityForResult(Intent intent, int requestCode, Bundle options);

    /**
     * Starts multiple activities.
     *
     * @param intents The intents to start.
     */
    void startActivities(Intent... intents);

    /**
     * Starts multiple activities.
     *
     * @param intents The intents to start.
     * @param options Additional options for how the activities should be started.
     */
    void startActivities(Intent[] intents, Bundle options);
}
