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
import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * The class represents this library.
 *
 * @author Belin Wu
 */
public final class Stara {

    /**
     * The request code that represents no result.
     */
    static final int NO_RESULT = -1;

    /**
     * Private constructor.
     */
    private Stara() {
    }

    /**
     * Creates a new context starter.
     *
     * @param context The context to start activities
     * @return The context starter
     */
    public static Starter starter(Context context) {
        return new ContextStarter(context);
    }

    /**
     * Creates a new activity starter.
     *
     * @param activity The activity to start activity
     * @return The activity starter
     */
    public static Starter starter(Activity activity) {
        return new ActivityStarter(activity);
    }

    /**
     * Creates a fragment starter.
     *
     * @param fragment The fragment to start activity
     * @return The fragment starter
     */
    public static Starter starter(Fragment fragment) {
        return new FragmentStarter(fragment);
    }
}
