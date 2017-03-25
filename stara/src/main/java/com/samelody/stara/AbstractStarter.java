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

import java.lang.ref.WeakReference;

import static com.samelody.stara.Stara.NO_RESULT;

/**
 * The abstract implementation of the {@link Starter} interface.
 *
 * @author Belin Wu
 */
public abstract class AbstractStarter<T> implements Starter {

    /**
     * The weak reference of the real starter.
     */
    private WeakReference<T> reference;

    public AbstractStarter(T starter) {
        reference = new WeakReference<>(starter);
    }

    @Override
    public final void startActivity(Intent intent) {
        startActivityForResult(intent, NO_RESULT, null);
    }

    @Override
    public final void startActivity(Intent intent, Bundle options) {
        startActivityForResult(intent, NO_RESULT, options);
    }

    @Override
    public final void startActivityForResult(Intent intent, int requestCode) {
        startActivityForResult(intent, requestCode, null);
    }

    @Override
    public final void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        T starter = reference.get();
        if (starter != null) {
            startActivity(starter, intent, requestCode, options);
        }
    }

    @Override
    public final void startActivities(Intent... intents) {
        startActivities(intents, null);
    }

    @Override
    public final void startActivities(Intent[] intents, Bundle options) {
        T starter = reference.get();
        if (starter != null) {
            startActivities(starter, intents, options);
        }
    }

    /**
     * Starts the activity for result.
     *
     * @param starter     The starter to start activity
     * @param intent      The intent to start
     * @param requestCode The request code for result
     * @param options     Additional options for how the Activity should be started
     */
    protected abstract void startActivity(T starter, Intent intent, int requestCode, Bundle options);

    /**
     * Starts the multiple activities.
     *
     * @param starter The starter to start activity
     * @param intents The intents to start
     * @param options Additional options for how the Activity should be started
     */
    protected abstract void startActivities(T starter, Intent[] intents, Bundle options);
}
