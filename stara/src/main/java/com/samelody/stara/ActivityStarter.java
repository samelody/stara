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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * The activity starter to start activities.
 *
 * @author Belin Wu
 */
class ActivityStarter extends AbstractStarter<Activity> {

    public ActivityStarter(Activity starter) {
        super(starter);
    }

    @Override
    protected void startActivity(Activity starter, Intent intent, int requestCode, Bundle options) {
        ActivityCompat.startActivityForResult(starter, intent, requestCode, options);
    }

    @Override
    protected void startActivities(Activity starter, Intent[] intents, Bundle options) {
        ActivityCompat.startActivities(starter, intents, options);
    }
}
